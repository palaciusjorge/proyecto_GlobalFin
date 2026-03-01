# 📐 Wireframes — App Móvil B2C (Flutter)

**Fase 1: Low-Fidelity | Blanco y negro | Mobile-first design**

---

## Screen 1: Splash

```
┌──────────────────────┐
│                      │
│                      │
│    GlobalFin 🏦      │
│                      │
│  [Loading bar...]    │
│                      │
│   "Tu banco en       │
│    tu bolsillo"      │
│                      │
│                      │
└──────────────────────┘

Properties:
- Full screen
- Brand assets centered
- 2-3 seconds duration
- Auto-navigate to Login or Home (si ya auth)
```

---

## Screen 2: Login

```
┌──────────────────────┐
│                      │
│   GlobalFin 🏦       │
│                      │
│   INICIA SESIÓN      │
│                      │
│   [Email]            │
│   [📧 user@.....]    │
│                      │
│   [Password]         │
│   [🔑 ••••••••]       │
│                      │
│   [ ] Guardar datos  │
│                      │
│   [Iniciar sesión]   │
│   (Blue, fullwidth)  │
│                      │
│   ─────────────────  │
│                      │
│   ¿No tienes cuenta? │
│   [Crear cuenta →]   │
│                      │
│   [Usar biometría 👆 ]│
│   (bottom, text link)│
│                      │
└──────────────────────┘

Keyboard: Email keyboard para email field
          Password keyboard para password field
          Auto-focus en email
```

---

## Screen 3: 2FA (Two-Factor Auth)

```
┌──────────────────────┐
│                      │
│  ← VERIFICACIÓN      │
│                      │
│  Código enviado a:   │
│  ju***@email.com     │
│                      │
│  [_] [_] [_] [_]     │
│  [_] [_]             │
│                      │
│  (Numeric keyboard)  │
│                      │
│  ─────────────────   │
│                      │
│  ¿No recibiste?      │
│  [Reenviar] (40s)    │
│                      │
│  [Cambiar email]     │
│                      │
└──────────────────────┘

UX Notes:
- Auto-focus primer input
- Auto-advance al 6 dígitos (sin botón)
- Countdown timer visible
```

---

## Screen 4: Home (Principal)

```
┌──────────────────────┐
│ GlobalFin        [👤]│
│                      │
│ Tu saldo actual      │
│                      │
│  $2,450.50           │
│  (Large, Green)      │
│                      │
│ [Últimas 24h: +50]   │
│                      │
│ ─────────────────    │
│                      │
│ [Enviar dinero] 📤   │
│  (Blue, primary)     │
│                      │
│ [Pedir dinero] 📥    │
│ [Más servicios] •••  │
│ (Gray, secondary)    │
│                      │
│ ─────────────────    │
│                      │
│ Últimas transacciones│
│                      │
│ María López          │
│ -$50.00      2h ago  │
│                      │
│ Apple Store          │
│ -$12.99      1d ago  │
│                      │
│ Sueldo               │
│ +$3,500.00   3d ago  │
│                      │
│ [Mostrar todas →]    │
│                      │
│ ─────────────────    │
│ [Home][Trans][👤]    │
│ (Bottom nav)         │
│                      │
└──────────────────────┘

Colors:
- Balance: GREEN (#4CAF50) or matching brand
- CTA: BLUE (#1F77D2)
- Amount out: RED
- Amount in: GREEN
```

---

## Screen 5: Send Money - Step 1 (Select Recipient)

```
┌──────────────────────┐
│ ← Enviar dinero      │
│                      │
│ [🔍 Buscar...]       │
│                      │
│ FAVORITOS            │
│                      │
│ 👤 María López       │
│    maria@example.com │
│                      │
│ 👤 Juan García       │
│    juan@example.com  │
│                      │
│ ─────────────────    │
│ CONTACTOS RECIENTES  │
│                      │
│ 👤 Sofia Ruiz        │
│ 👤 Pedro Costa       │
│ 👤 Luis Martín       │
│ 👤 Ana Fernández     │
│                      │
│ ─────────────────    │
│ [Uso IBAN/Email]     │
│                      │
└──────────────────────┘

Interaction:
- Search filters list
- Tap contact → next step
- IBAN option opens text input
```

---

## Screen 6: Send Money - Step 2 (Amount & Concept)

