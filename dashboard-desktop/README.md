# Dashboard de Empleados - GlobalFin (JavaFX)

Aplicación de escritorio para analistas bancarios. Interfaz de rápido acceso a datos, optimizada para manejo masivo de información y atajos de teclado.

## 🖥️ Requisitos

- **Java**: 17 o superior
- **Maven**: 3.8 o superior
- **OS**: Windows 10+, macOS 10.15+

## 🚀 Quick Start

### Desarrollo
```bash
# Clonar y navegar
cd dashboard-desktop

# Instalar dependencias
mvn clean install

# Ejecutar en modo desarrollo (hot-reload)
mvn javafx:run
```

### Build para producción
```bash
# Crear JAR ejecutable
mvn clean package

# Resultado: target/dashboard-app.jar
# Ejecutar: java -jar target/dashboard-app.jar

# (Opcional) Empaquetado nativo con jpackage
mvn clean package
jpackage --input target --name GlobalFin-Dashboard \
  --main-jar dashboard-app.jar \
  --main-class com.globalfin.dashboard.App \
  --type exe  # Para Windows; cambiar a 'dmg' en macOS
```

## 📁 Estructura del proyecto

```
dashboard-desktop/
├── src/main/java/com/globalfin/dashboard/
│   ├── App.java                    # Entry point de la aplicación
│   ├── model/                      # Entidades y DTOs
│   │   ├── Transaction.java
│   │   ├── User.java
│   │   └── Account.java
│   ├── view/                       # FXML templates
│   │   ├── MainWindow.fxml
│   │   ├── DashboardView.fxml
│   │   └── DetailModal.fxml
│   ├── viewmodel/                  # Controllers y ViewModels
│   │   ├── MainController.java
│   │   ├── DashboardViewModel.java
│   │   └── DetailController.java
│   ├── components/                 # Custom components
│   │   ├── DataTable.java
│   │   ├── FilterPanel.java
│   │   └── Toolbar.java
│   ├── repository/                 # Acceso a datos (DAO pattern)
│   │   ├── TransactionRepository.java
│   │   └── UserRepository.java
│   ├── service/                    # Lógica de negocio
│   │   ├── DashboardService.java
│   │   └── ValidationService.java
│   └── utils/                      # Utilidades
│       ├── KeyboardShortcuts.java
│       ├── A11ySupport.java
│       └── Themes.java
│
├── src/main/resources/
│   ├── fxml/                       # Plantillas FXML
│   ├── css/                        # Estilos (tokens + temas)
│   │   ├── tokens.css
│   │   ├── light-theme.css
│   │   └── dark-theme.css
│   └── icons/                      # SVG icons
│
├── src/test/java/
│   ├── unit/                       # Unit tests
│   └── integration/                # Integration tests
│
└── pom.xml                         # Maven config
```

## ⌨️ Atajos de teclado

| Atajo | Acción |
|-------|--------|
| `Ctrl+S` | Guardar / Enviar |
| `Ctrl+N` | Nueva entidad |
| `Ctrl+F` | Buscar |
| `Ctrl+L` | Limpiar filtros |
| `Ctrl+E` | Exportar (CSV) |
| `Alt+H` | Mostrar ayuda |
| `Esc` | Cerrar modal |
| `Tab` | Navegar elementos |
| `Arrow Keys` | Navegar tabla |
| `Enter` | Editar fila seleccionada |
| `Ctrl+A` | Seleccionar todo |

## 🎨 Temas

La aplicación soporta **Light** y **Dark** themes dinámicos.

- Tokens definidos en `tokens.css`
- Cambiar tema: `Preferences > Theme`
- Integración automática con preferencias del OS

## ♿ Accesibilidad (WCAG AA)

- ✅ Navegación por teclado completa
- ✅ Screen reader compatible (NVDA, JAWS)
- ✅ Contraste mínimo 4.5:1
- ✅ Focus indicators visibles
- ✅ Etiquetas semánticas

Validar con NVDA: menú `Tools > Inspect Element`

## 🧪 Testing

### Unit tests
```bash
mvn test
```

### Con coverage
```bash
mvn test jacoco:report
# Ver: target/site/jacoco/index.html
```

### Integration tests
```bash
mvn verify
```

## 🔧 Configuration

Editar `application.properties` para:
- URL de backend API
- Logging level
- Credentials

```properties
api.baseUrl=http://localhost:8080
api.timeout=30000
logging.level=INFO
```

## 📚 Documentación adicional

- [ADR - Arquitectura JavaFX](../../docs/01-tech-selection/adr-javafx-architecture.md)
- [Specification - Keyboard Shortcuts](../../docs/04-dashboard/keyboard-shortcuts.md)
- [Design Handbook](../../design/02-high-fidelity/DESIGN_HANDBOOK.md)

## 🐛 Troubleshooting

### `Module not found: javafx`
```bash
mvn clean compile
# Ensure pom.xml has correct javafx.maven.plugin version
```

### Performance lento con muchas filas
- Activar virtualización en TableView (por defecto)
- Implementar lazy-loading desde servidor
- Ver: [Performance Report](../../docs/04-dashboard/performance-report.md)

### Atajos no funcionan
- Verificar no conflictúan con OS shortcuts
- Refrescar con `F5` o `Ctrl+R`

## 📞 Support

- Issues: GitHub Issues
- Documentación: docs/
- Design: Figma link (en README raíz)

---

**Última actualización**: 2026-03-01  
**Versión**: 0.1.0-SNAPSHOT
