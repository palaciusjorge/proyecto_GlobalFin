# 📐 Wireframes — Dashboard B2B (JavaFX)

**Fase 1: Low-Fidelity | Blanco y negro | Enfoque en modelo mental**

---

## Screen 1: Main Dashboard

```
┌─────────────────────────────────────────────────────────────────────────────────┐
│                                                                                   │
│  [☰] GlobalFin Dashboard          [Search...]           [⚙] [👤] [→]           │
│                                                                                   │
├─────────────────────────────────────────────────────────────────────────────────┤
│ SIDEBAR                           │ MAIN CONTENT                                  │
│                                   │                                               │
│ □ Dashboard                       │ ┌────────────────────────────────────────┐   │
│ □ Cuentas                         │ │ RESUMEN (KPIs)                         │   │
│ □ Transacciones                   │ ├────────────────────────────────────────┤   │
│ □ Usuarios                        │ │  ↑ Saldo total: $500M    │ Transacciones │
│ □ Reportes                        │ │                           │ Hoy: 1,234    │
│ □ Configuración                   │ │  ⚠ Alertas críticas: 12   │ Semana: 8,900 │
│                                   │ │                           │ Mes: 45,000   │
│                                   │ └────────────────────────────────────────┘   │
│                                   │                                               │
│                                   │ [FILTROS AVANZADOS]                           │
│                                   │ ┌────── Advanced Search ──────┐               │
│                                   │ │ Status: [Crítico ✓][Penx]  │               │
│                                   │ │ Fecha: [  dd/mm  -  dd/mm] │               │
│                                   │ │ Monto: [Min $] - [Max $]   │               │
│                                   │ │ [🔍 Buscar] [Guardar dicho]│               │
│                                   │ └────────────────────────────┘               │
│                                   │                                               │
│                                   │ ┌─ TABLA PRINCIPAL ─────────────────────────┐│
│                                   │ │ ☐ │ ID      │ Cliente      │ Saldo    │   ││
│                                   │ │ ┌─┼─────────┼──────────────┼──────────┤   ││
│                                   │ │ │✓│ ACC-001 │ Juan García  │-$5,000 │✓  ││ Crítico
│                                   │ │ │ │ ACC-002 │ María López  │ $2,500 │   ││
│                                   │ │ │ │ ACC-003 │ Pedro Costa  │-$1,200 │   ││ Pendiente
│                                   │ │ │ │ ACC-004 │ Luis Martín  │   $500 │   ││
│                                   │ │ │ │ ACC-005 │ Sofia Ruiz   │ $8,900 │   ││
│                                   │ │ │ │ ACC-006 │ Carlos Díaz  │-$3,400 │✓  ││ Crítico
│                                   │ │ │ │ ...     │  ...         │   ...  │... ││
│                                   │ │ └─┴─────────┴──────────────┴──────────┘   ││
│                                   │ │ Mostrando 10 de 10,000 registros           ││
│                                   │ │ [< 1 2 3 ... 1000 >]                       ││
│                                   │ └──────────────────────────────────────────┘ │
│                                   │                                               │
└─────────────────────────────────────────────────────────────────────────────────┘

KEYBOARD SHORTCUTS (Help):
  Ctrl+F = Focus búsqueda
  Ctrl+A = Seleccionar todo
  Ctrl+S = Guardar cambios
  Esc   = Cerrar modal
  ↑↓    = Navegar tabla
  Enter = Abrir detalles
```

**Notas de diseño**:
- Sidebar fijo (no ocupa espacio tabla)
- Tabla es protagonista (80% ancho)
- Filtros visibles siempre (no ocultos)
- KPIs arriba para contexto rápido
- Toolbar con botones primarios: [Guardar] [Bloquear] [Exportar] [Más...]
- Columnas resaltadas: cliente (ancho) + saldo (color rojo si crítico)

---

## Screen 2: Detail Panel (Sidebar derecha)

