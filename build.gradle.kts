plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.hilt.android) apply false
    alias(libs.plugins.navigation.safeargs) apply false
    id("org.jetbrains.kotlin.kapt") version "2.0.21" apply false
    alias(libs.plugins.kotlin.parcelize) apply false
}
