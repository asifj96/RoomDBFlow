pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        jcenter()
    }
    // allows the plugins syntax to be used with the android gradle plugin
    resolutionStrategy.eachPlugin {
        if (requested.id.id == "com.android.application") {
            useModule("com.android.tools.build:gradle:${requested.version}")
        }
    }
}
/*dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}*/
rootProject.name = "RoomDBFlow"
include(":app")
