# 📋 Checklist Técnico — GlobalFin UI/UX Overhaul
**Fusión Banco Tradicional + Fintech | Proyecto Multi-Platform**

---

## 1️⃣ ANÁLISIS Y SELECCIÓN TECNOLÓGICA (40% evaluación)
**Duración estimada: 5 días | Hito: Tech Stack Document + Architecture ADRs**

### 1.1 Selección Dashboard B2B (JavaFX)
- [ ] **Investigación JavaFX vs .NET MAUI** (8h)
  - [ ] Benchmark: rendering performance con 10k+ filas en TableView
  - [ ] Análisis FXML+CSS separation vs XAML
  - [ ] Documentar atajos de teclado posibles (accelerators API)
  - [ ] Evaluar jlink + jpackage para distribución Windows/macOS
  - Entregable: `docs/01-tech-selection/javafx-vs-maui.md`

- [ ] **Definir Architecture Decision Record (ADR)** (4h)
  - [ ] Patrón elegido: MVVM o MVC con JavaFX
  - [ ] Capas: Model (entities), View (FXML), ViewModel/Controller (lógica presentación)
  - [ ] Binding strategy: Property<T>, ObservableList<T> para dos vías
  - Entregable: `docs/01-tech-selection/adr-javafx-architecture.md`

- [ ] **Setup inicial JavaFX + Maven/Gradle** (6h)
  - [ ] Crear módulo `dashboard-desktop/` con estructura base
  - [ ] Configurar pom.xml con javafx-maven-plugin
  - [ ] Template FXML base + CSS reset
  - [ ] Atajos globales y key-event handlers en App principal
  - Entregable: `dashboard-desktop/pom.xml`, `src/main/resources/fxml/App.fxml`

### 1.2 Selección App Móvil B2C (Flutter vs React Native)
- [ ] **Investigación Flutter vs React Native** (12h)
  - [ ] Performance profiling: gesture handling, animaciones con 60+ fps
  - [ ] Ecosystem comparison: Firebase, pagos, biometría
  - [ ] Time-to-market: hot-reload vs metro bundler
  - [ ] SDKs: iOS/Android, permissions, nativos (Bluetooth, NFC)
  - [ ] Accesibilidad móvil (Semantics, TalkBack, VoiceOver)
  - Entregable: `docs/01-tech-selection/flutter-vs-react-native.md`

- [ ] **Definir ADR para arquitectura móvil** (6h)
  - [ ] Patrón elegido: Bloc + Repository (Flutter) o Redux/MobX (RN)
  - [ ] Separación layers: UI, BLoC/State, Repository, API
  - [ ] Inyección de dependencias (GetIt, Riverpod, Provider)
  - Entregable: `docs/01-tech-selection/adr-mobile-architecture.md`

- [ ] **Setup inicial Flutter** (8h)
  - [ ] Crear `mobile-app/` con flutter create
  - [ ] Versioning: Target iOS 12+, Android 21+ (API)
  - [ ] Configurar pubspec.yaml (dependencies: flutter, http, bloc, etc.)
  - [ ] Template screen + App entrypoint
  - [ ] Bloc structure base: event, state, bloc
  - Entregable: `mobile-app/pubspec.yaml`, `lib/main.dart`, `lib/bloc/app_bloc.dart`

---

## 2️⃣ METODOLOGÍA UI/UX Y PROTOTIPADO (30% evaluación)
**Duración estimada: 10 días | Hito: Wireframes + High-Fidelity Kit + Interactive Prototype**

### 2.1 FASE 1 — Low-Fidelity (Wireframes)
- [ ] **Mapeo de flujos de usuario** (6h)
  - [ ] User journey: Dashboard B2B (login → tabla → detalle → acción)
  - [ ] User journey: App móvil (onboarding → home → transacción → confirmación)
  - [ ] Identificar screens críticos, modales y estados vacíos
  - Entregable: `design/01-low-fidelity/user-flows.png`

- [ ] **Wireframes B/N — Dashboard** (12h)
  - [ ] Screen principal: top bar (app-name + menu + search), side nav, tabla principal, toolbar
  - [ ] Modal detalle: información de entidad, acciones inline, validación
  - [ ] Filtros avanzados: chips, date range, multi-select
  - [ ] Estado error/empty, loading skeleton
  - [ ] Keyboard shortcuts legend
  - Entregable: `design/01-low-fidelity/dashboard-wireframes.figma` (PDF export)

