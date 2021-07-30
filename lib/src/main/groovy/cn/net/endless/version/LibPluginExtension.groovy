package cn.net.endless.version

public class LibPluginExtension {

    //Lifecycle KTX
    String ktxLifecycleVersion = '2.4.0-alpha02'
    String ktxNavigationVersion = '2.3.5'
    //test
    String mockitoVersion = '3.3.3'
    String junitVersion = '4.13.2'
    String robolectricVersion = '4.5.1'
    String espressoVersion = '3.3.0'
    //room
    String roomVersion = '2.3.0'
    //协程
    String coroutinesVersion = '1.4.2'
    //hilt
    String hiltVersion = '1.0.0-alpha03'
    //阿里路由
    String aRouterVersion = '1.5.1'
    //androidx
    String appCompactVersion = '1.2.0'
    String constraintLayoutVersion = '2.0.4'
    //kotlin
    String kotlinVersion = '1.4.31'
    String materialVersion = '1.3.0'

    String glideVersion = '4.12.0'

    void ktxCore() {
        BasePlugin.mProject.dependencies {
            implementation "androidx.core:core-ktx:1.6.0"
        }
    }
    //扩展程序包含在Android 的节省内存的集合库中使用的实用函数
    void ktxCollection() {
        BasePlugin.mProject.dependencies {
            implementation "androidx.collection:collection-ktx:1.2.0-alpha01"
        }
    }

    void mvvm() {
        BasePlugin.mProject.dependencies {
            implementation "androidx.lifecycle:lifecycle-runtime-ktx:$ktxLifecycleVersion"
            implementation "androidx.lifecycle:lifecycle-livedata-ktx:$ktxLifecycleVersion"
            implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$ktxLifecycleVersion"
            //Fragment KTX
            implementation "androidx.fragment:fragment-ktx:1.3.6"
        }
    }

    void ktxNavigation() {
        BasePlugin.mProject.dependencies {
            implementation "androidx.navigation:navigation-runtime-ktx:$ktxNavigationVersion"
            implementation "androidx.navigation:navigation-fragment-ktx:$ktxNavigationVersion"
            implementation "androidx.navigation:navigation-ui-ktx:$ktxNavigationVersion"
        }
    }

    void test() {
        BasePlugin.mProject.dependencies {
            testImplementation "junit:junit:$junitVersion"
            testImplementation "org.mockito:mockito-inline:$mockitoVersion"
            testImplementation "android.arch.core:core-testing:1.1.1"
            testImplementation "com.google.truth:truth:1.0.1"
            testImplementation 'com.tngtech.archunit:archunit-junit4:0.15.0'
            testImplementation "org.robolectric:robolectric:$robolectricVersion"
            testImplementation 'androidx.test:core:1.3.0'
            testImplementation 'androidx.test.ext:junit:1.1.2'
            testImplementation "androidx.test.espresso:espresso-core:$espressoVersion"
            testImplementation "androidx.test.espresso:espresso-intents:$espressoVersion"
            debugImplementation "androidx.fragment:fragment-testing:1.3.1"
        }
    }

    void room() {
        BasePlugin.mProject.dependencies {
            implementation "androidx.room:room-runtime:$roomVersion"
            implementation "androidx.room:room-ktx:$roomVersion"
            kapt "androidx.room:room-compiler:$roomVersion"
            testImplementation "androidx.room:room-testing:$roomVersion"
        }
    }

    void coroutines() {
        BasePlugin.mProject.dependencies {
            implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion"
            implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
            testImplementation "org.jetbrains.kotlinx:kotlinx-coroutines-test:1.3.3"
        }
    }

    void hilt() {
        BasePlugin.mProject.dependencies {
            implementation "androidx.hilt:hilt-lifecycle-viewmodel:$hiltVersion"
            kapt "androidx.hilt:hilt-compiler:$hiltVersion"
        }
    }

    void router() {
        BasePlugin.mProject.dependencies {
            implementation "com.alibaba:arouter-api:$aRouterVersion"
            kapt "com.alibaba:arouter-compiler:$aRouterVersion"
        }
    }

    void appCompact() {
        BasePlugin.mProject.dependencies {
            implementation "androidx.appcompat:appcompat:$appCompactVersion"
        }
    }

    void material() {
        BasePlugin.mProject.dependencies {
            implementation "com.google.android.material:material:$materialVersion"
        }
    }

    void constraintLayout() {
        BasePlugin.mProject.dependencies {
            implementation "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
        }
    }

    void kotlin() {
        BasePlugin.mProject.dependencies {
            implementation "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"
        }
    }

    void http() {
        BasePlugin.mProject.dependencies {
            implementation "com.squareup.okhttp3:okhttp:4.9.1"
        }
    }

    void glide() {
        BasePlugin.mProject.dependencies {
            implementation "com.github.bumptech.glide:glide:$glideVersion"
            implementation "com.github.bumptech.glide:compiler:$glideVersion"
            implementation "com.github.bumptech.glide:okhttp3-integration:$glideVersion"
        }
    }

}