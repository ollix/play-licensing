plugins {
    id("com.android.library")
}

android {
    enableKotlin = false
    namespace = "com.google.android.vending.licensing"
    compileSdk = 35
    defaultConfig {
        minSdk = 4
    }
    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
    buildFeatures {
        aidl = true
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
}