- [ ] **Wireframes B/N — App móvil** (10h)
  - [ ] Onboarding (splash, login, register)
  - [ ] Home: resumen, lista de transacciones, CTA primaria
  - [ ] Transacción: form, validación, confirmación
  - [ ] Perfil: datos, logout
  - [ ] Bottom navigation y tab focus indicators
  - Entregable: `design/01-low-fidelity/mobile-wireframes.figma` (PDF export)

- [ ] **Validación con stakeholders** (4h)
  - [ ] Presentar wireframes a PMs y usuarios piloto
  - [ ] Recoger feedback sobre flujos, atajos, ubicación de elementos
  - [ ] Iterar si es necesario
  - Entregable: `design/01-low-fidelity/feedback-log.md`

### 2.2 FASE 2 — High-Fidelity (Diseño visual + Tokens)
- [ ] **Material Theme Builder + Token System** (8h)
  - [ ] Definir paleta de colores corporativos en Material 3
  - [ ] Tipografía: familia, escala (12px → 48px), line-height, letter-spacing
  - [ ] Spacing system: 4px grid, margenes (2x, 4x, 8x, 12x unidades)
  - [ ] Elevación/shadows (material elevation)
  - [ ] Radius (corners): 2px (tight), 4px (default), 12px (large)
  - [ ] Generar tokens JSON y CSS variables
  - Entregable: `design/02-high-fidelity/tokens.json`, `design/02-high-fidelity/tokens.css`

- [ ] **Componentes atómicos en Figma** (14h)
  - [ ] **Base**: Button (primary, secondary, text, disabled), Input, Checkbox, Radio, Toggle
  - [ ] **Tabla**: Headers, rows, hover/selected, sortable icons, virtualized list indicator
  - [ ] **Filtros**: Chip, DatePicker, MultiSelect, SearchBar
  - [ ] **Modales**: Dialog, BottomSheet, Snackbar, Toast
  - [ ] **Toolbar**: AppBar, contextual menu, burger menu, status indicators
  - [ ] **Móvil específico**: BottomNavigation, TabBar, FAB, BottomSheet (full-height)
  - Entregable: `design/02-high-fidelity/globalfin-design-system.figma`

- [ ] **Especificación de Accesibilidad (a11y)** (6h)
  - [ ] Validación WCAG AA: contraste mínimo 4.5:1 (texto), 3:1 (gráficos)
  - [ ] Focus indicators: color claro, ancho >= 2px, visible sin mouse
  - [ ] Etiquetas semánticas: aria-labels en Figma (especificaciones para dev)
  - [ ] Responsive text scaling: 16px base mobile, 14px base desktop
  - [ ] Checklist: keyboard navigation (Tab order), lectores pantalla, dark mode
  - Entregable: `design/02-high-fidelity/accessibility-audit.md`

- [ ] **Spec de Atajos de Teclado** (4h)
  - [ ] Dashboard shortcuts: Ctrl+S (guardar/enviar), Ctrl+N (nueva entidad), Ctrl+L (limpiar filtros), Alt+H (help), Esc (cerrar modal)
  - [ ] Tabla: Arrows (navegar), Enter (editar/abrir), Space (select), Ctrl+A (select all)
  - [ ] Prioridades: conflictos con OS/navegador, documentar excepciones
  - Entregable: `design/02-high-fidelity/keyboard-shortcuts.md`

- [ ] **Prototipo interactivo Figma** (10h)
  - [ ] Linkear screens con flujos principales
  - [ ] Animaciones de transición: slides, fades, overlays
  - [ ] Micrinteracciones: botones con feedback visual, validación en tiempo real
  - [ ] Componentes dinámicos con variant states (hover, pressed, disabled, focus)
  - [ ] Exportar para user testing
  - Entregable: `design/02-high-fidelity/globalfin-interactive-prototype.figma` (shareable link)

- [ ] **Guía de implementación para devs** (6h)
  - [ ] Dashboard (FXML): cómo mapear tokens a CSS/tema, estructura FXML para componentes
  - [ ] Mobile (Flutter): ThemeData setup, custom widgets con Material 3
  - [ ] Grid/layout patterns, ejemplos de código
  - Entregable: `design/02-high-fidelity/implementation-guide.md`

