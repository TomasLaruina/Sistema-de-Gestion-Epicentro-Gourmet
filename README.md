# 🍔 Sistema de Gestión - Epicentro Gourmet

Sistema desarrollado en Java para la administración de festivales gastronómicos, permitiendo gestionar unidades de venta, personal, pedidos, platos y reportes de negocio.

## 👥 Integrantes

- Nahuel Garcia
- Emanuel Ezequiel Ledesma Rodriguez
- Emiliano Luca Ledesma Rodriguez
- Tomas Laruina

## 📖 Descripción

Epicentro Gourmet organiza festivales gastronómicos en distintas temporadas del año. El sistema permite administrar:

- Festivales gastronómicos.
- Unidades de venta.
- Personal de trabajo.
- Platos ofrecidos.
- Pedidos realizados durante los eventos.
- Reportes de recaudación y rentabilidad.

---

## 📁 Estructura del Proyecto

```text
src/
│
├── modelo/
│   ├── Sistema.java
│   ├── Festival.java
│   ├── UnidadDeVenta.java
│   ├── FoodTruck.java
│   ├── PuestoDesarmable.java
│   ├── Staff.java
│   ├── Cocinero.java
│   ├── Cajero.java
│   ├── Pedido.java
│   ├── ItemPedido.java
│   ├── Plato.java
│   ├── ReporteVenta.java
│   ├── ReporteMayoresCanon.java
│   ├── Costo.java
│   ├── Temporada.java
│   └── Turno.java
│
└── test/
    └── TestFestival.java
```

---

## 🧪 Testing

El proyecto incluye una clase `TestFestival` con 31 pasos donde se verifican:

- Altas, bajas y búsquedas de staff, unidades y festivales.
- Asignación de unidades a festivales y staff a unidades.
- Pedidos con ítems (agregar, traer, eliminar).
- Reportes de recaudación y ranking de unidades.
- Cálculos de canon (FoodTruck y PuestoDesarmable).
- Rentabilidad neta y entre fechas.
- Plato estrella por festival.
- Auditoría de personal.
- Antigüedad, edad y haberes del personal (Cocinero y Cajero).
- Validaciones de datos repetidos y errores.

---

## 🛠️ Tecnologías Utilizadas

- Java
- Eclipse IDE
- Git
- GitHub

---

## 📚 Conceptos Aplicados

- UML
- Programación Orientada a Objetos
- Colecciones (`ArrayList`)
- Manejo de fechas (`LocalDate`)
- Enumerados (`enum`)
- Sobrescritura de métodos
- Comparadores y ordenamiento
- Excepciones personalizadas mediante `IllegalArgumentException`

---

## 🚀 Estado del Proyecto

🛠️ En construcción...
