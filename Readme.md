# App de Coche - Patrón MVC

## Funcionalidades

Se han añadido las funciones:
- **Avanzar (metros)**: el coche consume gasolina dependiendo de la distancia y la velocidad.
- **Poner gasolina (litros)**: se incrementa el nivel de gasolina del coche.

## Implementación

La lógica está separada en 3 capas:
- `Model.java` gestiona los datos (lista de coches).
- `View.java` muestra el menú y recibe entradas del usuario.
- `Controller.java` coordina las acciones del usuario con el modelo.

## Uso

1. Se cargan 3 coches al iniciar la app.
2. Desde el menú puedes avanzar o poner gasolina.
