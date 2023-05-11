Feature: yo como usuario de UTest
  necesito crear un  nuevo usuario
  para acceder como usuario

  Scenario: Creacion de usuario exitosa
    Given usuario en la home page
    When usuario creado con toda la informacion diligenciada
    Then usuario ingresa a la web con credenciales