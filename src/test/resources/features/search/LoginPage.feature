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




# Escenarios definidos:

# @ValidCredentials

#Objetivo: Verificar que el usuario pueda iniciar sesión exitosamente con las credenciales correctas.

# @InValidCredentials

# Objetivo: Validar que el sistema muestre el mensaje de error "Invalid credentials" si se ingresa un usuario o contraseña incorrecta.

# @BlankUsername

#Objetivo: Validar que el sistema exija el nombre de usuario cuando se deja en blanco y muestre "Required" debajo del campo de usuario.

# @BlankPassword

#Objetivo: Validar que el sistema exija la contraseña cuando se deja en blanco y muestre "Required" debajo del campo de contraseña.
