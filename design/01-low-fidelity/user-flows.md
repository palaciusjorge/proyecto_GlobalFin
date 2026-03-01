# 🎯 User Flows — GlobalFin

**Fase 1: Low-Fidelity | Mapeo de flujos de usuario**

---

## Dashboard B2B (Empleados)

### Flow 1: Login → Dashboard → Búsqueda → Detalle

```
START: Login page
  ↓
[Email + Password]
  ↓
[2FA / Biometric]
  ↓
MAIN DASHBOARD
  ├─ Resumen (KPIs)
  ├─ Tabla principal
  └─ Toolbar (search, filters, actions)
  ↓
USER INTERACTS:
  ├─ Search bar (real-time) → filtrado tabla
  ├─ Click row → abre sidebar detalle
  ├─ Botón acción → modal confirmación
  └─ Teclado Ctrl+F → focus busca
  ↓
DETAIL PANEL
  ├─ Información completa
  ├─ Historial de acciones
  ├─ Botones primarios (guardar, bloquear, exportar)
  └─ Close (X) o ESC
  ↓
RETURN: Tabla actualizada
  ↓
END: User exports CSV o cambia usuario
```

### Flow 2: Filtrado avanzado

```
START: Usuario ve tabla sin filtrar (100+ rows)
  ↓
[Click "Avanzado"]
  ↓
FILTER MODAL
  ├─ Status (Crítico / Pendiente / OK) — multi-select chips
  ├─ Date range (calendar picker)
  ├─ Monto (slider range)
  ├─ Buscar por nombre/cuenta (text input)
  ├─ [Guardar filtro] — save preset
  └─ [Limpiar] — reset all
  ↓
[Click "Aplicar"]
  ↓
TABLA ACTUALIZADA
  ├─ Applied filters shown as tags
  └─ Row count: "234 de 10,000 coinciden"
  ↓
[Click chip "X"] — remove individual filter
  ↓
RETURN: Tabla re-filtra en tiempo real
  ↓
END
```

### Flow 3: Acciones bulk (seleccionar múltiples)

```
START: Tabla con 10+ rows visibles
  ↓
[Ctrl+A] o click "Select all on page"
  ↓
ROWS SELECCIONADAS (resaltadas)
  ↓
TOOLBAR APARECE: "3 elementos seleccionados"
  ├─ [Bloquear]
  ├─ [Enviar alerta]
  ├─ [Exportar]
  └─ [×] Clear selection
  ↓
[Click "Bloquear"]
  ↓
MODAL CONFIRMACIÓN
  ├─ "¿Bloquear 3 cuentas?"
  ├─ [Cancelar] [Confirmar]
  └─ Progress bar (si es async)
  ↓
FEEDBACK: Snackbar "✓ 3 cuentas bloqueadas"
  ↓
TABLE RELOADS
  ↓
END
```

---

## App Móvil B2C (Clientes)

### Flow 1: Onboarding → Home → Transacción

```
SPLASH SCREEN (brand + loading)
  ↓
LOGIN SCREEN
  ├─ Email input
  ├─ Password input
  ├─ [Iniciar sesión]
  ├─ [Crear cuenta]
  └─ [Usar biometría] — finger icon
  ↓
[Enter credentials]
  ↓
2FA SCREEN (SMS/Email code)
  ├─ "Código enviado a ***@email.com"
  ├─ 6-digit input (auto-focus)
  └─ [Resend code] link
  ↓
HOME SCREEN
  ├─ TOP: Balance (large number, color green)
  ├─ MID: Quick actions
  │   ├─ [Enviar dinero] (primary button)
  │   ├─ [Pedir dinero]
  │   └─ [Más servicios]
  ├─ MIDDLE: "Últimas transacciones"
  │   ├─ Row: Nombre | -$50.00 | 2h ago (tiemable)
  │   ├─ Row: Nombre | +$200.00 | 1d ago
  │   └─ [Ver todas]
  └─ BOTTOM NAV: Home | Transacciones | Perfil
  ↓
[Click "Enviar dinero"]
  ↓
SEND MONEY SCREEN
  ├─ Destinatario (select from contacts o IBAN)
  ├─ Monto (input con keyboard numérico)
  ├─ Concepto (optional text)
  ├─ Validación en tiempo real (monto > 0, IBAN válido)
  └─ [Continuar]
  ↓
CONFIRMATION SCREEN
  ├─ Resumen: "Enviar $100 a Juan"
  ├─ Fecha
  ├─ Comisión: -$0.50
  ├─ Total: $100.50
  └─ [Confirmar] [Editar]
  ↓
PROCESSING (spinner + "Procesando...")
  ↓
SUCCESS SCREEN
  ├─ ✓ Checkmark animation
  ├─ "¡Envío exitoso!"
  ├─ Número de referencia
  ├─ [Compartir recibo] (share sheet)
  └─ [Volver al inicio]
  ↓
RETURN: Home screen
  ↓
END
```

