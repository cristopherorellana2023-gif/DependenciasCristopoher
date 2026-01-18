Proyecto Videoclub

Objetivo rápido
- El repositorio contiene una implementación simple de un videoclub con persistencia en JSON (clases `JsonPeliculaDao`, `JsonSocioDao`, `JsonAlquilerDao`) y un servicio acoplado (`AlquilerService`).
- La tarea de los alumnos es aplicar Inversión de Dependencias / Inyección de Dependencias para desacoplar `AlquilerService` de las implementaciones concretas.

Conceptos clave (muy breve)

1) Inversión de Control (IoC)
- Idea: en vez de que una clase controle sus dependencias, se invierte el control y otro componente "inyecta" o proporciona esas dependencias.
- Resultado: clases más pequeñas y desacopladas; el flujo de construcción de objetos se controla desde fuera.

2) Inversión de Dependencias (Dependency Inversion Principle, DIP)
- Principio SOLID: los módulos de alto nivel no deben depender de módulos de bajo nivel; ambos deben depender de abstracciones (interfaces).
- En la práctica: `AlquilerService` (módulo de alto nivel) debe depender de una interfaz `AlquilerDao`/`PeliculaDao`/`SocioDao`, no de `Json*Dao` concretas.

3) Inyección de Dependencias (DI)
- Patrón para proporcionar las dependencias a una clase (constructor, setter o por campo).
- Ejemplo: en lugar de que `AlquilerService` cree `new JsonPeliculaDao(...)`, se le pasa un objeto que implementa `PeliculaDao` desde fuera (constructor).
