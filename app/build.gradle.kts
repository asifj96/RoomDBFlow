plugins {
    id(Plugins.androidApplication)
    id(Plugins.kotlinAndroid)
    id(Plugins.kotlinKapt)
    id(Plugins.kotlinExtensions)
    id("org.jetbrains.kotlin.android")
    id(Plugins.navigationSafeArgs)

}
android {
    compileSdk = Versions.compileSdk

    defaultConfig {
        applicationId = "com.best.busscedularapp"
        minSdk = Versions.minSdk
        targetSdk = Versions.targetSdk
        versionCode = Versions.versionCode
        versionName = Versions.versionName
        multiDexEnabled = true
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            isShrinkResources = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro")
        }
        getByName("debug") {
            isMinifyEnabled = false
            isShrinkResources = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    tasks.withType < org.jetbrains.kotlin.gradle.tasks.KotlinCompile > ().configureEach {
        kotlinOptions {
            jvmTarget = Versions.jvmTarget
        }
    }

    buildFeatures {
        dataBinding = true
    }
}
dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    // Android
    implementation(Android.coreKtx)
    implementation(Android.appCompat)
    implementation(Android.materialDesign)
    implementation(Android.constraintLayout)
    implementation(Android.multiDex)
    implementation(Android.sdp)
    implementation(Android.ssp)
    implementation(Android.recyclerView)
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    kapt(Android.dataBindingCompiler)
    testImplementation(Android.junit)
    androidTestImplementation(Android.junitTest)
    androidTestImplementation(Android.espressoCore)

    // Coroutine
    implementation(Coroutine.core)
    implementation(Coroutine.android)

    // LifeCycle
    implementation(LifeCycle.viewmodelKtx)
    implementation(LifeCycle.livedataKtx)
    implementation(LifeCycle.lifecycleExtensions)
    implementation(LifeCycle.runtimeKtx)

    // Room
    implementation(Room.roomRuntime)
    kapt(Room.roomCompiler)
    implementation(Room.roomKtx)

    implementation(Android.fragmentKtx)
    implementation(Android.activityKtx)

    // Navigation
    implementation(Navigation.fragmentKtx)
    implementation(Navigation.uiKtx)
}
kapt {
    correctErrorTypes = true
}