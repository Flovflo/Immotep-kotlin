SDK Versions

compileSdkVersion 31

buildToolsVersion "30.0.1"

minSdkVersion 23

targetSdkVersion 31

Libraries

Retrofit- REST API Call https://square.github.io/retrofit/
Glide - Image Loading and caching. https://github.com/bumptech/glide
Material Design Components - Google's latest Material Components. https://material.io/develop/android
koin - Dependency Injection https://insert-koin.io/
App Navigation

Check your app's UI from the AppNavigation screens of your app.

Package Structure


├── appcomponents
│ ├── di                 - Dependency Injection Components
│ │ └── MyApp.kt
│ ├── network            - REST API Call setup
│ │ ├── ResponseCode.kt
│ │ └── RetrofitProvider.kt
│ └── ui                 - Data Binding Utilities
│     └── CustomBindingAdapter.kt
├── constants            - Constant Files
│ ├── IntegerConstants.kt
│ └── StringConstants.kt
├── extensions           - Kotlin Extension Function Files
│ └── Strings.kt
├── modules              - Application Specific code
│ └── example            - A module of Application
│  ├── ui                - UI handling classes
│  └── data              - Data Handling classes
│    ├── viewmodel       - ViewModels for the UI
│    └── model           - Model for the UI
└── network              - REST API setup
├── models             - Request/Response Models
├── repository         - Network repository
├── resources          - Common classes for API
└── RetrofitService.kt
  
