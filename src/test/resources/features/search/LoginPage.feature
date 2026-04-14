@all
Feature: Login en la página web de saucedemo

  @ValidCredentials
  Scenario: Inicio de sesión con credenciales válidas

    Given "User" abre la página web
    When Inicia sesión con las credenciales "standard_user" y "secret_sauce"
    Then Debe iniciar sesión correctamente

  @InValidCredentials
  Scenario: Inicio de  sesión con credenciales no válidas

    Given "User" abre la página web
    When Inicia sesión con las credenciales "problem_user" y "Admin123"
    Then Debe ver el mensaje de error "Invalid credentials"

  @BlankUsername
  Scenario: Inicio de sesión con nombre de usuario en blanco

    Given "User" abre la página web
    When Inicia sesión con las credenciales "" y "admin123"
    Then Debe ver el mensaje de error "Required" debajo del nombre de usuario

  @BlankPassword
  Scenario: Inicio de  sesión con contraseña en blanco

    Given "User" abre la página web
    When Inicia sesión con las credenciales "error_user" y ""
    Then Debe ver el mensaje de error "Required" debajo de la contrasena

  @AddToCart
  Scenario: Agregar un producto al carrito luego de iniciar sesión correctamente

    Given "User" abre la página web
    When Inicia sesión con las credenciales "standard_user" y "secret_sauce"
    And agrega un producto al carrito
    Then el carrito debe mostrar "1" producto(s)



#📄 Documentación Archivo: LoginPage.feature
#
#📌 Descripción General:
#
#Este archivo define escenarios de prueba de comportamiento (BDD) para la funcionalidad de login del sistema HRM (Human Resource Management).
# Usa el lenguaje Gherkin, lo cual permite una lectura clara y estructurada tanto para testers como para stakeholders no técnicos.
#
#🎯 Propósito:
#Validar distintos comportamientos del sistema cuando un usuario intenta iniciar sesión con diferentes combinaciones de credenciales.
#⚙️ ¿Por qué se implementa?
#Se implementa para automatizar pruebas funcionales sobre el módulo de autenticación de la aplicación, asegurando que los mensajes y flujos de
# login se comporten correctamente con distintos tipos de entradas:
#Credenciales válidas.
#Usuario inválido.
#Usuario vacío.
#Contraseña vacía.
#
#🧩 Estructura y Dependencias:
#
#Cada paso (Given, When, Then) está vinculado con métodos en clases Java conocidas como Step Definitions, las cuales implementan la
# lógica que ejecuta lo descrito en los escenarios. Estas definiciones están escritas normalmente en clases como:
#
#LoginPageDefinitions.java
#
#LoginActions.java
#
#LoginValidation.java
#
#
#Además, interactúa con clases de Screenplay como:
#
#Tasks → para acciones como abrir la página o iniciar sesión.
#
#Questions → para validar resultados esperados.
#
#UI Elements → para ubicar campos de usuario, contraseña y mensajes de error.
#
#
#
#---
#
#📚 Escenarios definidos:
#
#✅ @ValidCredentials
#
#Objetivo: Verificar que el usuario pueda iniciar sesión exitosamente con las credenciales correctas.
#
#❌ @InValidCredentials
#
#Objetivo: Validar que el sistema muestre el mensaje de error "Invalid credentials" si se ingresa un usuario o contraseña incorrecta.
#
#⚠️ @BlankUsername
#
#Objetivo: Validar que el sistema exija el nombre de usuario cuando se deja en blanco y muestre "Required" debajo del campo de usuario.
#
#⚠️ @BlankPassword
#
#Objetivo: Validar que el sistema exija la contraseña cuando se deja en blanco y muestre "Required" debajo del campo de contraseña.
#
#
#---
#
#🔗 Clases relacionadas:
#
#Este archivo .feature depende de:
#
#LoginPageDefinitions.java → Implementa los pasos Given, When, Then.
#
#OpenWebPage, DoLogin, ValidateErrorMessages → Clases Task y Question que modelan la lógica del login.
#
#LoginPage.java → Clase PageObject que contiene los localizadores de elementos web.