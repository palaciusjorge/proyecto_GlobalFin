# App Móvil GlobalFin (Flutter)

Aplicación para clientes finales (iOS/Android) con interfaz intuitiva, microinteracciones fluidas y accesibilidad integrada.

## 📱 Requisitos

- **Flutter**: 3.10.0 o superior
- **Dart**: 3.1.0 o superior
- **Android**: minSdk 21, targetSdk 34
- **iOS**: 12.0 o superior
- **IDEs**: Android Studio, Xcode, VS Code + Dart extension

## 🚀 Quick Start

### Instalación de dependencias
```bash
cd mobile-app
flutter pub get
```

### Ejecutar en desarrollo (hot-reload)
```bash
# Android
flutter run -d <device-id> --flavor dev

# iOS
flutter run -d <device-id> --flavor dev

# Web (preview)
flutter run -d chrome
```

### Listar dispositivos disponibles
```bash
flutter devices
```

## 🛠️ Build para producción

### Android
```bash
# Debug build
flutter build apk --flavor prod

# Release build (optimizado)
flutter build apk --release --flavor prod

# App Bundle (para Play Store)
flutter build appbundle --release --flavor prod
```

### iOS
```bash
# Debug build
flutter build ios --flavor prod

# Release build
flutter build ipa --release --flavor prod
```

## 📁 Estructura del proyecto

```
mobile-app/
├── lib/
│   ├── main.dart                    # Entry point
│   ├── config/
│   │   ├── router.dart              # go_router setup
│   │   └── theme.dart               # Material 3 + tokens
│   ├── models/                      # DTOs + entities
│   │   ├── user.dart
│   │   └── transaction.dart
│   ├── bloc/                        # State management
│   │   ├── app_bloc.dart
│   │   ├── auth_bloc.dart
│   │   └── transaction_bloc.dart
│   ├── repositories/                # Data layer
│   │   ├── auth_repository.dart
│   │   └── transaction_repository.dart
│   ├── services/                    # API & externals
│   │   └── api_client.dart
│   ├── screens/                     # UI Screens
│   │   ├── login/
│   │   ├── home/
│   │   ├── transactions/
│   │   └── profile/
│   └── widgets/                     # Reusable components
│       ├── buttons.dart
│       ├── inputs.dart
│       └── animations.dart
│
├── test/
│   ├── bloc/                        # BLoC tests
│   ├── repositories/                # Repository tests
│   └── integration/                 # E2E tests
│
├── android/                         # Configuración Android
│   ├── app/
│   │   ├── build.gradle
│   │   └── src/main/AndroidManifest.xml
│   └── gradle.properties
│
├── ios/                             # Configuración iOS
│   ├── Podfile
│   ├── Podfile.lock
│   └── Runner.xcodeproj/
│
├── pubspec.yaml                     # Dependencias
├── analysis_options.yaml            # Linting
└── README.md                        # Este archivo
```

## 🎨 Temas y Material 3

Tokens y temas configurados en `lib/config/theme.dart`:

- Soporta Light y Dark mode automático (seguir sistema)
- Colores corporativos: azul primario (#1F77D2)
- Tipografía: Roboto variable
- Iconografía: Material Icons

Cambiar tema dinámicamente:
```dart
context.read<AppBloc>().add(ToggleThemeEvent());
```

## ⚙️ Configuration

### Variables de entorno
Crear archivos `.env.dev` y `.env.prod`:

```env
API_BASE_URL=https://api.dev.globalfin.com
API_TIMEOUT=30000
LOG_LEVEL=debug
FEATURE_FLAGS=auth,transactions,profile
```

Cargar en `main.dart`:
```dart
await dotenv.load(fileName: '.env.${flavor}.env');
```

## 🧪 Testing

### Unit tests
```bash
flutter test test/bloc/
flutter test test/repositories/
```

### Widget tests
```bash
flutter test test/widgets/
```

### Integration tests
```bash
flutter test integration_test/
```

### Con coverage
```bash
flutter test --coverage
# Visualizar: lcov --list coverage/lcov.info
```

## ♿ Accesibilidad (WCAG AA)

- ✅ Semantics integradas (TalkBack/VoiceOver)
- ✅ Tamaño táctil mínimo 48x48 dp
- ✅ Contraste mínimo 4.5:1
- ✅ Soporte escalado de texto dinámico
- ✅ Focus navigation por teclado
- ✅ Reducir animaciones respeta accessibility settings

Validar con:
```bash
flutter run --enable-asserts
# En device: Settings > Accessibility > TalkBack/VoiceOver
```

## 🔐 Security

- Tokens JWT guardados en plugin `flutter_secure_storage`
- Certificado pinning en HTTP client
- No grabar datos sensibles en logs
- Proguard/minification automático en builds release

## 📊 Performance

- State management con Bloc: eficiente y predecible
- Lazy loading de listas (ListView.builder)
- Caché con Hive para datos locales
- Imágenes optimizadas y en caché

Monitorear con DevTools:
```bash
flutter pub global activate devtools
devtools
```

## 🚀 Deployment

### Play Store (Android)
1. Firmar APK/AAB con keystore
2. Subir a Play Console
3. Completar descripción, privacidad y screenshots
4. Enviar a review

Pasos detallados: [build-guide.md](../../docs/05-mobile/build-guide.md)

### App Store (iOS)
1. Crear App ID en Apple Developer
2. Configurar provisioning profiles
3. Build y sign con Xcode/fastlane
4. Subir a TestFlight primero
5. Enviar a review

Pasos detallados: [build-guide.md](../../docs/05-mobile/build-guide.md)

## 🐛 Troubleshooting

### Flutter version mismatch
```bash
flutter upgrade
flutter pub get
```

### Pods no sincronizados (iOS)
```bash
cd ios
rm Podfile.lock
pod install
cd ..
flutter clean && flutter pub get
```

### Permisos no funcionan (Android)
Verificar `android/app/src/main/AndroidManifest.xml`:
```xml
<uses-permission android:name="android.permission.INTERNET" />
<uses-permission android:name="android.permission.CAMERA" />
```

## 📚 Documentación adicional

- [ADR - Arquitectura Mobile](../../docs/01-tech-selection/adr-mobile-architecture.md)
- [Accessibility Audit](../../docs/05-mobile/accessibility-audit.md)
- [Build Guide iOS/Android](../../docs/05-mobile/build-guide.md)
- [Design Handbook](../../design/02-high-fidelity/DESIGN_HANDBOOK.md)

## 📞 Support

- Issues: GitHub Issues
- Flutter Docs: https://flutter.dev/docs
- Material Design 3: https://m3.material.io

---

**Última actualización**: 2026-03-01  
**Versión**: 0.1.0+1
