Feature: user registration 
Background: FACEBOOK login
@sanity
Scenario Outline:
run|debug|profile
Given on the registration
When Enter <username> and <password>
Then user registration successfully   

Examples:
|username|password|
|admin|admin@123|
|admin2|admin@123|
                                                                                                   