```
┌──────────────────────┐
│ ← Enviar dinero      │
│                      │
│ A: María López       │
│    maria@ex...       │
│                      │
│ ─────────────────    │
│                      │
│ Monto                │
│ [$] [_____________]  │
│      (Numeric KB)    │
│                      │
│ Concepto (opcional)  │
│ [_____________]      │
│ "Dinner, salary, etc"│
│                      │
│ Comisión             │
│ $0.00 (sin cargo)    │
│                      │
│ ─────────────────    │
│                      │
│ [SIGUIENTE]          │
│ (Blue, full-width)   │
│ (Disabled si monto=0)│
│                      │
└──────────────────────┘

Validation (real-time):
- Monto > 0 and <= balance
- Concept: max 140 chars
- Disable SIGUIENTE si inválido
```

---

## Screen 7: Send Money - Step 3 (Review)

```
┌──────────────────────┐
│ ← Confirmación       │
│                      │
│ Enviar a             │
│ María López          │
│ maria@example.com    │
│                      │
│ ─────────────────    │
│                      │
│ MONTO                │
│  $50.00              │
│  (Large, red)        │
│                      │
│ Concepto             │
│ Dinner               │
│                      │
│ Comisión             │
│ $0.00                │
│ ─────────────────    │
│ TOTAL                │
│ $50.00               │
│ (Bold)               │
│                      │
│ Fecha de envío       │
│ Hoy, 14:32           │
│                      │
│ ─────────────────    │
│                      │
│ [EDITAR]       [ENVIAR]│
│ (Gray)         (Blue)  │
│                      │
│ □ No volver a        │
│   preguntar para    │
│   María              │
│                      │
└──────────────────────┘
```

---

## Screen 8: Send Money - Success

```
┌──────────────────────┐
│                      │
│                      │
│        ✅ Checkmark  │
│    (Animated bounce) │
│                      │
│  ¡Envío exitoso!    │
│                      │
│  Se envió $50 a      │
│  María López         │
│                      │
│  Fecha: 28/02/2026   │
│  Hora: 14:32         │
│  Ref: #TRX-4521      │
│                      │
│  ─────────────────   │
│                      │
│  [Compartir recibo]  │
│  (Share icon + text) │
│  [Ver detalles]      │
│                      │
│  ─────────────────   │
│                      │
│  [VOLVER AL INICIO]  │
│                      │
│                      │
└──────────────────────┘

Animation: Checkmark slides in + bounce + confetti optional
```

---

## Screen 9: Transactions List

```
┌──────────────────────┐
│ Transacciones    [☰] │
│                      │
│ [Hoy │ Semana │ Mes] │
│ (Segmented control)  │
│                      │
│ HOY                  │
│ ─────────────────    │
│ 14:32                │
│ 📤 María López       │
│ -$50.00              │
│                      │
│ 10:15                │
│ 🏪 Apple Store       │
│ -$12.99              │
│                      │
│ ─────────────────    │
│ AYER                 │
│ ─────────────────    │
│ 📥 Sueldo            │
│ +$3,500.00           │
│ (Date: Feb 27)       │
│                      │
│ 16:45                │
│ 📤 Transferencia     │
│ -$100.00             │
│                      │
│ ⭐️ Pull-to-refresh   │
│                      │
└──────────────────────┘

Interaction:
- Tap row → Detail screen
- Swipe down → Refresh
- Segment tabs filter date
```

---

## Screen 10: Transaction Detail

```
┌──────────────────────┐
│ ← Detalles           │
│                      │
│ De/A:                │
│ 👤 María López       │
│ maria@example.com    │
│                      │
│ ─────────────────    │
│                      │
│ MONTO                │
│ -$50.00 (Red)        │
│                      │
│ ESTADO               │
│ ✓ Completado         │
│                      │
│ CONCEPTO             │
│ Dinner               │
│                      │
│ FECHA Y HORA         │
│ 28/02/2026, 14:32    │
│                      │
│ REFERENCIA           │
│ #TRX-4521            │
│                      │
│ ─────────────────    │
│                      │
│ [Descargar PDF]      │
│ [Denunciar]          │
│ (Red, text)          │
│                      │
└──────────────────────┘
```

---

## Screen 11: Profile

