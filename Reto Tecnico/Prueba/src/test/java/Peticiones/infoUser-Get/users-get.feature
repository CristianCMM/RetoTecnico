Feature: Get usuario de regres

  Scenario: Get usuario
    Given url "https://reqres.in" + "/api/users/" + "2"
    When method get
    Then status 200