### 2.3 Validación y Documentación de Diseño
- [ ] **User testing (opcional pero recomendado)** (8h)
  - [ ] Sesiones con 5-8 usuarios finales
  - [ ] Ruedas de tareas en prototipo Figma
  - [ ] SUS score, feedback cualitativo
  - Entregable: `design/03-testing/user-testing-report.md`

- [ ] **Documentación visual (Design Handbook)** (4h)
  - [ ] Cómo usar Figma kit
  - [ ] Nomenclatura de componentes
  - [ ] Do's & Don'ts
  - Entregable: `design/DESIGN_HANDBOOK.md`

---

## 3️⃣ RESOLUCIÓN DE MITOS DEL CEO (20% evaluación)
**Duración estimada: 3 días | Hito: 3 Correos argumentados + Business Case Document**

- [ ] **Mito 1 — "Prototipar es pérdida de tiempo"** (6h)
  - [ ] Redactar correo con conceptos: modelo mental, coste de refactor
  - [ ] Incluir caso práctico: tiempo de boceto vs tiempo de código
  - [ ] Documento visual: curva de coste (wireframe vs desarrollado)
  - Entregable: `ceo-responses/01-prototyping-myth.md`

- [ ] **Mito 2 — "La UI es solo cosmética" (Caso Slack)** (6h)
  - [ ] Analizar Slack: cuánto tiempo economiza jerarquía visual + foco
  - [ ] Benchmarking: con/sin diseño claro (productividad usuarios)
  - [ ] Mapping a GlobalFin: tabla de empleados, reducción de errores
  - [ ] ROI estimado: menos errores = menos costes operacionales
  - Entregable: `ceo-responses/02-ui-impact-slack-case.md`

- [ ] **Mito 3 — "JavaFX también para móviles por comodidad"** (6h)
  - [ ] Comparación directa: JavaFX vs Flutter en móviles (ecosystem, performance)
  - [ ] Limitaciones JavaFX: gestos, notificaciones, integración nativa
  - [ ] Ventajas Flutter: microinteracciones, adopción de mercado, developer experience
  - [ ] Risk mitigation: si hay variación de scope
  - Entregable: `ceo-responses/03-mobile-tech-selection.md`

- [ ] **Business Case Document** (6h)
  - [ ] Resumen ejecutivo: decisiones teknológicas, timeline, cost-benefit
  - [ ] Phases: Low-Fi → High-Fi → Dev → Testing → Release
  - [ ] Riesgos y mitigación
  - [ ] KPIs de éxito (user adoption, error rate, time-to-task)
  - Entregable: `docs/BUSINESS_CASE.md`

---

## 4️⃣ IMPLEMENTACIÓN — DASHBOARD (JavaFX)
**Duración estimada: 15 días | Hito: Dashboard funcional con tablas y atajos**

### 4.1 Architecture & Core Setup
- [ ] **Configurar proyecto Maven** (3h)
  - [ ] Estructura de módulos: model, view, viewmodel
  - [ ] pom.xml: javafx, junit, mockito, slf4j
  - [ ] Plugins: maven-shade para distribución
  - Entregable: `dashboard-desktop/pom.xml`

- [ ] **Base de datos mock / API Integration** (6h)
  - [ ] Interface DAO/Repository pattern
  - [ ] Mock data para desarrollo (JSON o H2 en memoria)
  - [ ] Retrofit/HttpClient para backend API
  - [ ] Error handling y retry logic
  - Entregable: `dashboard-desktop/src/main/java/.../{model,repository}`

- [ ] **Configuración de temas (CSS)** (4h)
  - [ ] Mapping tokens → CSS variables
  - [ ] Light/Dark theme support (ToggleButton)
  - [ ] Master stylesheet + overrides por componente
  - [ ] Testing cross-browser (Windows, macOS)
  - Entregable: `dashboard-desktop/src/main/resources/css/{theme.css, tokens.css}`

### 4.2 Componentes UI
- [ ] **Data Table Component** (10h)
  - [ ] Virtualización con TableView<T>
  - [ ] Sortable columns (click header → arrow icon)
  - [ ] Multi-row selection (Ctrl+click, Shift+click, Ctrl+A)
  - [ ] Context menu (right-click)
  - [ ] Copy to clipboard (Ctrl+C)
  - [ ] Pagination o lazy-loading (servidor)
  - Entregable: `dashboard-desktop/src/.../components/DataTable.java`

