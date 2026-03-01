# 🎨 DESIGN HANDBOOK — GlobalFin Design System

**Guía de uso de tokens, componentes y patrones para implementadores**

---

## 1. Proyecto Figma

**Link**: [GlobalFin Design System](https://figma.com/file/...) *(TBD - crear en Figma después del prototipado)*

### Estructura en Figma
```
📁 GlobalFin Design System
  ├── 🎨 Tokens
  │   ├── Colors
  │   ├── Typography
  │   ├── Spacing
  │   └── Shadows/Elevations
  │
  ├── 🧩 Components
  │   ├── Buttons
  │   ├── Inputs
  │   ├── Tables
  │   ├── Modals
  │   └── Navigation
  │
  ├── 📱 Screens
  │   ├── Dashboard (B2B)
  │   ├── Mobile (B2C)
  │   └── States & Variations
  │
  └── 📋 Specs & Documentation
      └── Keyboard shortcuts
```

---

## 2. Design Tokens

### Colors

**Primario** (Acciones principales)
```
Blue: #1F77D2 (Figma: Blues/500)
  └─ Light: #40A0E8
  └─ Dark: #1456B0
```

**Secundario** (Acciones auxiliares)
```
Green: #4CAF50 (Success)
Red: #F44336 (Error)
Amber: #FFC107 (Warning)
Grey: #757575 (Disabled/Secondary)
```

**Neutral**
```
White: #FFFFFF
Black: #000000
Grey 50: #FAFAFA
Grey 100: #F5F5F5
Grey 500: #9E9E9E
Grey 900: #212121
```

### Typography

**Family**: Roboto (variable font)

**Scale**:
```
Display Large:  48px, weight 400, height 52px
Display Medium: 44px, weight 400, height 48px
Display Small:  36px, weight 400, height 42px

Headline Large:  32px, weight 700, height 40px
Headline Normal: 28px, weight 700, height 36px
Headline Small:  24px, weight 700, height 32px

Title Large:     20px, weight 700, height 28px
Title Normal:    16px, weight 700, height 24px

Body Large:      16px, weight 400, height 24px
Body Normal:     14px, weight 400, height 20px
Body Small:      12px, weight 400, height 18px

Label Large:     14px, weight 700, height 20px
Label Normal:    12px, weight 700, height 18px
Label Small:     11px, weight 700, height 16px
```

**Line-height & Letter spacing**: Per Material 3 spec

### Spacing

**Base unit**: 4px

```
xs: 4px
sm: 8px
md: 12px
lg: 16px
xl: 24px
2xl: 32px
3xl: 48px
```

Use en padding, margin, gaps.

### Shadows & Elevations

Material 3 elevation system:

```
Level 0 (Ground): No shadow
Level 1: 0 1px 3px rgba(0,0,0,0.12), 0 1px 2px rgba(0,0,0,0.24)
Level 2: 0 3px 6px rgba(0,0,0,0.15), 0 2px 4px rgba(0,0,0,0.12)
Level 3: 0 10px 20px rgba(0,0,0,0.15), 0 3px 6px rgba(0,0,0,0.10)
...
Level 5: Major elevation (dialogs, modals)
```

---

## 3. Componentes

### Button

**Primary (CTA)**
```
Background: Blue 500
Text: White
Padding: 12px 24px (tall), 8px 16px (normal), 6px 12px (small)
Border radius: 4px
Font: Label Large
Hover: Blue Dark
Pressed: Blue Very Dark
Disabled: Grey 200 (bg) + Grey 500 (text)
```

**Secondary**
```
Background: Transparent
Border: 1px Blue 500
Text: Blue 500
Hover: Blue Light (fill background)
```

**Text (no border)**
```
Background: Transparent
Text: Blue 500
Hover: Grey Light background
```

### Input Fields

**Default state**
```
Border: 1px Grey 300
Height: 40px (tall), 36px (normal)
Padding: 8px 12px
Font: Body Normal
Placeholder: Grey 600
```

**Focus state**
```
Border: 2px Blue 500
Background: Blue Light (very faint)
Outline: none
```

**Error state**
```
Border: 2px Red 500
Helper text: Red 500, Font: Body Small
```

**Disabled state**
```
Background: Grey 100
Text: Grey 500
Cursor: not-allowed
```

### Table

**Headers**
```
Background: Grey 100
Font: Label Large
Padding: 12px
Text color: Grey 900
Sortable column: icon visible on hover
```

**Rows**
```
Height: 48px
Padding: 8px 12px
Border-bottom: 1px Grey 200
Hover: Grey 50 background (light)
Selected: Blue Light background
```

**Small text in cells**: Body Small, Grey 700

### Modal

**Container**
```
Background: White
Border radius: 8px
Padding: 24px
Shadow: Level 3
Max width: 90vw / 600px (tablet/mobile)
```

**Title**: Headline Normal  
**Content**: Body Normal  
**Actions**: Buttons at bottom, gap 12px margin-left (primary button last)

### Focus Indicator

```
Outline: 2px solid Blue 500
Offset: 2px
Border radius: match element
Never show outline is :focus-visible is not supported
```

---

## 4. Cómo usar en cada plataforma

### 🖥️ Dashboard (JavaFX)

**CSS mapping**:
```css
/* tokens.css */
:root {
  --color-primary: #1F77D2;
  --color-primary-light: #40A0E8;
  --color-primary-dark: #1456B0;
  --color-success: #4CAF50;
  
  --font-family: 'Roboto', sans-serif;
  --font-size-body: 14px;
  --font-size-headline: 24px;
  
  --spacing-xs: 4px;
  --spacing-sm: 8px;
  --spacing-md: 12px;
  
  --shadow-1: 0 1px 3px rgba(0,0,0,0.12);
}

/* Components */
.btn-primary {
  background-color: var(--color-primary);
  color: white;
  padding: var(--spacing-md) calc(var(--spacing-md) * 2);
  border-radius: 4px;
  border: none;
}

.btn-primary:hover {
  background-color: var(--color-primary-dark);
}

.btn-primary:focus-visible {
  outline: 2px solid var(--color-primary);
  outline-offset: 2px;
}
```

**FXML template**:
```xml
<Button text="Guardar" styleClass="btn-primary" onAction="#handleSave"/>
<TableView>
  <TableColumn text="Usuario" prefWidth="200"/>
  <TableColumn text="Saldo" prefWidth="150" style="-fx-alignment: CENTER-RIGHT;"/>
</TableView>
```

### 📱 Mobile (Flutter)

**ThemeData config**:
```dart
// lib/config/theme.dart
import 'package:flutter/material.dart';

ThemeData buildLightTheme() {
  return ThemeData(
    useMaterial3: true,
    colorScheme: ColorScheme.fromSeed(
      seedColor: const Color(0xFF1F77D2),
      brightness: Brightness.light,
    ),
    typography: Typography.material2021(
      englishLike: const TextTheme(
        displayLarge: TextStyle(
          fontSize: 48,
          fontWeight: FontWeight.w400,
          height: 52/48,
        ),
        // ... etc.
      ),
    ),
  );
}
```

**Widget usage**:
```dart
ElevatedButton.styleFrom(
  backgroundColor: const Color(0xFF1F77D2),
  padding: const EdgeInsets.symmetric(horizontal: 24, vertical: 12),
)

TextField(
  decoration: InputDecoration(
    border: OutlineInputBorder(
      borderSide: BorderSide(color: Colors.grey[300]!),
    ),
    focusedBorder: OutlineInputBorder(
      borderSide: const BorderSide(
        color: Color(0xFF1F77D2),
        width: 2,
      ),
    ),
  ),
)
```

---

## 5. Patrones comunes

### Empty state
```
Icon (128x128, grey)
Heading: "Sin resultados"
Body: "No hay registros que coincidan con tu búsqueda."
CTA Button (optional): "Crear nuevo"
```

### Loading state
```
Shimmer placeholder matching content layout
Or: Spinner + "Cargando..."
```

### Error message
```
Icon: ⚠️
Title: "Error al cargar"
Message: Específica (ej. "La conexión expiró")
Action: "Reintentar"
```

---

## 6. Do's & Don'ts

✅ **DO**
- Usar spacing módulo (4px grid)
- Mantener contraste WCAG AA (4.5:1 mínimo)
- Focus visible siempre presente
- Usar colores de la paleta, no "random colors"
- Align elementos a grid (8px mínimo)

❌ **DON'T**
- Cambiar colores sin actualizar todas plataformas
- Usar shadows custom (usar elevation levels)
- Omitir focus indicators porque "no se ve bien"
- Crear nuevas fuentes (todos: Roboto)
- Inline styles en templates (siempre CSS/theme)

---

## 7. Accesibilidad

Ver [accessibility-audit.md](../04-dashboard/accessibility-audit.md) para lista completa.

**Resumen**:
- Contraste: WCAG AA (4.5:1 para texto)
- Focus: Siempre visible (outline 2px)
- Semánticas: Usar etiquetas (labels, alt-text, aria-*)
- Teclado: Tab order lógico
- Colores: No usar solo color para significado (ej. error = icon + color)

---

## 8. Proceso de actualización

Si necesitas cambiar un token:

1. Actualizar en Figma (Design System file)
2. Export tokens.json + tokens.css
3. Update en ambos repos:
   - `dashboard-desktop/src/main/resources/css/tokens.css`
   - `mobile-app/lib/config/theme.dart`
4. Commit con mensaje: `chore: update design tokens (color-secondary to #[new])`
5. Notify design + dev team

---

## 📝 Checklist para implementadores

Antes de marcar "listo":
- [ ] Componente respeta spacing y colores del sistema
- [ ] Focus visible en todos los interactive elements
- [ ] Etiquetas de accesibilidad (labels, descriptions)
- [ ] Responsive (mobile, tablet, desktop si aplica)
- [ ] Tested en light + dark mode (si aplica)
- [ ] No hay estilos hardcoded (todo en CSS/theme)
- [ ] Matches Figma high-fidelity mockup

---

**Última actualización**: 2026-03-01  
**Propietario**: Design Lead

*Para cambios o preguntas, crear issue en GitHub o comentar en Figma.*