### Flow 2: Ver historial de transacciones

```
START: Home screen
  ↓
[Tab "Transacciones"]
  ↓
TRANSACTIONS LIST
  ├─ Filter bar (Today / Week / Month selection)
  ├─ Transactions grouped by date
  │   ├─ "Hoy"
  │   │   ├─ Row: Icon | Name | Amount | Time
  │   │   └─ Row: Icon | Name | Amount | Time
  │   ├─ "Ayer"
  │   │   ├─ Row: ...
  │   └─ "Hace 3 días"
  └─ Pull-to-refresh (reload)
  ↓
[Tap row]
  ↓
TRANSACTION DETAIL
  ├─ From/To: "Juan García"
  ├─ Amount: "-$50.00"
  ├─ Date: "Feb 28, 2026 | 14:32"
  ├─ Concepto: "Dinner"
  ├─ Status: "✓ Completado"
  ├─ Reference: "#TRX-2024-001"
  ├─ [Descargar recibo] (PDF)
  ├─ [Denunciar]
  └─ [← Volver]
  ↓
END
```

### Flow 3: Perfil y configuración

```
START: Home or [Tab "Perfil"]
  ↓
PROFILE SCREEN
  ├─ User avatar + name
  ├─ Email + phone (editable)
  ├─ [Cambiar contraseña]
  ├─ [Activos de autenticación]
  │   ├─ Face ID: ✓ activado
  │   └─ Huella: ✓ activado
  ├─ Configuración
  │   ├─ [Tema] Light / Dark
  │   ├─ [Idioma] Español / English
  │   └─ [Notificaciones] On/Off
  ├─ Legal
  │   ├─ [Términos y condiciones]
  │   ├─ [Política privacidad]
  │   └─ [Version app] 0.1.0
  └─ [Cerrar sesión]
  ↓
[Click "Cerrar sesión"]
  ↓
CONFIRM DIALOG
  ├─ "¿Deseas cerrar sesión?"
  ├─ [Cancelar] [Cerrar sesión]
  ↓
LOGIN SCREEN (vuelve al inicio)
  ↓
END
```

---

## Modelos mentales identificados

### Dashboard (B2B)
**Usuario típico**: Analista bancario, 50+ años, busca eficiencia

- **Modelo mental**: "Necesito encontrar rápido el dato crítico de entre 10,000"
- **Expectativa**: Jerarquía visual clara (principal/secundaria), búsqueda rápida, acciones con 2 clicks máx
- **Frustración actual**: Tablas densas, clickeos excesivos, confusión de botones

**Implicación UI**: 
- Columnas grandes para datos principales (cliente, saldo, status)
- Filtros visibles siempre (no ocultos en menú)
- Atajos de teclado obvios (Ctrl+F para search, Ctrl+S para guardar)
- Feedback inmediato (tabla actualiza al instante)

### App Móvil (B2C)
**Usuario típico**: Millennial, experto en UX, compara con Revolut/Stripe

- **Modelo mental**: "Quiero hacer transacción en <30 segundos, sin pasos redundantes"
- **Expectativa**: Flujo rápido (3 pantallas), confirmación clara, notificaciones inteligentes
- **Frustración actual**: Apps lentas, steps innecesarios, falta de biometría

**Implicación UI**:
- Home minimalista (balance grande, CTA primaria destacada)
- Transacción: 3 pasos (destinatario → monto → confirmar)
- Biometría para login (no forzar password)
- Animaciones suaves (no jumpy)

---

## Criterios de validación

Al terminar wireframes, preguntar usuarios:

- [ ] "¿Dónde buscarías [elemento X]?" → Si tarda >2 seg, mala ubicación
- [ ] "¿Cuántos clicks para [tarea Y]?" → Si >3, simplificar flujo
- [ ] "¿Qué significa este botón?" → Si no está claro, cambiar etiqueta/icono
- [ ] "¿Navegar sin ratón es posible?" (teclado/touch) → Si no, falta accesibilidad

---

**Fecha**: 2026-03-01  
**Propietario**: UX Lead  
**Estado**: ✅ Modelo mental mapeado | Pendiente: Wireframes low-fi en Figma
