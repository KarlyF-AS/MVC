# 🚗 Sistema de Gestión de Coches

## 🎯 Objetivo

Este proyecto implementa una aplicación básica para la gestión de coches siguiendo el patrón de arquitectura **MVC (Modelo - Vista - Controlador)**.

Funcionalidades implementadas:
- ✅ Crear coche
- ✅ Aumentar velocidad
- ✅ Disminuir velocidad
- ✅ Mostrar todos los coches

---

## 🧱 Arquitectura MVC

### Diagrama Mermaid

### Diagrama de secuencia Mermaid

```mermaid
sequenceDiagram
    participant App
    participant Controller
    participant Model
    participant View

    App->>Controller: iniciarAplicacion()
    activate Controller

    Controller->>Model: crearCoche("Toyota", "1234ABC")
    activate Model
    Model-->>Controller: true
    deactivate Model

    Controller->>Model: cambiarVelocidad("1234ABC", 50)
    activate Model
    Model-->>Controller: void
    deactivate Model

    Controller->>Model: acelerarCoche("1234ABC")
    activate Model
    Model-->>Controller: void
    deactivate Model

    Controller->>Model: getTodosLosCoches()
    activate Model
    Model-->>Controller: "Lista de coches"
    deactivate Model

    Controller->>View: mostrarTodosLosCoches()
    activate View
    View->>Model: getTodosLosCoches()
    activate Model
    Model-->>View: "Lista de coches"
    deactivate Model
    View-->>Controller: imprime cada coche
    deactivate View
```