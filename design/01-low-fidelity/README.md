# 📋 Low-Fidelity Design | Fase 1 - Wireframes

**Status**: ✅ Completo | Listo para validación con stakeholders

---

## 📄 Documentos en esta carpeta

### 1. [user-flows.md](user-flows.md)
**Propósito**: Mapeo de flujos de usuario y modelo mental

Contiene:
- Flow 1: Login → Dashboard → Búsqueda → Detalle (B2B)
- Flow 2: Filtrado avanzado (B2B)
- Flow 3: Bulk actions (B2B)
- Flow 1-3: Onboarding, transacciones, perfil (B2C)
- **Criterios de validación** para cada flujo

**Lectura rápida**: 10 minutos  
**Audiencia**: PMs, UX Lead, Tech Lead

---

### 2. [dashboard-wireframes.md](dashboard-wireframes.md)
**Propósito**: Diseño blanco y negro del dashboard B2B

Contiene:
- Screen 1: Main Dashboard (tabla + filtros + KPIs)
- Screen 2: Detail Panel (sidebar detalle)
- Screen 3-8: Modales, filtros, errores, loading states
- Especificaciones de comportamiento (virtualización, shortcuts)
- Paleta de colores (reference para high-fi)

**Lectura rápida**: 20 minutos  
**Audiencia**: Diseñadores, desarrolladores JavaFX, analistas usuarios

---

### 3. [mobile-wireframes.md](mobile-wireframes.md)
**Propósito**: Diseño blanco y negro de la app móvil B2C

Contiene:
- Screen 1-14: Splash, login, 2FA, home, send money flow, transactions, profile
- Navigation stack (cómo pantallas se conectan)
- Especificaciones técnicas (safe area, keyboard, responsive)
- Microinteractions (animations, haptics)
- Color indicators y accesibilidad notes

**Lectura rápida**: 20 minutos  
**Audiencia**: Diseñadores, desarrolladores Flutter, clientes piloto

---

### 4. [validation-plan.md](validation-plan.md)
**Propósito**: Guía para sesiones de user testing

Contiene:
- Plan de participantes (3-5 usuarios por plataforma)
- 5 tareas específicas por plataforma (con objetivos y métricas)
- Preguntas de feedback abierto
- Guión de sesión (cómo dirigir la prueba)
- Matriz de evaluación (qué es bueno/aceptable/crítico)
- Template de documento de conclusiones

**Lectura rápida**: 15 minutos  
**Audiencia**: UX Lead, Research, Diseñadores

---

## 🎯 Cómo usar estos documentos

### Para el CEO / Stakeholders
→ Lee [user-flows.md](user-flows.md) **"Modelos mentales"** (al final)  
Entenderá qué espera cada usuario y por qué el diseño es así.

### Para diseñadores
→ Lee los 4 documentos en orden:
1. Entiende flujos (user-flows.md)
2. Estudia wireframes desktop (dashboard-wireframes.md)
3. Estudia wireframes móvil (mobile-wireframes.md)
4. Prepara validación (validation-plan.md)

→ Luego: **Crea alta-fidelidad en Figma** basado en estos wireframes

### Para desarrolladores
→ Lee [dashboard-wireframes.md](dashboard-wireframes.md) y [mobile-wireframes.md](mobile-wireframes.md)
→ Usa "Especificaciones de comportamiento" como requirements técnico
→ Los wireframes informan arquitectura (ej. virtualización tabla, state management móvil)

### Para analistas de negocio
→ Lee [user-flows.md](user-flows.md) (flujos) + [validation-plan.md](validation-plan.md) (criterios éxito)
→ Usa para definir historias de usuario (user stories) en Jira

---

## ✅ Lo que hace que estos wireframes sean "Low-Fidelity"

| Característica | ✅ Qué SÍ tiene | ❌ Qué NO tiene |
|---|---|---|
| **Flujos** | Completos (login → feature) | - |
| **Layout** | Disposición exacta de elementos | Estilos visuales detallados |
| **Colores** | Paleta de referencia | Color final (en high-fi) |
| **Tipografía** | Tamaños aproximados | Fuentes exactas, weights |
| **Detalles** | Labels y placeholders | Iconografía final, imagery |
| **Interacción** | Qué pasa al click | Animaciones, microinteracciones |
| **Accesibilidad** | Notes de a11y | Validación real (en testing) |

