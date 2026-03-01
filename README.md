# GlobalFin — UI/UX Overhaul
**Fusión entre banco tradicional y Fintech moderna | Multi-platform modernization**

---

## 📌 Visión proyecto

GlobalFin ha completado una fusión entre operaciones de banca tradicional y una fintech moderna. Resultó un back-end robusto, pero las interfaces actuales son cuello de botella. Este proyecto rediseña y reescribe dos interfaces críticas:

- **Dashboard B2B**: Aplicación de escritorio para analistas bancarios (Windows/macOS) — manejo masivo de datos, atajos de teclado, velocidad
- **App móvil B2C**: Aplicación para clientes (iOS/Android) — facilidad de uso, microinteracciones fluidas, accesibilidad

---

## 🎯 Objetivos de evaluación

### 1. Análisis y Selección Tecnológica (40%)
✅ Justificar **JavaFX** para dashboard B2B (separación FXML+CSS, rendimiento tabla, atajos)  
✅ Justificar **Flutter** para app B2C (renderizado, time-to-market, accesibilidad móvil)  
✅ Architecture Decision Records (ADRs) documentados

### 2. Metodología UI/UX y Prototipado (30%)
✅ **Fase 1 (Low-Fi)**: Wireframes B/N del flujo usuario (modelo mental)  
✅ **Fase 2 (High-Fi)**: Figma + Material Theme Builder, tokens, accesibilidad WCAG AA  
✅ Prototipo interactivo validado

### 3. Respuestas CEO (20%)
✅ **Mito 1**: "Prototipar es pérdida de tiempo" → concepto modelo mental + ROI  
✅ **Mito 2**: "UI es solo cosmética" → Caso Slack + impacto productividad  
✅ **Mito 3**: "JavaFX para móvil" → Flutter vs JavaFX en B2C  
✅ Business Case document completo

---

## 📁 Estructura del repositorio

```
proyecto_GlobalFin/
├── README.md                          # Este archivo
├── CHECKLIST.md                       # ⭐ Task list detallada + estimaciones
│
├── docs/                              # Documentación técnica
│   ├── 01-tech-selection/             # Comparativas y decisiones
│   │   ├── javafx-vs-maui.md
│   │   ├── flutter-vs-react-native.md
│   │   ├── adr-javafx-architecture.md
│   │   └── adr-mobile-architecture.md
│   ├── 02-architecture/               # ADRs y patrones de diseño
│   │   ├── architecture-overview.md
│   │   └── patterns-and-principles.md
│   ├── 03-testing/                    # Estrategia de testing
│   │   ├── test-strategy.md
│   │   └── coverage-guidelines.md
│   ├── 04-dashboard/                  # Docs específicas JavaFX
│   │   ├── dashboard-design.md
│   │   ├── keyboard-shortcuts.md
│   │   ├── performance-report.md
│   │   └── USER_GUIDE.md
│   ├── 05-mobile/                     # Docs específicas Flutter
│   │   ├── mobile-design.md
│   │   ├── accessibility-audit.md
│   │   └── build-guide.md
│   ├── BUSINESS_CASE.md               # ⭐ Business case para CEO
│   └── DEPLOYMENT.md                  # Guía de deployment
│
├── design/                            # Assets UI/UX
│   ├── 01-low-fidelity/               # Fase 1: Wireframes B/N
│   │   ├── user-flows.md
│   │   ├── dashboard-wireframes.png
│   │   └── mobile-wireframes.png
│   ├── 02-high-fidelity/              # Fase 2: Diseño visual
│   │   ├── tokens.json                # ⭐ Design tokens
│   │   ├── tokens.css
│   │   ├── DESIGN_HANDBOOK.md         # Guía de uso
│   │   ├── globalfin-design-system.figma  # Figma link
│   │   └── keyboard-shortcuts.md
│   ├── 03-testing/                    # User testing results
│   │   └── user-testing-report.md
│   └── HANDOFF.md                     # Entrega a development
│
├── ceo-responses/                     # ⭐ Respuestas a los 3 mitos
│   ├── 01-prototyping-myth.md         # Mito perdida tiempo
│   ├── 02-ui-impact-slack-case.md     # Mito cosmético
│   └── 03-mobile-tech-selection.md    # Mito JavaFX para móvil
│
├── dashboard-desktop/                 # 🖥️ Proyecto JavaFX (Windows/macOS)
│   ├── pom.xml                        # Maven config + JavaFX plugin
│   ├── README.md                      # Quick start
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/globalfin/dashboard/
│   │   │   │   ├── App.java           # Entry point
│   │   │   │   ├── model/             # DTOs + entities
│   │   │   │   ├── view/              # FXML views
│   │   │   │   │   └── *.fxml
│   │   │   │   ├── viewmodel/         # Controllers + VMs
│   │   │   │   ├── components/        # Custom UI components
│   │   │   │   ├── repository/        # Data layer (DAO pattern)
│   │   │   │   ├── service/           # Business logic
│   │   │   │   └── utils/             # Helpers (KeyboardShortcuts, A11y, etc.)
│   │   │   └── resources/
│   │   │       ├── fxml/              # FXML templates
│   │   │       ├── css/               # Temas y estilos
│   │   │       └── icons/             # SVG icons
│   │   └── test/
│   │       └── java/com/globalfin/dashboard/
│   │           ├── unit/              # Unit tests
│   │           └── integration/       # Integration tests
│   └── target/                        # Build output (ignore)
│
├── mobile-app/                        # 📱 Proyecto Flutter (iOS/Android)
│   ├── pubspec.yaml                   # Dependencies
│   ├── README.md                      # Quick start
│   ├── lib/
│   │   ├── main.dart                  # Entry point
│   │   ├── config/
│   │   │   ├── router.dart            # go_router setup
│   │   │   └── theme.dart             # Material 3 + tokens
│   │   ├── models/                    # DTOs + entities
│   │   └── models/
│   │       ├── transaction.dart
│   │       └── user.dart
│   │   ├── bloc/                      # State management (Bloc pattern)
│   │   │   ├── app_bloc.dart          # Global BLoCs
│   │   │   ├── auth_bloc.dart
│   │   │   └── transaction_bloc.dart
│   │   ├── repositories/              # Data layer
│   │   │   ├── auth_repository.dart
│   │   │   └── transaction_repository.dart
│   │   ├── services/                  # API & external services
│   │   │   └── api_client.dart
│   │   ├── screens/                   # UI Screens
│   │   │   ├── login/
│   │   │   ├── home/
│   │   │   ├── transactions/
│   │   │   ├── profile/
│   │   │   └── transaction_detail/
│   │   └── widgets/                   # Reusable widgets
│   │       ├── buttons.dart
│   │       ├── inputs.dart
│   │       └── animations.dart
│   ├── test/
│   │   ├── bloc/                      # BLoC tests
│   │   ├── repositories/              # Repository mocks
│   │   └── integration/               # End-to-end tests
│   ├── android/                       # Android native config
│   │   ├── app/build.gradle
│   │   └── AndroidManifest.xml
│   ├── ios/                           # iOS native config
│   │   ├── Podfile
│   │   └── Runner.xcodeproj/
│   └── build/                         # Build output (ignore)
│
└── .gitignore                         # Git exclusions
```

