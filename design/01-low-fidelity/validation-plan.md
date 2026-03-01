# ✅ Validación de Wireframes — Plan de Testing

**Fase 1: Low-Fidelity | User Research & Feedback Collection**

---

## Objetivo

Validar que los wireframes **coinciden con el modelo mental** de usuarios reales antes de invertir en high-fidelity design y código.

**Pregunta principal**: *"¿Dónde espera el usuario encontrar [X]? ¿Cuántos clicks necesita?"*

---

## Plan de participantes

### Dashboard B2B
- **3-5 usuarios**: Analistas bancarios con 5+ años experiencia
- **Duración sesión**: 45-60 minutos
- **Method**: Think-aloud protocol (usuario verbaliza pensamiento)
- **Formato**: Presentación de wireframes en Figma (clickeable) o impreso

### App Móvil B2C
- **3-5 usuarios**: Clientes de fintech (Revolut, Wise, Stripe users)
- **Duración sesión**: 30-40 minutos
- **Method**: Task-based testing (se les da tareas específicas)
- **Formato**: Prototipos Figma interactivos en celular

---

## Sesión 1: Dashboard (B2B)

### Tareas de Testing

#### Tarea 1: Localizar información crítica
```
PROMPT: "Eres analista. Necesitas ver rápidamente qué cuentas tienen saldo crítico. 
Dónde buscarías esa información y cuántos clicks te llevaría."

OBJETIVO (el usuario debería):
  ✓ Entender que la tabla principal es el lugar correcto
  ✓ Identificar que columnas resaltadas = información principal
  ✓ Reconocer que el STATUS color (rojo) = crítico
  ✓ Tardar <10 segundos

DATO CUANTITATIVO:
  Time-to-task: ___ segundos
  Clicks: ___ 
  Accuracy: __ %

PREGUNTA FOLLOW-UP:
  "Sin tocar nada, ¿Dónde harías click para ver más detalles?"
```

#### Tarea 2: Aplicar filtro
```
PROMPT: "Necesitas ver solo cuentas con saldo CRÍTICO desde hace 7 días. 
¿Cómo lo harías?"

OBJETIVO:
  ✓ Usuario abre "Filtros avanzados"
  ✓ Selecciona Status = Crítico
  ✓ Configura rango de fecha
  ✓ Aplica (sin buscar botón explícito si es auto-apply)
  ✓ <20 segundos

DATO:
  Time-to-task: ___
  Steps: ___
  Confidence level: Low / Med / High
```

#### Tarea 3: Bulk action
```
PROMPT: "Ahora quieres bloquear las 3 cuentas críticas que ves. 
¿Cómo lo harías?"

OBJETIVO:
  ✓ Usuario selecciona múltiples filas (Ctrl+click o checkboxes)
  ✓ Aparece toolbar con opciones
  ✓ Encuentra botón "Bloquear"
  ✓ Confirma en modal
  ✓ <30 segundos

DATO:
  Time-to-task: ___
  Error count: ___
  Clicks: ___
```

#### Tarea 4: Usar atajos de teclado
```
PROMPT: "¿Ves algún atajo de teclado que te fuera útil?
Cuál usarías primero?"

OBJETIVO:
  ✓ Usuario identifica Ctrl+F para búsqueda
  ✓ Usuario menciona Ctrl+S para guardar
  ✓ Usuario nota Esc para cerrar modales

DATO:
  Shortcuts noticed: ___
  Shortcuts mentioned spontaneously: ___
  Would use: yes/no
```

#### Tarea 5: Exportar datos
```
PROMPT: "Necesitas enviar un reporte CSV al gerente con las 234 cuentas filtradas. 
¿Cómo lo exportarías?"

OBJETIVO:
  ✓ Usuario encontraría botón Export
  ✓ Selectiona formato CSV
  ✓ Opción para "datos filtrados"
  ✓ <15 segundos

DATO:
  Time-to-task: ___
  Correct format selected: yes/no
  Confidence: ___
```

### Preguntas de feedback abierto (Dashboard)

