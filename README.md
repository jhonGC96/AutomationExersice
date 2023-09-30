# AutomationExersice


This is an automation project from the website www.exerciseautomation.com, it is developed with Selenium, Cucumber and Java, 
you can fin the feature file in the next path "src/test/resources/features" with all the test cases developed with Cucumber


you can finding the next 26 text cases:

| TEST CASE NAME                                                                      | TAG NAME                   |
| :--- | :--- |
| Test Case 1: Register User                                                          | @HappyPathRegister         |
| Test Case 2: Login User with correct email and password                             | @HappyPathLogin            |
| Test Case 3: Login User with incorrect email and password                           | @LoginIncorrectCredentials |
| Test Case 4: Logout User                                                            | @LogoutUser                |
| Test Case 5: Register User with existing email                                      | @RegisterUserWithExistingEmail|
| Test Case 6: Contact Us Form                                                        |                            |
| Test Case 7: Verify Test Cases Page                                                 |                            |
| Test Case 8: Verify All Products and product detail page                            |                            |
| Test Case 9: Search Product                                                         |                            |
| Test Case 10: Verify Subscription in home page                                      |                            |
| Test Case 11: Verify Subscription in Cart page                                      |                            |
| Test Case 12: Add Products in Cart                                                  |                            |
| Test Case 13: Verify Product quantity in Cart                                       |                            |
| Test Case 14: Place Order: Register while Checkout                                  |                            |
| Test Case 15: Place Order: Register before Checkout                                 |                            |
| Test Case 16: Place Order: Login before Checkout                                    |                            |
| Test Case 17: Remove Products From Cart                                             |                            |
| Test Case 18: View Category Products                                                |                            |
| Test Case 19: View & Cart Brand Products                                            |                            |
| Test Case 20: Search Products and Verify Cart After Login                           |                            |
| Test Case 21: Add review on product                                                 |                            |
| Test Case 22: Add to cart from Recommended items                                    |                            |
| Test Case 23: Verify address details in checkout page                               |                            |
| Test Case 24: Download Invoice after purchase order                                 |                            |
| Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality   |                            |
| Test Case 26: Verify Scroll Up without 'Arrow' button and Scroll Down functionality |                            |



---------------------------------------- How to run the project ------------------------------------

Pre-requirements

1.- you must have installed the next tools:

- Gradle 8.3

- JDK 17

- Gradle extension pack in VSCode or similar.

- Selenium plugin in VSCode or similar.

- Cucumber plugin in VSCode or similar.

2.- One you have installed all, you execute the nex command line in the terminal

- gradle test -Dcucumber.filter.tags="@tagName"

You must replace the "tagName" with the tag that belongs to each test case, it depends the test case that you want to run

For example: I want to execute the test case 1, my command line will be the follow:

gradle test -Dcucumber.filter.tags="@HappyPathRegister"
