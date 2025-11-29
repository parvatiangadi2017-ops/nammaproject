Feature:Registration functionality 

@smoke
Scenario: To verify Registration functionality by enterung valid credentials

Given User has opened the browser and launched the application
When User enters valid first name
And  User enters valid last name
And  User enters valid E-mail
And  User enters Telephone
And  User enters password
And  User enters password confirm
And  User clicks on radio button no
And  User clicks on privacy policy checkbox
And User clicks on continue button
Then User should be registered