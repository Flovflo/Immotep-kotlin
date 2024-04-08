
## Versions SDK

- `compileSdkVersion`: 31
- `buildToolsVersion`: "30.0.1"
- `minSdkVersion`: 23
- `targetSdkVersion`: 31

## Bibliothèques

- **Retrofit**: Utilisé pour les appels d'API REST. Plus d'informations disponibles sur [le site de Retrofit](https://square.github.io/retrofit/).
- **Glide**: Pour le chargement et la mise en cache d'images. Plus d'informations disponibles sur [le GitHub de Glide](https://github.com/bumptech/glide).
- **Material Design Components**: Les derniers composants Material de Google. Plus d'informations disponibles sur [le site de Material Design](https://material.io/develop/android).
- **Koin**: Pour l'injection de dépendances. Plus d'informations disponibles sur [le site de Koin](https://insert-koin.io/).

## Structure du Package

```
├── appcomponents
│   ├── di                 - Composants d'Injection de Dépendances
│   │   └── MyApp.kt
│   ├── network            - Configuration des appels API REST
│   │   ├── ResponseCode.kt
│   │   └── RetrofitProvider.kt
│   └── ui                 - Utilitaires de Liaison de Données
│       └── CustomBindingAdapter.kt
├── constants             - Fichiers de Constantes
│   ├── IntegerConstants.kt
│   └── StringConstants.kt
├── extensions            - Fichiers de Fonctions d'Extension Kotlin
│   └── Strings.kt
├── modules               - Code spécifique à l'application
│   └── example           - Un module de l'application
│       ├── ui            - Classes de gestion de l'UI
│       └── data          - Classes de gestion des données
│           ├── viewmodel - ViewModels pour l'UI
│           └── model     - Modèle pour l'UI
└── network               - Configuration de l'API REST
    ├── models            - Modèles de requête/réponse
    ├── repository        - Répertoire réseau
    ├── resources         - Classes communes pour l'API
    └── RetrofitService.kt
```