**Por qué low-fi primero**: 
- Costo de cambio es bajo (es markdown, no Figma high-fi)
- Velocidad: creado en <8 horas vs 40h para high-fi + prototipo
- Feedback rápido: usuarios validan "¿esto tiene sentido?" antes de gastar en visuals

---

## 🔄 Proceso post-wireframes

```
Wireframes (aquí) ← TÚ ESTÁS AQUÍ
        ↓
User Testing (5 usuarios × 2 plataformas) - 1-2 sesiones
        ↓
Feedback Compilado (validation-report.md)
        ↓
Iteración si críticos
        ↓
HIGH-FIDELITY DESIGN EN FIGMA - Fase 2
   - Colores corporativos
   - Tipografía elegida
   - Design tokens (exportables)
   - Componentes atómicos
   - Prototipo interactivo
        ↓
CEO + Stakeholder Review
        ↓
DESARROLLO (JavaFX + Flutter)
```

---

## 📊 Métricas y KPIs por platform

### Dashboard (B2B)
Validar que usuarios pueden:
- [ ] Buscar cuenta en <10 segundos
- [ ] Aplicar filtro en <20 segundos
- [ ] Hacer bulk action en <30 segundos
- [ ] Usar atajos (con eficiencia)
- [ ] Exportar sin confusión

### App Móvil (B2C)
Validar que usuarios pueden:
- [ ] Login en <60 segundos
- [ ] Enviar dinero en <2 minutos
- [ ] Ver historial intuitivamente
- [ ] Confiar en la transacción
- [ ] Navegar sin perderse

---

## 🎨 Notas para el paso a High-Fidelity

**De dashboard-wireframes.md → Figma high-fi**:
```
Main dashboard está clara la jerarquía:
- TOP: KPIs (resumen contexto)
- MID: Filtros prominentes
- LARGE: Tabla virtualizada (protagonista)
→ En high-fi: aplicar Material Design 3, colores corporativos

Detail panel es sidebar derecho:
→ En high-fi: animación slide-in desde derecha, shadow elevation
```

**De mobile-wireframes.md → Figma high-fi**:
```
Home es minimalista (balance grande, 3 CTAs, últimas transacciones)
→ En high-fi: balance verde prominente, botón "Enviar dinero" azul primary

Send money es 3 pasos lineales:
→ En high-fi: progress indicator (Step 1/3), animaciones transición
```

---

## 📝 Template para comentarios durante testing

Si testas con estos wireframes, usa este template:

```markdown
**SESIÓN TESTING**: [Dashboard / Mobile]
Fecha: ___
Usuario: ___ (años experiencia)

TASK 1: [Descripción]
- Time: ___ s/m
- Clicks: ___
- Success: yes/no
- Observations: [Qué pasó]
- Quote: "[Lo que dijo usuario]"

TASK 2: ...

ISSUES:
❌ Crítico: [Qué no funciona]
⚠️  Mayor: [Qué duele]
✅ Bueno: [Qué funciona bien]

SUGERENCIAS del usuario:
- [Feature X]
- [Ubicar Y en Z]
```

---

## 🔗 Links a otros docs del proyecto

- **User Flows detallados**: [→ user-flows.md](user-flows.md)
- **Architecture & Tech**: [→ docs/01-tech-selection/](../../docs/01-tech-selection/)
- **Design System (High-Fi)**: [→ design/02-high-fidelity/](../02-high-fidelity/)
- **CEO responses**: [→ ceo-responses/](../../ceo-responses/)

---

## ❓ Preguntas Frecuentes

**P: ¿Por qué wireframes en markdown y no Figma?**  
R: Velocidad. Markdown es más rápido de crear y iterar que Figma. Cuando validamos, hacemos prototipo en Figma.

**P: ¿Estos wireframes son suficientes para desarrollo?**  
R: No. Desarrolladores necesitan high-fi mockups + design tokens. Estos son para validación conceptual.

**P: ¿Puedo empezar coding con estos wireframes?**  
R: No recomendado. Espera a high-fi design + prototipos Figma. El coste de cambio es mínimo ahora pero masivo después.

**P: ¿Cuánto tiempo toma de wireframe a producción?**  
R: ~7-10 semanas (validación 1w + high-fi design 2w + dev 4-6w + testing 1w)

---

**Creado**: 2026-03-01  
**Última actualización**: 2026-03-01  
**Propietario**: UX Lead + Design Lead  
**Estado**: ✅ LISTO PARA VALIDACIÓN
