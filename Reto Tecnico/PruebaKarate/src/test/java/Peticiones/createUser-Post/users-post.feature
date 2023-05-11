Feature: Post usuario de regres

  Background:
    * url "https://reqres.in"
    * path "/api/users"
    * request { "name": "#(name)", "job": "#(job)" }

  Scenario Outline: Post usuario
    When method post
    Then status 201

    Examples:
    |name    |job       |
    |jhon    |jefe      |
    |juan    |empleado  |
    |Carlos  |asistente |