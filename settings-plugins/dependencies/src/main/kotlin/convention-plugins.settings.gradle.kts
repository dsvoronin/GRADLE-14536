pluginManagement {
    repositories {
        exclusiveContent {
            forRepository {
                gradlePluginPortal()
            }
            filter {
                // !!!! Fails with
                // Cannot mutate content repository descriptor 'Gradle Central Plugin Repository' after repository has been used
                includeGroup("org")
            }
        }
    }
}
