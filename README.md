#Serenity Screenplay - SauceDemo Automation

## Descripción

Este proyecto implementa un conjunto de pruebas automatizadas tipo *Smoke Test* sobre el flujo de inicio de sesión de la aplicación web *SauceDemo*.

Está desarrollado utilizando el patrón *Screenplay* con *Serenity BDD + Cucumber + Java*, siguiendo buenas prácticas de automatización, legibilidad y mantenibilidad.

---

## Objetivo

Validar el correcto funcionamiento del módulo de autenticación mediante escenarios clave:

* Login exitoso con credenciales válidas
* Validación de campos obligatorios
* Manejo de errores en login

---

## Tecnologías utilizadas

* Java 11
* Serenity BDD
* Cucumber
* Screenplay Pattern
* Maven
* Selenium WebDriver

---

## Arquitectura

El proyecto sigue el patrón *Screenplay*, el cual se basa en:

* *Actor*: Representa al usuario que ejecuta las acciones
* *Tasks*: Acciones que realiza el actor (ej: login)
* *Questions*: Validaciones del sistema
* *Page Objects (UI)*: Localizadores de elementos
* *Step Definitions*: Conexión entre Gherkin y código

---

## Estructura del proyecto


src/test/java/com/demo
│
├── tasks              → Acciones del usuario
├── questions          → Validaciones
├── ui                 → Localizadores (Page Objects)
├── stepdefinitions    → Steps de Cucumber
│
src/test/resources
└── features           → Archivos .feature


---

## Escenarios implementados

### 1. Login exitoso

Valida que un usuario pueda iniciar sesión correctamente con credenciales válidas.

### 2. Login sin usuario

Valida que el sistema muestre un mensaje de error cuando el campo usuario está vacío.

### 3. Login con contraseña incorrecta

Valida que el sistema muestre un mensaje de error cuando el campo contraseña es incorrecto.


### 4. Login sin contraseña

Valida que el sistema muestre un mensaje de error cuando el campo contraseña está vacío.

---

## Ejecución del proyecto

1. Clonar o descargar el repositorio
2. Abrir en IntelliJ IDEA como proyecto Maven
3. Ejecutar el siguiente comando:


mvn clean verify


---

## Reportes

Serenity genera automáticamente un reporte detallado en:


target/site/serenity/index.html


Incluye:

* Resultados de pruebas
* Evidencias
* Pasos ejecutados
* Estado de cada escenario

---

## Buenas prácticas implementadas

* Uso del patrón Screenplay
* Separación de responsabilidades
* Código reutilizable
* Validaciones claras
* Escenarios positivos y negativos

---

## Posibles mejoras

* Implementar Data Driven Testing
* Integración con CI/CD (Azure DevOps / Jenkins)
* Manejo de datos externos (JSON / Excel)
* Hooks globales (Before/After)
* Parametrización de entornos

---

## Autor

Santiago Ramos
QA 

---
