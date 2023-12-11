plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.testutil"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    lint {
        quiet = false
        abortOnError = true
        checkDependencies = true
        ignoreTestSources = true
        warningsAsErrors = true
        htmlReport = true
        textReport = false
        xmlReport = false

        // Disabled for the outdated version of paparazzi below
        disable += setOf("GradleDependency")
    }
}

dependencies {
    // Version the TrustAllX509TrustManager error was first detected
    implementation("app.cash.paparazzi:paparazzi:1.2.0")
}
