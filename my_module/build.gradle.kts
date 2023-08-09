plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

dependencies {
    implementation(project(Modules.componentManager))
    implementation(project(":core_module"))
    //api
    implementation(project(":my_module_api"))
    implementation(project(":authorization_api"))
    //deps
    implementation("androidx.core:core-ktx:1.8.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    // DI
    implementation(Libraries.implementationDagger)
    kapt(Libraries.kaptDagger)
}