- [ ] **Filter Panel** (6h)
  - [ ] Text search (real-time debounce)
  - [ ] Date range picker (DatePicker)
  - [ ] Multi-select dropdowns
  - [ ] Clear all button
  - [ ] Saved filter presets
  - Entregable: `dashboard-desktop/src/.../components/FilterPanel.java`

- [ ] **Detail Modal / Side Panel** (6h)
  - [ ] Form binding a objeto seleccionado
  - [ ] Validación en tiempo real
  - [ ] Save/Cancel con confirmación
  - [ ] Error messages contextuales
  - Entregable: `dashboard-desktop/src/.../components/DetailModal.java`

- [ ] **Toolbar + Acciones rápidas** (5h)
  - [ ] Export CSV/Excel button
  - [ ] Print layout optimizado
  - [ ] Search bar global + autocomplete
  - [ ] New/Refresh buttons
  - Entregable: `dashboard-desktop/src/.../components/Toolbar.java`

### 4.3 Keyboard Shortcuts & Accessibility
- [ ] **Implementar atajos de teclado** (6h)
  - [ ] Event handler global en Stage principal
  - [ ] Mapa de accelerators (Ctrl+something, Alt+something)
  - [ ] Help dialog listando todos los shortcuts
  - [ ] Testing: verificar no duplicados con OS
  - Entregable: `dashboard-desktop/src/.../utils/KeyboardShortcuts.java`

- [ ] **Soporte accesibilidad integrado** (4h)
  - [ ] Focus navigation (Tab order), focus-visible styling
  - [ ] Screen reader labels (AccessibleText on nodes)
  - [ ] High contrast mode support
  - [ ] Testing con NVDA/JAWS simulador
  - Entregable: `dashboard-desktop/src/.../utils/A11ySupport.java`

### 4.4 Testing & Performance
- [ ] **Unit tests (Model + ViewModel)** (8h)
  - [ ] Test repository mocks
  - [ ] ViewModel logic (filtering, sorting, pagination)
  - [ ] Validación de formularios
  - [ ] Coverage >= 70%
  - Entregable: `dashboard-desktop/src/test/java/...`

- [ ] **Integration tests (UI components)** (6h)
  - [ ] TableView rendering con datos mock
  - [ ] Keyboard event handling
  - [ ] Filter application
  - [ ] Modal open/close cycles
  - Entregable: `dashboard-desktop/src/test/java/.../ui/`

- [ ] **Performance testing** (4h)
  - [ ] Profiling: rendering time con 10k filas
  - [ ] Memory usage baseline
  - [ ] GC pause monitoring
  - [ ] Optimízaciones si es necesario (lazy-loading, batching)
  - Entregable: `docs/04-dashboard/performance-report.md`

### 4.5 Empaquetado y Distribución
- [ ] **Native packaging (jpackage)** (6h)
  - [ ] Windows MSI installer
  - [ ] macOS DMG bundle
  - [ ] Auto-updates setup (CheckUpdater)
  - Entregable: `dashboard-desktop/pom.xml` (package goal)

- [ ] **User documentation** (3h)
  - [ ] Installation guide por OS
  - [ ] Quick start
  - [ ] Troubleshooting
  - Entregable: `docs/04-dashboard/USER_GUIDE.md`

---

## 5️⃣ IMPLEMENTACIÓN — APP MÓVIL (Flutter)
**Duración estimada: 18 días | Hito: App funcional con autenticación, transacciones y accesibilidad**

### 5.1 Project Setup & Navigation
- [ ] **Configurar proyecto Flutter** (4h)
  - [ ] flutter create mobile-app --platforms=ios,android
  - [ ] pubspec.yaml: dependencies (bloc, http, provider, firebase, etc.)
  - [ ] Configurar signatories (Android keystore, iOS certificates)
  - [ ] Entorno: dev, staging, prod (flavors)
  - Entregable: `mobile-app/pubspec.yaml`, `mobile-app/lib/main.dart`

- [ ] **Navigation & Routing (go_router)** (6h)
  - [ ] Definir routes: /, /login, /home, /transaction, /profile
  - [ ] Deep linking setup
  - [ ] Back button behavior y exit confirmation
  - [ ] State preservation en pop
  - Entregable: `mobile-app/lib/config/router.dart`

