# Sistema de Carrito de Compras (Evidencia 3)

Programa de consola en Java que implementa un sistema interactivo de carrito de compras. El proyecto destaca por la aplicación de principios avanzados de Programación Orientada a Objetos (POO) y el uso de las características de Java 8, como Streams, expresiones Lambda y referencias a métodos.

**Autor:** Roberto Daniel Ramos Flores

## Características Principales

- **POO Avanzada:** Implementa abstracción mediante la clase abstracta `ProductoBase`, herencia en la clase concreta `Producto`, y establece contratos de comportamiento a través de la interfaz `Descontable`.
- **Procesamiento Funcional:** Sustituye los bucles tradicionales por la API de Java Streams y Lambdas para filtrar productos, aplicar descuentos globales y calcular sumatorias de manera declarativa (utilizando métodos como `mapToDouble`, `sum`, `filter` y `ifPresentOrElse`).
- **Gestión del Carrito:** Permite visualizar un catálogo predefinido, agregar artículos al carrito realizando búsquedas de coincidencia de nombres (ignorando mayúsculas/minúsculas), eliminarlos, y procesar la salida calculando el costo total con un 10% de descuento automático.
- **Manejo de Errores UI:** Incorpora un bloque `try-catch` para capturar la excepción `NumberFormatException` en el menú principal, previniendo el cierre abrupto del programa si el usuario ingresa letras en lugar de números.

## Tecnologías Utilizadas

- **Lenguaje:** Java (API Streams, Lambdas)
- **Paradigmas:** Programación Orientada a Objetos (POO)
- **Estructuras de datos:** `ArrayList` y `List`
- **Entorno de Desarrollo:** Visual Studio Code

## Estructura del Código

El proyecto está organizado de forma modular dentro del directorio `src`[cite: 6]:

- `ProductoBase.java`: Clase abstracta que actúa como plantilla base, encapsulando los atributos fundamentales (nombre y precio) y declarando el método abstracto de visualización[cite: 6].
- `Descontable.java`: Interfaz que define el contrato `aplicarDescuento(double porcentaje)` que cualquier entidad descontable debe cumplir[cite: 6].
- `Producto.java`: Entidad concreta que extiende de `ProductoBase` e implementa `Descontable`, proporcionando la lógica exacta para la reducción de precios y el formateo de impresión[cite: 6].
- `CarritoDeCompras.java`: Gestor de la colección dinámica del usuario. Contiene las rutinas funcionales para manipular la lista de compra y calcular el precio final[cite: 6].
- `Main.java`: Orquestador principal que levanta el menú interactivo, inicializa la base de datos simulada y maneja las entradas seguras del usuario a través de consola[cite: 6].