1. **Jerarquía visual**: "¿Cuáles son los 3 datos más importantes que ves en la tabla? ¿Por qué?"

2. **Ubicación**: "¿Dónde te gustaría que estuviera el botón [X]?"

3. **Flujo general**: "Si tuvieras que cambiar algo del flujo, ¿qué sería?"

4. **Comparativa**: "¿Es mejor que el dashboard actual? ¿En qué?"

5. **Accesibilidad**: "¿Puedes navegar solo con teclado? ¿Te falta algo?"

---

## Sesión 2: App Móvil (B2C)

### Tareas de Testing

#### Tarea 1: Login rápido
```
PROMPT: "Abre la app y haz login. Ve qué tan rápido puedes entrar."

OBJETIVO:
  ✓ Email → Password → 2FA → Home
  ✓ <60 segundos (de verdad)
  ✓ Usuario no se pierde

DATO:
  Time-to-task: ___
  Steps: ___
  Struggled with: ___
```

#### Tarea 2: Enviar dinero a contacto
```
PROMPT: "Quieres enviar $50 a María López. Hazlo paso a paso."

OBJETIVO:
  ✓ Step 1: Selecciona María de favoritos
  ✓ Step 2: Ingresa $50
  ✓ Step 3: Confirma
  ✓ <120 segundos
  ✓ Usuario confía en los pasos

DATO:
  Time-to-task: ___
  Completed successfully: yes/no
  Clicked back at any point: ___
  Hesitations: ___
```

#### Tarea 3: Ver transacción anterior
```
PROMPT: "¿Cuál fue tu última transacción? Abre los detalles."

OBJETIVO:
  ✓ Usuario navega a Transacciones
  ✓ Encuentra transacción reciente
  ✓ Abre detail
  ✓ <20 segundos

DATO:
  Time-to-task: ___
  Clicks: ___
  Found without help: yes/no
```

#### Tarea 4: Cambiar configuración
```
PROMPT: "Activa Dark Mode en preferencias."

OBJETIVO:
  ✓ Usuario abre Perfil
  ✓ Abre Configuración
  ✓ Encuentra Theme toggle
  ✓ Lo activa
  ✓ <15 segundos

DATO:
  Time-to-task: ___
  Clicks: ___
```

#### Tarea 5: Bottom navigation
```
PROMPT: "Sin instrucción, ¿qué secciones esperas encontrar en la app?"

OBJETIVO:
  Revisar si los 3 tabs (Home, Transacciones, Perfil) son intuitivos
  
DATO:
  Tabs guessed correctly: ___/3
  Additional tabs expected: ___
```

### Preguntas de feedback abierto (Móvil)

1. **Velocidad**: "¿Se siente rápida? ¿Dónde es lenta?"

2. **Confianza**: "¿Confiarías en esta app para enviar dinero?"

3. **Competencia**: "¿Es mejor que Revolut/Wise? ¿En qué?"

4. **Características faltantes**: "¿Qué feature te gustaría que tuviera?"

5. **Accesibilidad**: "¿Es fácil tocar todo? ¿Los botones son grandes?"

---

## Guión de la sesión

### Inicio (5 min)
```
"Hola [Usuario], gracias por venir. 
Este es un wireframe (esquema) de nuestro nuevo [Dashboard/App]. 
No es el diseño final, es blanco y negro, solo para validar el flujo.
Tu tarea es pensar en voz alta mientras usas esto.
No hay respuestas incorrectas. Si algo no funciona, es feedback valioso.
¿Preguntas?"
```

### Testing (30-40 min)
```
Leo tarea → Usuario la realiza → Pido feedback → Siguiente tarea
(Es think-aloud, así que escucho qué dice mientras usa)
```

### Cierre (5-10 min)
```
"Ánimo si hay algo incómodo. Esto se arreglará en el diseño final.
Última pregunta: ¿Hay algo crítico que no funcione?
Muchas gracias!"
```

---

## Matriz de evaluación de resultados

### Métricas cuantitativas (Zeit)

