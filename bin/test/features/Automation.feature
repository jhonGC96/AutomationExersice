@Register

Feature: Testing page Automation Exercises

    Background: navigate to
        Given than the user navigate to 'https://automationexercise.com/'
        And he verifies that the home page is visible succesfully


    Scenario Outline: As a test engineer i want to validate to register user
        And he clicks on 'Signup/Login' link
        And  he verifies that the text 'New User Signup' is visible
        And he enters name <name> and email <email> address
        When he clicks on 'Signup' button
        And he verifies that 'ENTER ACCOUNT INFORMATION' is visible
        And he fills the all the form with the correct required params Password <pass>, Date of birth, First name <firstName>, Last name <lastName>, Address <address>, Country <country>, State <state>, City <city>, Zipcode <cp>, Mobile Number <number>
        And he clicks on the 'create account' button
        And he Verifies that 'ACCOUNT CREATED!' is visible
        Then he clicks on 'Continue' button
        And he verifies that 'Logged in as username' <name> is visible
        And he clicks on 'Delete Account' button
        And he verifies that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        Examples:
            | name  | email                  | pass     | firstName | lastName | address     | country   | state   | city   | cp    | number     |
            | Carla | ccarlaaddkj8@gmail.com | Prueba1. | Yuliana   | Guerrero | calle 5     | Singapore | sonora  | la paz | 56764 | 6765437689 |
            | Diana | ddiandda883@gmail.com  | Prueba1. | Lisseth   | Guerrero | pino suarez | Canada    | Sinaloa | cocoa  | 56567 | 5565342576 |


    Scenario: As a user i want to login with correct email and password
        And the user clicks on 'signup/login' link
        When he verifies 'Login to your account' is visible
        And the user enter the correct email <email> and password <pass>
        Then he clicks 'login' button
        And he verifies that 'Logged in as username' <name> is visible in the page
        Examples:
            | email            | pass     | name |
            | jijo@hotmail.com | Prueba1. | jijo |