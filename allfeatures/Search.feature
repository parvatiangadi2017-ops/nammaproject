Feature: Search Functionality

@smoke @searchpositive
Scenario: Verify search functionality

Given User has logged inn
When User logs in
And  User enters a valid product name in the search boxx
And User clicks on search buttonss
Then User should see the searched product displayedd