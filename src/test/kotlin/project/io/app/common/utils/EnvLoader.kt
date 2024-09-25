package project.io.app.common.utils

import java.io.File
import java.util.Properties

object EnvLoader {
    fun loadEnv() {
        val envFile = File(".env")
        if (envFile.exists()) {
            val properties = Properties()
            envFile.bufferedReader().use { reader -> properties.load(reader) }
            properties.forEach { key, value ->
                System.setProperty(key as String, value as String)
            }
        }
    }
}