```
┌──────────────────────┐
│ Perfil           [⚙] │
│                      │
│      👤 (Avatar)     │
│   Juan García        │
│   juan@example.com   │
│                      │
│ ─────────────────    │
│                      │
│ INFORMACIÓN          │
│                      │
│ Email                │
│ juan@example.com     │
│ (Editable)           │
│                      │
│ Teléfono             │
│ +34 912 345 678      │
│ (Editable)           │
│                      │
│ ─────────────────    │
│                      │
│ AUTENTICACIÓN        │
│                      │
│ Face ID         [ON] │
│ Huella          [ON] │
│                      │
│ ─────────────────    │
│                      │
│ CONFIGURACIÓN        │
│                      │
│ Tema:                │
│ ○ Light  ○ Dark      │
│                      │
│ Idioma:              │
│ [Español ↓]          │
│                      │
│ Notificaciones: [ON] │
│                      │
│ ─────────────────    │
│ [Términos] [Privacidad]│
│ [v0.1.0]             │
│                      │
│ [CERRAR SESIÓN]      │
│ (Red)                │
│                      │
└──────────────────────┘
```

---

## Screen 12: Settings Modal

```
┌──────────────────────┐
│ Cambiar contraseña   │
│                      │
│ Contraseña actual    │
│ [••••••••]           │
│                      │
│ Nueva contraseña     │
│ [••••••••]           │
│ (8+ chars, 1 upper,  │
│  1 number required)  │
│                      │
│ Confirmar            │
│ [••••••••]           │
│                      │
│ ─────────────────    │
│                      │
│ [CANCELAR]  [GUARDAR]│
│                      │
└──────────────────────┘

Validación:
- Password strength meter
- Requirements visible
- Save disabled si weak
```

---

## Screen 13: Empty State

```
┌──────────────────────┐
│ Transacciones        │
│                      │
│                      │
│      (Empty icon)    │
│                      │
│   Sin transacciones  │
│                      │
│  Aún no has realizado│
│  ninguna transacción │
│                      │
│   [Enviar dinero →]  │
│                      │
│                      │
└──────────────────────┘
```

---

## Screen 14: Error State

```
┌──────────────────────┐
│                      │
│       ⚠️ Error       │
│                      │
│  No se pudo enviar   │
│  Intenta más tarde   │
│                      │
│  Error: TIMEOUT      │
│                      │
│  [REINTENTAR]        │
│  [CONTACTAR SOPORTE] │
│                      │
└──────────────────────┘
```

---

## Especificaciones técnicas

### Navigation Stack
```
Splash
└─ (Auth required) Login ─┐
    │                     ├─ 2FA
    │                     │  │
    └─ Home ──────────────┘
       ├─ Transactions
       │  └─ Transaction Detail
       ├─ Send Money (flow: step1 → step2 → step3 → success)
       │  └─ Success
       └─ Profile
          └─ Settings
```

### Keyboard Handling
- Numeric keyboard para monto
- Email keyboard para email
- Text keyboard default
- Auto-dismiss keyboard swiping down

### Responsive breakpoints
- Mobile: 375px-480px (Primary)
- Tablet: 768px+ (Secondary, no wireframed)

### Bottom Navigation (persistent en Home)
```
┌─────────────────────┐
│ [Home] [Trans] [👤] │
│ Active: Blue        │
│ Inactive: Grey      │
└─────────────────────┘
```

### Safe Area
- iPhone notch/dynamic island
- Android system bars
- Padding around edges

---

## Color indicators por estado transacción

| Estado | Color | Icono |
|--------|-------|-------|
| Completado | Green | ✓ |
| Pendente | Amber | ⏳ |
| Fallido | Red | ✗ |
| Enviado | Orange | ► |

---

## Microinteractions identificadas

1. **Pull-to-refresh**: Tabla transacciones
2. **Checkmark animation**: Success screen
3. **Input focus**: Keyboard slides up suave
4. **Swipe to delete**: Transacciones (future)
5. **Haptic feedback**: Confirmación envío

---

## Accesibilidad notas

- [ ] Touch targets >= 48x48 dp
- [ ] Sufficient contrast (WCAG AA)
- [ ] Semantic labels para inputs
- [ ] Screen reader compatible
- [ ] Dark mode support

---

**Estado**: ✅ Wireframes low-fidelity móvil completados  
**Próximo**: Validación con usuarios + feedback  
**Fecha**: 2026-03-01
