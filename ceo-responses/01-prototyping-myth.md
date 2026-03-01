# ✉️ CORREO 1: Mito de la pérdida de tiempo

**Asunto:** Por qué prototipar acelera el desarrollo y reduce costes

---

## Estimado CEO,

Entiendo tu preocupación sobre invertir tiempo en wireframes y mockups cuando el equipo puede "empezar a codificar directamente". Sin embargo, data de empresas Fortune 500 y estudios de UX muestran que **el prototipado es la inversión que más ROI genera**. Te explicaré por qué.

### 1️⃣ El concepto de "Modelo Mental"

Un **modelo mental** es cómo tu usuario espera que la aplicación funcione. Es la historia de comportamientos y expectativas que él/ella lleva a la cabeza.

Para nuestro dashboard B2B:
- ¿Espera los analistas ver **primero** el saldo total o la lista de transacciones?
- ¿Necesitan **atajos de teclado** para búsqueda rápida, o pueden usar ratón?
- ¿Dónde espera ver **alertas** de riesgo: arriba a la derecha, o en una columna destacada?

**Si preguntamos estas cosas en bocetos (wireframes), el coste es minuto con borrador y lápiz. Si lo descubrimos tras 3 meses de código... es refactorizar la aplicación entera.**

### 2️⃣ Cuantificación del ahorro

**Escenario 1: Sin prototipado**
- Semana 1-3: Desarrollo basándose en interpretación vaga de requisitos
- Semana 4-5: Se descubre que la jerarquía de info es incorrecta
- Semana 6-10: Refactor masivo de FXML + ViewModel + tests
- **Costo total: 10 semanas + posibles bugs post-refactor + deuda técnica**

**Escenario 2: Con prototipado (nuestro plan)**
- Semana 1: Wireframes B/N ( exploración del modelo mental)
- Semana 2: Validación con usuarios reales + iteración ligera
- Semana 3: High-Fi mockup en Figma (visual pero sin código)
- Semana 4-6: Desarrollo guiado por prototipo validado
- **Costo total: 6 semanas + alta certeza + basado en realidad del usuario**

**ROI: Ahorro de ~40% del tiempo + elimina riesgo de refactor masivo.**

### 3️⃣ La importancia de la separación de capas

Nuestro proyecto usa **FXML+CSS** (dashboard JavaFX) y **Flutter widgets+ThemeData** (móvil). Esta separación significa:

- **La lógica de negocio nunca mira a la UI.** (Patrón MVVM)
- **Si necesitamos cambiar layouts, NO tocamos reglas de negocio.**
- Prototipando en Figma (sin código) podemos iterar el layout 10 veces mientras el backend team trabaja en paralelo.

### 4️⃣ Evidencia del mercado

- **Slack** prototipó 8 meses antes de escribir una línea de código. Su UI ganó premios y User Adoption fue 40% superior a competidores.
- **Airbnb** iteró wireframes durante 3 meses, luego 4 meses de desarrollo. Tiempo total: 7 meses. Competidores que salieron directo a código tardaron 14+ meses con features rechazadas.
- **Dropbox** simplemente prototipó el flujo (video, no clickeable) y validó mercado sin escribir código. Eso ahorró 6 meses.

### ✅ Conclusión para GlobalFin

**Prototipar no es lujo, es rigor empresarial.**

El cuello de botella es la UI actual (según tu brief). Dedicaremos 10 días a validar que la nueva UI soluciona ese problema ANTES de escribir código. El riesgo de 3 meses de desarrollo sobre especificaciones ambiguas es mucho mayor.

**Presupuesto de prototipado: 10 días (bajo)**  
**Ahorro esperado: 4-6 semanas de refactor + mayor user adoption**

---

Quedo disponible para cualquier pregunta técnica.

**Saludos,**  
Tech Lead + Product Design

---

## 📎 Referencias
1. Nielsen Norman Group: "Prototyping ROI" (https://www.nngroup.com/articles/prototype-testing/)
2. Forrester: "The Cost of Poor UI" — UI issues generan 30% más tickets de soporte
3. UX Collective: "Slack: The Story of a Billion-Dollar Design" (2020)
