plugins {
    id("com.android.application")
    kotlin("android")
    id("kotlin-kapt")
}

android {
    defaultConfig {
        applicationId = ConfigurationData.applicationId
    }
}

dependencies {
    implementation(project(Modules.componentManager))
    implementation(project(":core_module"))
    implementation(project(":my_module_api"))
    implementation(project(":my_module"))
    implementation(project(":authorization"))
    implementation(project(":authorization_api"))
    // Core
    implementation(Libraries.appCompat)
    implementation(Libraries.coreKtx)

    // Design
    implementation(Libraries.material)
    implementation(Libraries.constraintLayout)

    // Test
    testImplementation(Libraries.junit)
    androidTestImplementation(Libraries.junitTest)

    // DI
    implementation(Libraries.implementationDagger)
    kapt(Libraries.kaptDagger)
}