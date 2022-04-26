buildscript {

    repositories {
        google()
        mavenCentral()
        maven("https://plugins.gradle.org/m2/")
        maven("https://jitpack.io")
        jcenter()

    }
    dependencies {
        classpath(Classpath.gradle)
        classpath(Classpath.gradlePlugin)
        classpath(Classpath.navigationGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.20")
    }
}
allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        jcenter()
    }
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}