- [ ] **State Management setup (Bloc)** (6h)
  - [ ] AppBloc: auth, connectivity, theme
  - [ ] BLoC pattern estructura base
  - [ ] Dependency injection (GetIt)
  - [ ] Testability setup
  - Entregable: `mobile-app/lib/bloc/{app_bloc.dart, app_event.dart, app_state.dart}`

### 5.2 Authentication & User Management
- [ ] **Login Screen + ViewModel** (8h)
  - [ ] Email + password form
  - [ ] Validación en tiempo real
  - [ ] Error handling (invalid credentials, network timeout)
  - [ ] Loading state (spinner)
  - [ ] Biometric login (fingerprint/face) integration
  - Entregable: `mobile-app/lib/screens/login/*.dart`

- [ ] **Onboarding flow** (6h)
  - [ ] Splash screen con branding
  - [ ] Tutorial carousel (swipeable, dots indicator)
  - [ ] Register flow (email, password, términos)
  - [ ] Post-register: kyc/verification flow stub
  - Entregable: `mobile-app/lib/screens/onboarding/*.dart`

- [ ] **Profile Screen** (6h)
  - [ ] Mostrar datos usuario (foto, nombre, email, teléfono)
  - [ ] Botón logout con confirmación
  - [ ] Settings (tema, notificaciones, idioma)
  - [ ] Binding a BLoC AppState
  - Entregable: `mobile-app/lib/screens/profile/*.dart`

### 5.3 Core Features — Home & Transactions
- [ ] **Home Screen + Dashboard** (10h)
  - [ ] Resumen: saldo, últimas transacciones, CTA primaria
  - [ ] Tab navigation: Cuentas, Transacciones, Servicios
  - [ ] Pull-to-refresh data fetching
  - [ ] Shimmer loading skeleton
  - [ ] Empty state cuando no hay datos
  - Entregable: `mobile-app/lib/screens/home/*.dart`

- [ ] **Transaction List** (10h)
  - [ ] Lazy-loading list (PagedDataTable equivalent)
  - [ ] Date grouping por mes
  - [ ] Filter by type (todas, ingresos, egresos), date range
  - [ ] Transaction row: icon, description, amount, date
  - [ ] Tap abre detalles en modal/new screen
  - Entregable: `mobile-app/lib/screens/transactions/*.dart`

- [ ] **Transaction Detail + BLoC** (8h)
  - [ ] Mostrar detalles completos: fecha, referencia, status, descripción
  - [ ] Acciones: compartir, descargar recibo (PDF)
  - [ ] Historial de status (si aplica)
  - [ ] Back button navigation
  - Entregable: `mobile-app/lib/bloc/transaction_bloc.dart`, `mobile-app/lib/screens/transaction_detail/`

- [ ] **New Transaction Flow** (12h)
  - [ ] Formulario: destino (account selector o IBAN), monto, concepto
  - [ ] Validación real-time (monto > 0, IBAN formato, etc.)
  - [ ] Pantalla de confirmación
  - [ ] Estado de envío (loading, error, success)
  - [ ] Recibo/comprobante
  - Entregable: `mobile-app/lib/screens/transaction_new/*.dart`, `mobile-app/lib/bloc/transaction_create_bloc.dart`

### 5.4 API & Data Layer
- [ ] **Definir API contracts** (4h)
  - [ ] Rutas backend esperadas: /auth/login, /transactions, /profile, etc.
  - [ ] DTO models con serialización JSON
  - [ ] Error response handling
  - Entregable: `mobile-app/lib/models/{transaction.dart, user.dart, ...}`

- [ ] **HTTP Client & Interceptors** (6h)
  - [ ] Dio/http setup con base URL config
  - [ ] Token-based auth (JWT) + refresh token logic
  - [ ] Retry logic (exponential backoff)
  - [ ] Logging interceptor
  - Entregable: `mobile-app/lib/services/api_client.dart`, `lib/services/interceptors/`

- [ ] **Repository layer** (6h)
  - [ ] AuthRepository (login, logout, refresh)
  - [ ] TransactionRepository (list, detail, create)
  - [ ] UserRepository (profile, settings)
  - [ ] Abstraction interfaces para testing
  - Entregable: `mobile-app/lib/repositories/{auth_repo.dart, transaction_repo.dart, ...}`

### 5.5 UI Components & Design System
- [ ] **Material 3 Theme + Token Integration** (6h)
  - [ ] Figma tokens → Flutter ThemeData
  - [ ] Custom color scheme (primary, secondary, tertiary)
  - [ ] Tipografía: TextTheme con escalas
  - [ ] Dark mode + toggle
  - [ ] Testing themes en múltiples pantallas
  - Entregable: `mobile-app/lib/config/theme.dart`

