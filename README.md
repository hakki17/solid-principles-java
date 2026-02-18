# solid-principles-java

# Laboratorio SOLID Principles

---

## Integrantes del Grupo

> María Paula Sánchez Macías

---

## Principios SOLID Implementados

Este laboratorio realizado implementó los cinco principios SOLID de diseño orientado a objetos.

> **SRP - Single Responsibility Principle**

Cada clase tiene una única responsabilidad. Se separó la clase Invoice en Customer, Invoice, InvoiceCalculator, InvoicePrinter e InvoiceRepository.

> **OCP - Open/Closed Principle**

Las clases están abiertas para extensión pero cerradas para modificación. Se creó una interfaz DiscountStrategy con implementaciones RegularDiscount y VIPDiscount.

> **LSP - Liskov Substitution Principle**

Las subclases pueden sustituir a sus clases base sin romper el funcionamiento. Se creó la interfaz Car implementada por GasCar y ElectricCar, cada uno con sus propios métodos específicos.

> **ISP - Interface Segregation Principle**

Los clientes no dependen de interfaces que no usan. Se dividió la interfaz Worker en Workable y Eatable, permitiendo que Developer solo implemente Workable.

> **DIP - Dependency Inversion Principle**

Las clases de alto nivel no dependen de clases de bajo nivel. OrderProcessor recibe una interfaz Database por constructor en lugar de instanciar directamente MySQLDatabase.

---

## Patrones de Diseño Aplicables

> **Strategy Pattern**

Aplicado en OCP con DiscountStrategy. Permite cambiar el algoritmo de descuento en tiempo de ejecución sin modificar el código cliente.

> **Dependency Injection**

Aplicado en DIP. Las dependencias se inyectan por constructor en lugar de crearlas internamente, facilitando el testing y mantenimiento.

> **Factory Pattern**

Podría aplicarse para crear instancias de Database o DiscountStrategy según configuración, evitando acoplamiento directo.

> **Adapter Pattern**

Útil cuando se necesita integrar sistemas legacy que no implementan las interfaces definidas (Database, MessageService, etc).

---

## Estructura del Proyecto
```
src/
├── main/java/com/example/solid/
│   ├── srp/    - Single Responsibility Principle
│   ├── ocp/    - Open/Closed Principle
│   ├── lsp/    - Liskov Substitution Principle
│   ├── isp/    - Interface Segregation Principle
│   └── dip/    - Dependency Inversion Principle
└── test/java/com/example/solid/
    └── [tests correspondientes]
```

---

## Ejecución

> **Compilar el proyecto**
```bash
mvn compile
```

> **Ejecutar tests**
```bash
mvn test
```

> **Limpiar y compilar**
```bash
mvn clean compile
```

---