---

## 🚀 Quick Start

### Para el Dashboard (JavaFX)
```bash
cd dashboard-desktop
mvn clean package
# Ejecutable: target/dashboard-app.exe (Windows) o .app (macOS)
```
**Requisitos**: Java 17+, Maven 3.8+

### Para la App Móvil (Flutter)
```bash
cd mobile-app
flutter pub get
flutter run -d <device-id>  # android / ios
```
**Requisitos**: Flutter 3.10+, Android SDK / Xcode

---

## 📋 Fases del proyecto

### Fase Evaluada (18 días)
1. **Análisis & Tech Stack** (5d) → Decisiones fundamentadas + ADRs
2. **Wireframes & Prototipado** (10d) → Low-Fi → High-Fi → Prototipo interactivo
3. **CEO Mitos + Business Case** (3d) → 3 correos + ROI document

**Total evaluación: 18 días | 100% de rubrica cubierta**

### Fases Adicionales (Implementación - opcional)
4. **Dashboard implementation** (15d) → Tablas, atajos, accesibilidad
5. **Mobile implementation** (18d) → Auth, transacciones, microinteracciones
6. **Testing & Release** (4d) → Unit/integration/E2E, empaquetado

**Total con implementación: ~8-10 semanas**

---

## 📊 Matriz de responsabilidades

| Área | Entregable | Estado | Propietario |
|------|-----------|--------|-------------|
| Tech selection | ADRs + comparativas | 📝 In progress | Tech lead |
| Wireframes | Low-Fi B/N | 📝 In progress | UX lead |
| Prototipo | Figma interactivo | 🔄 Pending | Design lead |
| CEO responses | 3 correos fundamentados | 🔄 Pending | PM / Tech lead |
| Dashboard | JavaFX proyecto base | 🔄 Pending | Dev team |
| Mobile | Flutter proyecto base | 🔄 Pending | Mobile team |

---

## 🔗 Links importantes

- **Figma Design System**: [Link TBD] — todos los wireframes, componentes, tokens
- **Jira/Kanban**: [Link TBD] — tracking de tasks detallado
- **Confluence/Docs**: [Link TBD] — documentación wiki centralizada
- **CI/CD Pipeline**: [Link TBD] — GitHub Actions / Jenkins

---

## 🎓 Rubrica de evaluación

| Criterio | % | Status |
|----------|---|--------|
| Análisis y selección tecnológica | 40% | 🔄 |
| Metodología UI/UX y prototipado | 30% | 🔄 |
| Resolución de mitos CEO | 20% | 🔄 |
| **Total rubrica** | **90%** | 🔄 |
| Implementación (bonus) | 10% | 🔄 |

---

## ⚠️ Notas importantes

- **Congelación de scope**: Al finalizar Fase 1 (Day 5), se congela lista de requisitos
- **Design tokens**: Desde High-Fi son exportables a JSON/CSS para ambos proyectos
- **Accesibilidad**: WCAG AA mínimo en todas las interfaces (a11y built-in)
- **Testing**: Unit + integration desde el primer sprint; más detalles en [CHECKLIST.md](CHECKLIST.md)

---

## 📞 Contacto y escalamientos

- **Preguntas técnicas**: Tech lead
- **Feedback diseño**: Design team
- **Decisiones arquitectura**: Tech review board
- **CEO updates**: PM + Tech lead (weekly status)

---

## 📜 Historial de cambios

| Fecha | Versión | Cambios |
|-------|---------|---------|
| 2026-03-01 | 0.1 | Scaffolding inicial + checklist |
| TBD | 0.2 | Wireframes Low-Fi completados |
| TBD | 0.3 | Design system High-Fi finalizado |
| TBD | 1.0 | Evaluación final + CEO sign-off |

---

**Generado**: 2026-03-01  
**Proyecto**: GlobalFin UI/UX Overhaul  
**Estado**: 🟡 In Progress

