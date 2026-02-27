Feature: Explore Pages REST API

  Scenario Outline: Test different explore pages payloads
    Given User have explore pages API
    When User hits explore pages API with "<payloadType>" payload
    Then Explore pages status should be 200

    Examples:
      | payloadType      |
      | full            |
      | simple          |
      | noExperiments   |
      | custom1          |
