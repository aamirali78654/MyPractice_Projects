plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.animationtwo"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.animationtwo"
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
    //<<<----------lottie files incertation------------>>>


        implementation ("de.hdodenhof:circleimageview:3.1.0")

        implementation  ("com.airbnb.android:lottie:3.4.0")

    implementation ("com.airbnb.android:lottie:5.0.3")

        implementation ("com.example:animation-library:1.0.0")







}