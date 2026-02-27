Feature: Page Clone REST API


  Scenario Outline: Test page clone with different parameters
    Given User have page clone API
    When User clone page with queryKey "<queryKey>"
    Then Page clone status should be <statusCode>

    Examples:
      | queryKey     | statusCode |
      | villa-in-goa | 200        |

