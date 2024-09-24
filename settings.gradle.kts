pluginManagement {
    val kotlinVersion: String by settings
    val kaptVersion: String by settings
    val springBootVersion: String by settings
    val springDependencyManagementVersion: String by settings
    val jpaVersion: String by settings
    resolutionStrategy {
        eachPlugin {
            when (requested.id.id) {
                "org.jetbrains.kotlin.jvm" -> useVersion(kotlinVersion)
                "org.jetbrains.kotlin.kapt" -> useVersion(kaptVersion)
                "org.jetbrains.kotlin.plugin.noarg" -> useVersion(kaptVersion)
                "org.jetbrains.kotlin.plugin.spring" -> useVersion(kotlinVersion)
                "org.springframework.boot" -> useVersion(springBootVersion)
                "io.spring.dependency-management" -> useVersion(springDependencyManagementVersion)
                "org.jetbrains.kotlin.plugin.jpa" -> useVersion(jpaVersion)
            }
        }
    }
}
rootProject.name = "java-time"
