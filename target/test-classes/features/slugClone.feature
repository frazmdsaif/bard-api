Feature: Slug Clone REST API



  Scenario Outline: Test slug clone with different parameters
    Given User have slug clone API
    When User clone slug with slug "<slug>"
    Then Slug clone status should be <statusCode>

    Examples:
      | slug         | statusCode |
      | villa-in-goa  | 200        |
    
