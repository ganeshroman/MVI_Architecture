# MVI Architecture


## Summary
- **Summary:**  MVI Architecture Android
- **Created Date:** 5 July 2023
- **Last modified:** 5 July 2023 

## Feature
- Retrieve and display a list of items from a RESTful API (https://5e510330f2c0d300147c034c.mockapi.io/).


### Technology Used
- Kotlin
- MVVM
- Retrofit
- Coroutine
- View Binding
- RecyclerView
- Live Data
- Constraint Layout

### Backend Details

- **Webservice** : https://5e510330f2c0d300147c034c.mockapi.io/users


#### Example Model


```
{
        "id": 1,
        "name": "Roman",
        "email": "rpenburton0@yellowbook.com",
        "avatar": "https://dummyimage.com/100x100.png/5fa2dd/ffffff"
    }

```

```
data class User(
    @Json(name = "id")
    val id: Int = 0,

    @Json(name = "name")
    val name: String = "",

    @Json(name = "email")
    val email: String = "",

    @Json(name = "avatar")
    val avatar: String = ""
)
```

- **Library Imports**
  
```
def lifecycle_version = "2.2.0"

    implementation 'androidx.constraintlayout:constraintlayout:1.1.3'

    // Added Dependencies
    implementation "androidx.recyclerview:recyclerview:1.1.0"
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.2.0'
    implementation 'com.github.bumptech.glide:glide:4.11.0'

//retrofit
    implementation 'com.squareup.retrofit2:retrofit:2.9.0'
    implementation "com.squareup.retrofit2:converter-moshi:2.6.2"

//Coroutine
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.6"
    implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.6"
    implementation 'androidx.appcompat:appcompat:1.6.1'

    
    implementation "androidx.lifecycle:lifecycle-viewmodel:$lifecycle_version"
    implementation "androidx.lifecycle:lifecycle-livedata:$lifecycle_version"

```


#### Project Structure



<img src="https://raw.githubusercontent.com/ganeshroman/MVI_Architecture/master/mvi_project_diagram.png" width="250" height="450">


#### Screenshots


<img src="https://raw.githubusercontent.com/ganeshroman/MVI_Architecture/master/Screenshot_20230705_132217.png" width="250" height="450">