```
┌─────────────────────────────────────────────────────────────────────────────────┐
│                                                                                   │
│  [Search...]                                    │ [DETAIL PANEL]              [X]│
│                                                 │                                 │
├─────────────────────────────────────────────────┼─────────────────────────────────┤
│                         TABLA                   │ CLIENTE: Juan García            │
│                                                 │ ─────────────────────────────── │
│  ☐ │ ID      │ Cliente            │ Saldo   │ ID CUENTA:     ACC-001            │
│  ┌──┼─────────┼────────────────────┼──────────┤ EMAIL:         juan@email.com    │
│  │✓│ ACC-001 │> Juan García       │-$5,000  │ TELÉFONO:      +34 912 345 678  │
│  │ │ ACC-002 │ María López        │ $2,500  │ SALDO:         -$5,000           │
│  │ │ ACC-003 │ Pedro Costa        │-$1,200  │ ESTADO:        ⚠ CRÍTICO         │
│  │ │ ACC-004 │ Luis Martín        │   $500  │ ÚLTIMA ACCIÓN: Bloqueo           │
│  │ │ ACC-005 │ Sofia Ruiz         │ $8,900  │ FECHA:         28/02/2026        │
│  │ │ ACC-006 │ Carlos Díaz        │-$3,400  │ ─────────────────────────────── │
│  │ │ ...     │  ...               │   ...   │                                 │
│  └──┴─────────┴────────────────────┴──────────┤ HISTORIAL DE ACCIONES:         │
│                                                 │ ─────────────────────────────── │
│                                                 │ 28/02 14:32 | Bloqueado        │
│                                                 │ 27/02 09:15 | Alerta enviada   │
│                                                 │ 26/02 16:45 | Monto validado  │
│                                                 │ 25/02 11:20 | Cuenta abierta  │
│                                                 │                                 │
│                                                 │ ─────────────────────────────── │
│                                                 │ [GUARDAR] [BLOQUEAR] [MÁS...]   │
│                                                 │                                 │
│                                                 │ (Presiona ESC para cerrar)      │
│                                                 │                                 │
└─────────────────────────────────────────────────┴─────────────────────────────────┘
```

**Notas**:
- Panel lateral (30% ancho)
- Se abre al click en fila
- Cierra con X o ESC
- Información clave visible inmediatamente
- Historial scrolleable
- Acciones primarias al pie

---

## Screen 3: Modal Confirmación

```
┌────────────────────────────────────────────────┐
│                                                │
│             CONFIRMACIÓN DE ACCIÓN             │
│                                                │
│  ¿Bloquear cuenta ACC-001?                    │
│  Cliente: Juan García                        │
│  Motivo: Saldo crítico negativo              │
│                                                │
│  Esta acción bloqueará todas las transacciones│
│  de esta cuenta hasta nueva notificación.     │
│                                                │
│  [Motivo bloqu:  __________________]          │
│  [Notas internas: ___________________]        │
│                                                │
│                                                │
│              [CANCELAR]     [CONFIRMAR]        │
│                                                │
└────────────────────────────────────────────────┘

Modal properties:
- Overlay fondo gris (20% opacity)
- Z-index alto
- Text-align center
- Botones: Cancelar (secondary), Confirmar (primary, rojo si destructivo)
- Esc cierra con "Cancelar"
```

---

## Screen 4: Filter Modal (Avanzado)

```
┌──────────────────────────────────────────────────────┐
│                                                      │
│  FILTROS AVANZADOS                             [← ]  │
│  ──────────────────────────────────────────────────  │
│                                                      │
│  STATUS (Multi-select)                             │
│  [□ Crítico  □ Pendiente  □ OK  □ Bloqueado]      │
│                                                      │
│  RANGO DE FECHA                                    │
│  Desde: [______] (dd/mm/yyyy)  [📅 picker]        │
│  Hasta: [______] (dd/mm/yyyy)  [📅 picker]        │
│                                                      │
│  RANGO DE MONTO                                    │
│  Mínimo: [$______]                                 │
│  Máximo: [$______]                                 │
│  [Slider visual: ←────●────→]                     │
│                                                      │
│  BÚSQUEDA                                          │
│  Cliente/IBAN: [_________________]                 │
│  ○ Contiene  ○ Exacto                            │
│                                                      │
│  ──────────────────────────────────────────────────  │
│                                                      │
│  GUARDADOS (Presets)                               │
│  □ "Mi filtro semanal" — Lunes a viernes, <$10K  │
│  □ "Alertas críticas" — Status = Crítico         │
│  [+ Guardar como nuevo]                           │
│                                                      │
│                                                      │
│  [LIMPIAR TODOS]        [APLICAR FILTROS]          │
│                                                      │
└──────────────────────────────────────────────────────┘

Nota: Se abre como drawer derecho o modal full-screen en móvil
```

---

## Screen 5: Export Dialog

```
┌────────────────────────────────────────┐
│                                        │
│  EXPORTAR DATOS                   [X]  │
│                                        │
│  Formato:                              │
│  ○ CSV (Excel)                         │
│  ○ PDF (Reporte)                       │
│  ○ JSON (API)                          │
│                                        │
│  Incluir:                              │
│  ☑ Datos visibles (10 filas)           │
│  ☐ Datos filtrados (234 filas)         │
│  ☐ Todos los datos (10,000 filas)      │
│                                        │
│  Columnas:                             │
│  ☑ ID          ☑ Cliente               │
│  ☑ Saldo       ☑ Estado                │
│  ☑ Fecha       ☑ Historial             │
│  [Mostrar más ↓]                       │
│                                        │
│  Nombre archivo: [Data_Export_280226] │
│                                        │
│                 [CANCELAR]  [EXPORTAR] │
│                                        │
└────────────────────────────────────────┘
```

