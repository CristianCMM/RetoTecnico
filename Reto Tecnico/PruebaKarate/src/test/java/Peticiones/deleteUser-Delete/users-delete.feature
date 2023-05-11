 Feature: Delete usuario de regres

Scenario: Delete usuario
Given url "https://reqres.in" + "/api/users/" + "2"
When method delete
Then status 204