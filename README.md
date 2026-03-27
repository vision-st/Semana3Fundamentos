# Ejercicios de Fundamentos de Java - Duoc UC

Este repositorio contiene una colección de ejemplos prácticos en Java diseñados para demostrar el uso de estructuras de control, manejo de flujo y entrada de datos mediante la clase `Scanner`.

##  Contenido del Proyecto

El paquete `com.duoc.ejemplos` incluye las siguientes clases:

### 1. Cajero Simple (`CajeroSimple.java`)
Simulación de un cajero automático funcional.
* **Funcionalidades:** Consulta de saldo, depósitos y giros de efectivo.
* **Conceptos clave:** Uso de `while` para mantener la sesión activa, `switch` para el menú de opciones y validaciones lógicas para evitar giros superiores al saldo disponible.

### 2. Validador de Números (`PositivoNegativo.java`)
Un programa que analiza las propiedades de un número entero ingresado.
* **Funcionalidades:** Determina si un número es positivo, negativo o cero, además de identificar si es par o impar.
* **Conceptos clave:** Estructuras `if-else if-else` y operador de módulo `%`.

### 3. Repetición Ganadora (`RepeticionGanadora.java`)
Un pequeño juego de adivinanza.
* **Funcionalidades:** Solicita al usuario un número hasta que logre ingresar el código "ganador" (1234).
* **Conceptos clave:** Bucle `while` condicionado a una variable de entrada.

### 4. Menú de Caracteres (`SuperMenu.java`)
Demostración de menús basados en texto/Strings.
* **Funcionalidades:** Presenta opciones (a, b, c) y responde según la entrada del usuario.
* **Conceptos clave:** Uso de `switch` con objetos `String` y lectura de líneas con `Scanner`.

---

##  Requisitos

* **Java JDK:** 8 o superior.
* **IDE:** Recomendado Eclipse, IntelliJ IDEA o VS Code.
* **Consola:** El proyecto es interactivo y requiere una terminal para ejecutarse.

##  Instalación y Ejecución

1.  **Clonar el repositorio:**
    ```bash
    git clone [https://github.com/tu-usuario/nombre-del-repo.git](https://github.com/tu-usuario/nombre-del-repo.git)
    ```
2.  **Compilar cualquier clase (ejemplo: CajeroSimple):**
    ```bash
    javac com/duoc/ejemplos/CajeroSimple.java
    ```
3.  **Ejecutar:**
    ```bash
    java com.duoc.ejemplos.CajeroSimple
    ```

---

##  Notas de Implementación
* Todas las clases utilizan `java.util.Scanner` para la interacción con el usuario.
* Se incluye el cierre de recursos mediante `scanner.close()` para evitar fugas de memoria (Memory Leaks).