---

## Screen 6: Empty State

```
┌──────────────────────────────────────────────────────────────┐
│                                                              │
│                                                              │
│                      [No results icon]                       │
│                                                              │
│                  Sin resultados                             │
│                                                              │
│  No hay registros que coincidan con tus filtros actuales   │
│                                                              │
│  Intenta:                                                  │
│  • Cambiar el rango de fechas                             │
│  • Modificar el estado seleccionado                       │
│  • Limpiar la búsqueda                                    │
│                                                              │
│                  [LIMPIAR FILTROS]                          │
│                                                              │
│                                                              │
└──────────────────────────────────────────────────────────────┘
```

---

## Screen 7: Error Handling

```
┌──────────────────────────────────────────┐
│                                          │
│  ⚠️  ERROR AL GUARDAR                   │
│                                          │
│  La conexión con el servidor expiró.    │
│  Verifica tu conectividad e intenta     │
│  nuevamente.                            │
│                                          │
│  Código: ERR_TIMEOUT_001                │
│  Error ID: #2026-02-28-445522           │
│                                          │
│  [REINTENTAR]     [CONTACTAR SOPORTE]   │
│                                          │
└──────────────────────────────────────────┘
```

---

## Screen 8: Loading State

```
┌─────────────────────────────────────────┐
│                                         │
│  [Tabla vacía com shimmer animation]   │
│                                         │
│  ┌───────────────────────────────────┐ │
│  │ ▓▓▓▓▓▓▓ │ ▓▓▓▓▓▓▓ │ ▓▓▓▓▓ │ ▓▓  │
│  │ ▓▓▓    │ ▓▓▓    │ ▓▓    │       │
│  ├───────────────────────────────────┤ │
│  │ ▓▓▓▓▓▓▓ │ ▓▓▓▓▓▓▓ │ ▓▓▓▓▓ │ ▓▓  │
│  │ ▓▓▓    │ ▓▓▓    │ ▓▓    │       │
│  ├───────────────────────────────────┤ │
│  │ ▓▓▓▓▓▓▓ │ ▓▓▓▓▓▓▓ │ ▓▓▓▓▓ │ ▓▓  │
│  └───────────────────────────────────┘ │
│                                         │
│  Cargando datos... (no bloquea UI)     │
│                                         │
└─────────────────────────────────────────┘

Note: Shimmer animation continua hasta data carga
```

---

## Especificaciones de comportamiento

### Tabla principal
- **Virtualización**: Render solo filas visibles (performance con 10k+ rows)
- **Click**: Row → abre detail sidebar (no full screen)
- **Doble-click**: Row → entra en modo edición (inline)
- **Drag**: Reordenar columnas (arrastre header)
- **Resize**: Aumentar/disminuir ancho columnas
- **Sort**: Click header → ascendente / descendente / sin sort

### Filtros
- **Auto-apply**: Filtro se aplica al cambiar (sin botón)
- **Persistencia**: Guardar filtro activo al cerrar app
- **Reset**: Botón "Limpiar" borra todos los filtros
- **Presets**: Guardar combinaciones frecuentes

### Atajos de teclado (resumen)
| Tecla | Acción |
|-------|--------|
| Ctrl+F | Focus barra búsqueda |
| Ctrl+A | Seleccionar todos en página |
| Ctrl+S | Guardar cambios |
| Ctrl+E | Exportar tabla |
| Ctrl+L | Limpiar filtros |
| Esc | Cerrar modal/sidebar |
| Tab | Navegar (forward) |
| Shift+Tab | Navegar (backward) |
| ↑/↓ | Moverse en tabla |
| Enter | Abrir detail fila seleccionada |
| Space | Seleccionar/deseleccionar fila |

---

## Paleta de colores (Low-Fi reference)

```
Crítico:  RED       (#F44336)
Warning:  ORANGE    (#FF9800)
OK:       GREEN     (#4CAF50)
Info:     BLUE      (#1F77D2)
Disabled: GREY      (#CCCCCC)
Hover:    LIGHT_BG  (#F5F5F5)
```

**Nota**: En low-fi son principalmente bloques de gris, pero se indican los colores para high-fi

---

**Estado**: ✅ Wireframes low-fidelity completados  
**Próximo**: Validación con usuarios + feedback  
**Fecha**: 2026-03-01
