package fuzs.geodecraft.common.client.renderer.blockentity;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.client.renderer.entity.state.ItemClusterRenderState;
import org.jspecify.annotations.Nullable;

public class PedestalRenderState extends BlockEntityRenderState {
    public float rotation;
    public @Nullable ItemClusterRenderState displayItem;
}
