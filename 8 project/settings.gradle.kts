pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }

        }
        mavenCentral()
        maven {
            url ("https://jcenter.bintray.com")
        }
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url ("https://jcenter.bintray.com")
        }
    }
}

rootProject.name = "AnimationTwo"
include("app").invoke {
    // Some configuration
}

