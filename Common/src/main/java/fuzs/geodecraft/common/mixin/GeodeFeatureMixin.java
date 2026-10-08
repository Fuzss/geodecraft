package fuzs.geodecraft.common.mixin;

import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.feature.GeodeFeature;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.Slice;

import java.util.function.Predicate;

@Mixin(GeodeFeature.class)
abstract class GeodeFeatureMixin {
    @ModifyArg(method = "place",
               at = @At(value = "INVOKE",
                        target = "Lnet/minecraft/world/level/levelgen/feature/GeodeFeature;safeSetBlock(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/function/Predicate;)V"),
               slice = @Slice(from = @At(value = "FIELD",
                                         target = "Lnet/minecraft/world/level/block/Blocks;AIR:Lnet/minecraft/world/level/block/Block;",
                                         opcode = Opcodes.GETSTATIC),
                              to = @At(value = "INVOKE",
                                       target = "Lnet/minecraft/world/level/WorldGenLevel;scheduleTick(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/material/Fluid;I)V")))
    public BlockState place(WorldGenLevel level, BlockPos pos, BlockState state, Predicate<BlockState> oldState, @Local(
            argsOnly = true) RandomSource random) {
        return this.blockSettings().fillingProvider().value().getState(level, random, pos);
    }

    @Shadow
    public abstract GeodeBlockSettings blockSettings();
}
