plugins {
    id("com.android.library")
    kotlin("android")

}

android {
    compileSdk = ConfigurationData.compileSdk
}

dependencies {
    implementation(Libraries.appCompat)
}