# DAM | Material de estudio

Esta carpeta reúne apuntes, temarios, ejercicios y fragmentos de código utilizados durante el ciclo de Desarrollo de Aplicaciones Multiplataforma (DAM).

## Contenido

- **Temarios y resúmenes:** programación, sistemas de gestión, digitalización y fundamentos de Java.
- **Ejercicios:** ejemplos independientes de sintaxis, control de flujo, POO, colecciones, excepciones y JDBC.
- **Fragmentos de clase:** archivos creados para practicar conceptos concretos.

## Cómo ejecutar los ejemplos

No es un único proyecto Java y no debe compilarse toda la carpeta de una vez. Hay clases con nombres repetidos, paquetes distintos y archivos cuyo nombre no coincide con la clase pública.

Para probar un ejercicio:

1. Abre el archivo en IntelliJ IDEA, Eclipse o VS Code.
2. Comprueba el nombre de la clase pública y el paquete.
3. Copia el ejercicio a un proyecto temporal si necesita una estructura de paquetes.
4. Compila únicamente las clases necesarias.

Ejemplo para un archivo sencillo sin paquete:

```bash
javac NombreClase.java
java NombreClase
```

Los ejemplos que declaran `package org.example;` o requieren varias clases deben ejecutarse desde una estructura de proyecto compatible con ese paquete.

## Estado

Material académico en evolución. Los ejercicios no se presentan como aplicaciones listas para producción ni están todos cubiertos por CI. El workflow del repositorio compila un conjunto seleccionado de ejemplos independientes de la raíz.
