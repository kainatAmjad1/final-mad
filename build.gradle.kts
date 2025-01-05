plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.zomato"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.zomato"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Android Core Libraries
    implementation("androidx.appcompat:appcompat:1.6.1") // Ensure appcompat is included
    implementation(libs.androidx.core.ktx) // Kotlin extensions for Android core
    implementation(libs.androidx.lifecycle.runtime.ktx) // Lifecycle runtime with Kotlin support

    // Jetpack Compose Libraries
    implementation(libs.androidx.activity.compose) // Activity support for Jetpack Compose
    implementation(platform(libs.androidx.compose.bom)) // Bill of materials for Compose
    implementation(libs.androidx.ui) // Jetpack Compose UI
    implementation(libs.androidx.ui.graphics) // Jetpack Compose Graphics
    implementation(libs.androidx.ui.tooling.preview) // Preview tooling for Compose

    // Material Design Libraries
    implementation(libs.androidx.material3) // Material 3 library
    implementation("com.google.android.material:material:1.9.0") // Material Components for ShapeableImageView

    // Android UI Libraries
    implementation(libs.androidx.constraintlayout)
    implementation(libs.material)
    implementation(libs.androidx.activity) // Constraint layout for Android

    // Google Maps Dependencies
    implementation("com.google.android.gms:play-services-maps:18.0.2")
    implementation("com.google.android.gms:play-services-location:21.0.1")
    implementation(libs.androidx.recyclerview)

    // Testing Libraries
    testImplementation(libs.junit) // Unit testing with JUnit
    androidTestImplementation(libs.androidx.junit) // JUnit for Android instrumentation tests
    androidTestImplementation(libs.androidx.espresso.core) // Espresso for UI testing
    androidTestImplementation(platform(libs.androidx.compose.bom)) // BOM for Compose tests
    androidTestImplementation(libs.androidx.ui.test.junit4) // Compose testing with JUnit

    // Debugging Libraries
    debugImplementation(libs.androidx.ui.tooling) // Debugging tools for Compose
    debugImplementation(libs.androidx.ui.test.manifest) // Testing manifest for UI testing

    // Glide for Rounded Image Loading
    implementation(libs.roundedimageview)
    implementation(libs.androidx.cardview)

    // Material Components for Rounded Corners and ShapeableImageView
    implementation(libs.google.material.v190)
}
