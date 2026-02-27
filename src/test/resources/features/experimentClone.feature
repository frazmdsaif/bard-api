Feature: Experiment Clone REST API



  Scenario Outline: Test experiment clone with different parameters
    Given User have experiment clone API
    When User clone experiment with queryKey "<queryKey>" and experimentId <experimentId>
    Then Experiment clone status should be <statusCode>

    Examples:
      | queryKey     | experimentId | statusCode |
      | villa-in-goa  | 35          | 200        |