- [ ] **Reusable widgets library** (10h)
  - [ ] Buttons: primary, secondary, text, icon
  - [ ] Input fields: text, email, password, formatter
  - [ ] Cards, ListTiles custom
  - [ ] Modals, AlertDialogs, SnackBars
  - [ ] Loading spinners, empty states
  - [ ] Separadores, dividers
  - Entregable: `mobile-app/lib/widgets/*`

- [ ] **Microinteractions & Animations** (8h)
  - [ ] Navigation transitions (slide, fade)
  - [ ] Button ripples y feedback visual
  - [ ] Pull-to-refresh animation
  - [ ] Confirmación visual de transacciones (check animation)
  - [ ] List item slide-to-delete (si aplica)
  - [ ] Animaciones subtiles en estado de carga
  - Entregable: ejemplos en `mobile-app/lib/widgets/animations.dart`

### 5.6 Accessibility (a11y) Móvil
- [ ] **Semántica y screen reader support** (8h)
  - [ ] Semantics widgets en toda la app
  - [ ] Etiquetas descriptivas (label + hint)
  - [ ] Rol buttons, checkboxes, etc.
  - [ ] Reordenamiento lógico de lectura (scrollChildren)
  - [ ] Testing con TalkBack (Android) y VoiceOver (iOS)
  - Entregable: `mobile-app/lib/config/a11y.dart` + guía

- [ ] **Visual accessibility** (6h)
  - [ ] Tamaño táctil mínimo: 48x48 dp
  - [ ] Contraste >= WCAG AA en todo el app
  - [ ] Soporte escalado de texto (dynamic type)
  - [ ] Focus indicators visibles
  - [ ] Reducir motion option (accessibility settings)
  - Entregable: checklists en `docs/05-mobile/accessibility-audit.md`

### 5.7 Testing
- [ ] **Unit tests (Models, BLoCs, Repositories)** (12h)
  - [ ] BLoC testing: event → state
  - [ ] Repository mocking (Mockito)
  - [ ] DTO serialization
  - [ ] Coverage >= 70%
  - Entregable: `mobile-app/test/bloc/`, `test/repositories/`

- [ ] **Widget tests (UI components)** (10h)
  - [ ] Button behaviors
  - [ ] Form validation
  - [ ] List rendering
  - [ ] Navigation
  - [ ] Accessibility testing (SemanticsHandle)
  - Entregable: `mobile-app/test/widgets/`

- [ ] **Integration tests** (8h)
  - [ ] Auth flow: login → home → logout
  - [ ] Transaction list + detail navigation
  - [ ] Error scenarios (network, validation)
  - [ ] Empty states
  - Entregable: `mobile-app/test/integration/`

### 5.8 Build & Release
- [ ] **iOS build configuration** (6h)
  - [ ] Provisioning profiles, certificates
  - [ ] Podfile config
  - [ ] App permissions (biometric, contacts, camera si aplica)
  - Entregable: `mobile-app/ios/Podfile`, shared scheme

- [ ] **Android build configuration** (6h)
  - [ ] Keystore setup (release signing)
  - [ ] App permissions en AndroidManifest
  - [ ] build.gradle (minSdk, targetSdk, versioning)
  - Entregable: `mobile-app/android/app/build.gradle`

- [ ] **Play Store & App Store submission** (8h)
  - [ ] App metadata (descriptions, screenshots, privacy policy)
  - [ ] Privacy policy & terms
  - [ ] Testing en TestFlight (iOS), internal testing (Android)
  - [ ] Store listings
  - Entregable: release notes, store screenshots

---

## 6️⃣ DOCUMENTACIÓN Y ENTREGA FINAL
**Duración estimada: 4 días | Hito: Complete project documentation + handoff**

### 6.1 Documentación técnica
- [ ] **Architecture Decision Records (ADR)** (4h)
  - [ ] Compilar todos los ADRs en `docs/architecture/`
  - [ ] Decisiones y justificaciones
  - [ ] Trade-offs explicados
  - Entregable: `docs/architecture/*.md`

- [ ] **API Documentation** (4h)
  - [ ] OpenAPI/Swagger spec (si backend la proporciona)
  - [ ] Request/response examples
  - [ ] Error codes mapping
  - Entregable: `docs/api/openapi.yaml` o similar

