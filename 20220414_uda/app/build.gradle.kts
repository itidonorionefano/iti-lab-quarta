plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.github.java-native:jssc:2.9.4")
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnit("4.13.2")
        }
    }
}

application {
    mainClass.set("iti.quarta.uda.App")
}
