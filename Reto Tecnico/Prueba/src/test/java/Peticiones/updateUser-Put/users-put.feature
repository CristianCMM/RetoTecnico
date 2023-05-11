Feature: Put usuario de regres

  Background:
    * def var = { "name": "morpheus", "job": "zion resident" }

  Scenario: Put usuario
    Given url "https://reqres.in" + "/api/users/" + "2"
    And request var
    When method put
    Then status 200