| Métrica | Bueno ✅ | Aceptable ⚠️ | Crítico ❌ |
|---------|----------|------------|----------|
| Time-to-task (búsqueda) | <10s | 10-20s | >20s |
| Time-to-task (filter) | <20s | 20-40s | >40s |
| Time-to-task (send money) | <2m | 2-4m | >4m |
| Clicks para completar | ≤3 | 4-6 | >6 |
| First-attempt success | ≥80% | 60-80% | <60% |
| Error recovery | <5s | 5-15s | >15s |

### Métricas cualitativas (Think-aloud)

```
Código comentarios:
❌ Critical: Imposible encontrar / funciona mal / confuso
⚠️  Issue: Podría mejorar, usuario dudó
✅ Good: Usuario lo hizo intuitivamente
💡 Nice: Usuario sugiere feature que suma valor
```

Ejemplo conmigo:
```
Dashboard:
- ✅ Tabla página uno → usuario ve inmediatamente
- ⚠️  Filtro avanzado → usuario tardó 15s en encontrarlo
- ❌ Atajos de teclado → usuario no los vio incluso en help modal
- 💡 Usuario sugiere agregar "saved filters" → buena idea para roadmap
```

---

## Documento de conclusiones

Después de la sesión, compilar:

**GlobalFin Wireframe Feedback Report**
```
Fecha: ___
Usuarios testeados: ___ (X dashboard, Y móvil)

DASHBOARD:
- Task 1 (Buscar críticas):    TIME: __, ACCURACY: __%
- Task 2 (Filtrar):            TIME: __, CLICKS: __
- Task 3 (Bulk actions):       TIME: __, SUCCESSFUL: yes/no
- Task 4 (Atajos):             FOUND: ___/4, WOULD USE: yes/no
- Task 5 (Export):             TIME: __, FOUND FEATURE: yes/no

ISSUES ENCONTRADOS:
❌ CRÍTICOS (bloquean release):
  - Atajos no visibles en help modal
  - Filtro avanzado no intuitivo
  
⚠️  MAYORES (fix antes de high-fi):
  - Columnas podrían tener menos horizontal scroll
  - Botones de acción podrían ser más grandes

✅ MENORES (arreglar en siguiente versión):
  - Pequeños cambios de texto en labels

MÓVIL:
- Task 1 (Login):       TIME: __, SUCCESS: yes/no
- Task 2 (Send money):  TIME: __, CONFIDENT: high/med/low
- Task 3 (Ver historial): TIME: __, INTUITIVE: yes/no
- Task 4 (Settings):    TIME: __, FOUND: yes/no
- Task 5 (Navigation):  GUESSED: ___/3 tabs

INSIGHTS:
- "Usuarios esperaban Face ID en login" → agregar mockup
- "La confirmación de envío es muy tranquilizadora" → keeping this in high-fi
- "Dark mode placement es raro" → mover a settings top

RECOMENDACIONES:
1. Agregar visual shortcut legend en toolbar
2. Simplificar filtro avanzado (1 atributo por fila)
3. Aumentar espacios entre botones en móvil
```

---

## Próximos pasos post-validación

1. **Compilar feedback** en documento único
2. **Iterar wireframes** si hay issues críticos (1-2 días)
3. **Re-validar** si cambios grandes (2-3 usuarios)
4. **Congelar wireframes** → lista para high-fidelity design
5. **Crear design system** en Figma (tokens, colores, tipografía)

---

## Checklist de preparación

- [ ] Wireframes listos en Figma (clickeable) o PDF
- [ ] Script de tareas escrito y probado
- [ ] Grabación de sesión (si permitido)
- [ ] Notas preparadas (forma para feedback)
- [ ] Usuarios contactados y confirmados
- [ ] Sala/laptop lista para testing
- [ ] Consentimiento informado firmado (RGPD/Privacy)

---

**Estado**: 📋 Plan de validación listo  
**Fecha**: 2026-03-01  
**Propietario**: UX Lead + Design Lead