- [ ] **Deployment guide** (4h)
  - [ ] How to build for development/staging/production
  - [ ] Environment variables (.env setup)
  - [ ] CI/CD pipeline documentation (si aplica)
  - [ ] Troubleshooting
  - Entregable: `docs/DEPLOYMENT.md`

### 6.2 README y Quick Start
- [ ] **Update main README** (2h)
  - [ ] Project overview
  - [ ] Repository structure overview
  - [ ] Quick start commands
  - Entregable: `/README.md` actualizado

- [ ] **Dashboard quick start** (2h)
  - [ ] Cómo clonar, compilar, correr
  - [ ] Requisitos (Java 17+, Maven)
  - [ ] Troubleshooting común
  - Entregable: `dashboard-desktop/README.md`

- [ ] **Mobile quick start** (2h)
  - [ ] Flutter version
  - [ ] Android Studio / Xcode setup
  - [ ] Run commands (android, iOS, web)
  - [ ] Device testing
  - Entregable: `mobile-app/README.md`

### 6.3 Design & UX Handoff
- [ ] **Compactar design system** (2h)
  - [ ] Figma link finalizado
  - [ ] Tokens JSON export
  - [ ] Component specs (dimensions, spacing, colors)
  - Entregable: `design/HANDOFF.md`, links finales

- [ ] **Crear design handbook completo** (3h)
  - [ ] Cómo usar tokens en código
  - [ ] Component usage examples
  - [ ] Common patterns
  - [ ] Do's & Don'ts
  - Entregable: `design/DESIGN_HANDBOOK.md`

### 6.4 CEO Presentations & Business Docs
- [ ] **Compilar business case final** (2h)
  - [ ] Todas mis respuestas a los 3 mitos
  - [ ] Timeline y deliverables
  - [ ] ROI estimado
  - [ ] Risk assessment
  - Entregable: `docs/BUSINESS_CASE.md`

- [ ] **Crear presentation deck PDF** (4h)
  - [ ] Estructura: Tech choices → Design process → Outcomes
  - [ ] Wireframes y mockups
  - [ ] ROI highlights
  - [ ] Next steps
  - Entregable: `docs/GLOBALFIN_PRESENTATION.pdf`

---

## 📊 ESTIMACIÓN TOTAL

| Área | Duración | % Evaluación |
|------|----------|--------------|
| 1. Análisis y selección tecnológica | 5d (40h) | 40% |
| 2. Metodología UI/UX y prototipado | 10d (80h) | 30% |
| 3. Respuestas CEO + Business case | 3d (24h) | 20% |
| **Subtotal evaluación** | **18d (144h)** | **90%** |
| 4. Dashboard implementation | 15d (120h) | *bonus* |
| 5. Mobile implementation | 18d (144h) | *bonus* |
| 6. Docs & handoff | 4d (32h) | *bonus* |
| **TOTAL (solo evaluación)** | **18 días** | **100%** |
| **TOTAL (con implementación)** | **~8-10 semanas** | **Completo** |

---

## ⚠️ RIESGOS Y MITIGACIÓN

| Riesgo | Probabilidad | Impacto | Mitigación |
|--------|--------------|--------|-----------|
| Cambios de scope a mitad del proyecto | Media | Alto | Congelar requisitos al fin de la Fase 1 |
| Performance de tabla con 50k+ filas | Baja | Medio | Implementar lazy-loading desde inicio (Sprint 4) |
| Integración API backend no lista | Media | Alto | Usar mock server desde el Sprint 2 |
| Feedback CEO tardío post-Fase 1 | Baja | Medio | Presentations intermedias en Day 5 |
| Flutter version incompatibility | Baja | Bajo | Pin dependencies, usar supported versions |
| Accesibilidad incompleta en mobile | Media | Medio | Testing automation desde Sprint 5 |

---

## ✅ DEFINICIÓN DE "DONE"

Cada tarea está completada cuando:
- ✓ Código commitido y merged a `main`
- ✓ Tests pasan (unit + integration)
- ✓ Documentación actualizada
- ✓ Revisión de código aprobada
- ✓ Si es UI: validado en diseño y accesibilidad
- ✓ Si es feature: testeado en dev device/simulator

---

Generated: 2026-03-01 | GlobalFin Project
