# MVC con Observer: Alerta de Gasolina y Velocidad

- Si el coche va muy rápido (más de 200 km/h) o muy lento (menos de 90 km/h) arroja un mensaje por pantalla.
- Si la gasolina baja de 10 litros, también arroja una alerta.

---

## ¿Cómo está organizado el proyecto?

- **Model**: guarda la info de los coches.
- **View**: muestra mensajes en pantalla.
- **Controller**: hace de intermediario entre Model y View.
- **Observadores**: detectan cambios importantes (velocidad y gasolina) para lanzar alertas.
- **App**: donde se ejecuta todo.

---

### Problemas:

- No avisaba cuando la gasolina estaba baja.
- Al avanzar el coche y consumir gasolina, no avisaba que la gasolina bajó.


### Cambios:

- Creé un **ObserverGasolina** que solo se fija en el nivel de gasolina y avisa cuando baja de 10 litros.
- Ahora lanza una alerta con la cantidad que queda.
- Cuando el coche avanza y consume gasolina, se notifica automáticamente al observador para ver si hay alerta.
- Añadí JavaDocs para que el código sea más claro y fácil de seguir.
---

## Final
Para cheqeuar que funcionaba, lo probe varias veces.

---
```mermaid
sequenceDiagram
    participant App
    participant Model
    participant View
    participant ObserverVelocidad
    participant ObserverGasolina
    participant Controller
    
    
    App->>Controller: cambiarVelocidad(matricula, velocidad)
    Controller->>Model: cambiarVelocidad(matricula, velocidad)
    activate Model

    Model->>ObserverVelocidad: update(coche)
    deactivate Model
    activate ObserverVelocidad

    ObserverVelocidad->>View: alarmaInfraccion(matricula, velocidad)
    deactivate ObserverVelocidad
    activate View
    View-->>Usuario: mostrar mensaje de alarma
    deactivate View

    App->>Controller: ponerGasolina(matricula, litros)
    Controller->>Model: ponerGasolina(matricula, litros)
    activate Model

    Model->>ObserverGasolina: update(coche)
    deactivate Model
    activate ObserverGasolina

    ObserverGasolina->>View: alarmaGasolina(matricula, gasolina)
    deactivate ObserverGasolina
    activate View
    View-->>Usuario: mostrar alerta de gasolina baja
    deactivate View

    App->>Controller: avanzar(matricula, metros)
    Controller->>Model: avanzar(matricula, metros)
    activate Model
    Model->>ObserverGasolina: update(coche)
    deactivate Model
    activate ObserverGasolina
    ObserverGasolina->>View: alarmaGasolina(matricula, gasolina)
    deactivate ObserverGasolina
    activate View
    View-->>App: mostrar mensaje avance o error
    deactivate View

```

---

### Imagen del resultado por pantalla
![Captura de pantalla_2025-06-04_13-47-43.jpg](src/src/Captura%20de%20pantalla_2025-06-04_13-47-43.jpg)