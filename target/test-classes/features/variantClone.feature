Feature: Variant Clone REST API

  Scenario: Test variant clone functionality
    Given User have variant clone API
    When User clone variant with queryKey "villa-in-goa" and variantId 35
    Then Variant clone status should be 200
    And Validate clone response contains variant data



