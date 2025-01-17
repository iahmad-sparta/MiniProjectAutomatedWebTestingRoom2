# Automated Web Testing

## Description
  This project utilises Cucumber, a bahviour-driven development, language to test a website using the Selenium testing library. We model each webpage using a Page Object Model (POM). The goal of this group project was to improve our skills in Git collaboration, Selenium testing, Writing modular Java code and Bug defect reporting.   

## Features
 List of features:  
 - Cucumber scripts
 - Selenium
 - Hamcrest

## Prerequisites
 To run this project, the following technologies are required:
 - Java (Version 23)
 - Maven
 - Junit (Version 3.8.1)
 - Selenium (Version 4.22.0)
 - Cucumber (7.18.0)
 - Hamcrest (2.2)

## Setup
```
git clone https://github.com/iahmad-sparta/MiniProjectAutomatedWebTestingRoom2.git
```
### Example dummy user:
```
email address = "ziinkgaming8@gmail.com"
password = "test"
```

## Project Structure
```
Automated Web Testing
├───.idea  
├───src  
│   └───test  
│       ├───java  
│       │   └───testproject  
│       │       ├───pages  
│       │       │   └───auth  
│       │       └───stepdefs  
│       └───resources  
│           └───features
```
## What was Tested?
 In this project, we tested the following user stories:
- User Story 1: Register a User
- User Story 2: Login User with Correct Email and Password
- User Story 6: Contact Us Form
- User Story 8: Verify all Products and Product detail page
- User Story 9: Search for a product
- User Story 12: Add Products in cart
- User Story 13: Verify Product quantity in Cart
- User Story 14: Place Order
- User Story 18: View Category Products
- User Story 27: Delete Account

## Test Metrics
In this project, we tested a number of features. These tests were priorities based on how urgent we found them using the MOSCOW method. 
We found that the tests we created, all of them passed to a high degree. Attached is an example test case and the pass result from it.

![image](https://github.com/iahmad-sparta/MiniProjectAutomatedWebTestingRoom2/blob/master/src/test/resources/data/testMetrics.png?raw=true)

In this example screenshot we can see a structured test using the Cucumber language. With all the steps passing in a runtime of 5.1 seconds, we can see our approach is efficient and effective.


## Acknowledgements
 This project was created by:
 - ik1g19
 - DanielFSparta
 - robert-h25
 - MGW-GH
 - makduffy
 - iahmad-sparta
