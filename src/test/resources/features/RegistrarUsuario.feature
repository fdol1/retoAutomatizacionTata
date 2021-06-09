#Author: l1_fdo@hotmail.com

@Registros
Feature: El usuario quiere ingresar a uTest
  y registrarse como un usuario nuevo en la
  plataforma

  Background: El usuario ingres a uTest
    Given El "usuario" ingresa a la pagina

  @RegistroDeUsuario
  Scenario: El usuario quiere realizar un registro
    Given El usuario ingresa los dastos del registro
      | primerNombre | segundoNombre | correo                | mesNacimiento | dia | anio | ciudad   | codigoPostal | pais     | equipo  | version | lenguaje | movil | modelo    | sistemao | clave          |
      | luis         | fernando      | fdo.nando0001@gmail.com | March         | 3   | 1994 | Medellín | 00501        | colombia | Windows | XP       | English  | Apple | iPad 1 3G | iOS 4.0  | 20OsosCocacola |
    And acepta el registro
    Then Verifica mensaje: Welcome to the world's largest community of freelance software testers!