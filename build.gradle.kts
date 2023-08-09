plugins {
    id("com.android.application") version Versions.classpathGradleVersion apply false
    id("com.android.library") version Versions.classpathGradleVersion apply false
    kotlin("android") version Versions.kotlinVersion apply false
}

//For all subprojects - generate compileSdkVersion, minSdkVersion, targetSdkVersion, Java compatibility etc.
subprojects {
    afterEvaluate {
        configure<com.android.build.gradle.BaseExtension> {
            compileSdkVersion(ConfigurationData.compileSdk)

            defaultConfig {
                minSdk = ConfigurationData.minSdk
                targetSdk = ConfigurationData.targetSdk
                targetSdk = ConfigurationData.targetSdk
                versionCode = ConfigurationData.versionCode
                versionName = ConfigurationData.versionName
                testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
            }

            buildTypes {
                getByName("release") {
                    isMinifyEnabled = false
                    proguardFiles(
                        getDefaultProguardFile("proguard-android-optimize.txt"),
                        file("proguard-rules.pro")
                    )
                }
            }

            compileOptions {
                targetCompatibility = JavaVersion.VERSION_17
                sourceCompatibility = JavaVersion.VERSION_17
            }
        }
    }
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "17"
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
