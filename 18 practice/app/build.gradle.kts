plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.glide_and_picasso"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.glide_and_picasso"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    //==========picasso gradle file=============>>>
    implementation ("com.squareup.picasso:picasso:2.8")
}