plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.hilt.android)
    alias(libs.plugins.navigation.safeargs)
    alias(libs.plugins.kotlin.parcelize)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.fauzan.myanime"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.fauzan.myanime"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    signingConfigs {
        create("release") {
            val keystorePath = System.getenv("CM_KEYSTORE_PATH") ?: (findProperty("KEYSTORE_PATH") as? String)
            val keystorePassword = System.getenv("CM_KEYSTORE_PASSWORD") ?: (findProperty("KEYSTORE_PASSWORD") as? String) ?: ""
            val resolvedKeyAlias = System.getenv("CM_KEY_ALIAS") ?: (findProperty("KEY_ALIAS") as? String) ?: ""
            val resolvedKeyPassword = System.getenv("CM_KEY_PASSWORD") ?: (findProperty("KEY_PASSWORD") as? String) ?: ""

            if (keystorePath != null) storeFile = file(keystorePath)
            storePassword = keystorePassword
            keyAlias = resolvedKeyAlias
            keyPassword = resolvedKeyPassword
        }
    }

    buildTypes {
        debug {
            isDebuggable = false
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        release {
            isMinifyEnabled = true
            isShrinkResources = true
            signingConfig = signingConfigs.getByName("release")
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
    dynamicFeatures += ":favorite"
}

dependencies {
    implementation(project(":core"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.recyclerview)
    implementation(libs.androidx.swiperefresh)

    // Lifecycle
    implementation(libs.lifecycle.viewmodel)
    implementation(libs.lifecycle.runtime)

    // Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.android.compiler)
    ksp(libs.hilt.compiler)

    // Navigation
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.navigation.dynamic.features)

    // Paging 3
    implementation(libs.paging.runtime)

    // Coroutines
    implementation(libs.coroutines.android)

    // Coil
    implementation(libs.coil)

    // Arrow (used directly in ViewModels via Either)
    implementation(libs.arrow.core)

    debugImplementation(libs.leakcanary)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}
