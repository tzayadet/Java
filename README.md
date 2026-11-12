<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Orbitron&size=25&duration=2400&pause=900&center=true&vCenter=true&width=760&color=FFA500&lines=JAVA+DEVELOPMENT;OBJECT-ORIENTED+PROGRAMMING;LEARNING+BY+BUILDING" alt="Java development header"/>
</p>

<p align="center">
  <a href="https://github.com/tzayadet"><img src="https://img.shields.io/badge/GitHub-tzayadet-181717?style=for-the-badge&logo=github" alt="GitHub"/></a>
  <img src="https://img.shields.io/badge/Java-JDK-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java"/>
  <img src="https://img.shields.io/badge/Focus-Software%20Development-1565C0?style=for-the-badge" alt="Software development"/>
  <a href="LICENSE"><img src="https://img.shields.io/badge/License-MIT-7928CA?style=for-the-badge" alt="MIT License"/></a>
</p>

# Java Projects

[![Java example checks](https://github.com/tzayadet/Java/actions/workflows/java-checks.yml/badge.svg)](https://github.com/tzayadet/Java/actions/workflows/java-checks.yml)

Repositorio personal de prácticas y proyectos en Java. Incluye ejercicios de programación, fundamentos de orientación a objetos, estructuras de datos y experimentos de desarrollo.

## Áreas de trabajo

- **Fundamentos:** sintaxis, tipos, variables, operadores, condicionales y bucles.
- **Programación orientada a objetos:** clases, objetos, encapsulación, herencia, abstracción y polimorfismo.
- **Estructuras de datos y algoritmos:** arrays, colecciones, búsqueda y resolución de problemas.
- **Manejo de errores:** excepciones, validación y control de entradas.
- **Desarrollo de aplicaciones:** ejercicios de consola y proyectos vinculados al aprendizaje de DAM.

## Material de DAM

La carpeta [DAM/](DAM/) conserva temarios, apuntes y ejercicios académicos. Son ejemplos independientes, no un único proyecto compilable en bloque; consulta su README antes de ejecutarlos.

## Requisitos

- JDK compatible con la versión de cada ejercicio.
- Un IDE como IntelliJ IDEA, Eclipse o Visual Studio Code es opcional.

## Compilación y ejecución

Para un ejercicio sencillo sin paquetes:

```bash
javac Main.java
java Main
```

Si el proyecto utiliza paquetes o un sistema de construcción, sigue la estructura y las instrucciones específicas de ese proyecto. No todos los ejercicios de este repositorio utilizan Maven.

## Organización y madurez

El repositorio conserva ejercicios de distintas etapas de aprendizaje. Algunos archivos son ejemplos aislados y otros forman parte de proyectos mayores. La CI compila un conjunto explícito de ejemplos independientes; el material de DAM queda separado porque contiene clases repetidas y estructuras académicas heterogéneas. Revisa las dependencias y la estructura antes de ejecutarlos.

## Tecnologías

- Java y JDK
- Programación orientada a objetos
- Git
- Maven en los proyectos que lo requieran
- SQL y bases de datos en ejercicios relacionados

## Licencia

MIT. Consulta [LICENSE](LICENSE).

## Project showcase

[Open the GitHub Pages showcase](https://tzayadet.github.io/Java/) · [Showcase source](docs/index.html)

The page is a curated index of selected source files; it does not execute Python or Java in the browser. To publish it, select **Settings → Pages → Build and deployment → Source → GitHub Actions** and set the repository Actions variable `ENABLE_PAGES=true` under **Settings → Secrets and variables → Actions → Variables**. The workflow remains skipped until that variable is enabled.
