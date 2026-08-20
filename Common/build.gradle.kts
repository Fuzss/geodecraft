plugins {
    id("fuzs.multiloader.multiloader-convention-plugins-common")
}

dependencies {
    modCompileOnlyApi(sharedLibs.puzzleslib.common)
}

spotless {
    // Prevent Gradle's check task from running spotlessCheck
    isEnforceCheck = false

    format("TrickyTrials") {
        target("src/main/java/**/*.java")

        replaceRegex(
            "Update @Nullable import",
            "\\bimport\\s+javax\\.annotation\\.Nullable;",
            "import org.jetbrains.annotations.Nullable;"
        )
    }
}
