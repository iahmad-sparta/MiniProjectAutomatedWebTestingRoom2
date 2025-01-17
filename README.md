# Automated Web Testing

## Description
  This project utilises Cucumber, a bahviour-driven development, language to test [Automation Exercise ](https://automationexercise.com/) using the Selenium testing library. We model each webpage using a Page Object Model (POM). The goal of this group project was to improve our skills in Git collaboration, Selenium testing, Writing modular Java code and Bug defect reporting.   

## Using Git
 During the project, our group decided to use Git in a collaborative environment. We gave each member of our squad their own branch which were pulled, and pushed from the master branch. This Apprach was found to be effective due to the small member of merge conflicts, while we were developing test cases independent from one another.
 
### Our branches
![image](https://github.com/user-attachments/assets/f3da1725-0eb7-4965-bfc1-708ee1d07ff7)

When delegating tasks, we discussed what each squad member was to do in the next hour. After this hour, we discussed progress and what could be developed next. With everyone having their own branch, we could see progress on our local machines.

This project also used git committs and merging. The use of commits allowed everyone to see what progress was made to what code, while the use of merging allowed components to be integrated with one another. At the end of this project, all branches were able to merged into master with no conflicts showing how our collaborative approach was a success.

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
 - Cucumber (Version 7.18.0)
 - Hamcrest (Version 2.2)

## Setup
```
git clone https://github.com/iahmad-sparta/MiniProjectAutomatedWebTestingRoom2.git
```
### Example Dummy User:
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
├───.gitignore
├───pom.xml
└───README.md
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

We organised our test cases using the GitHub Project board.

## Test Metrics
In this project, we tested a number of features. These tests were priorities based on how urgent we found them using the MOSCOW method. 
We found that the tests we created, all of them passed to a high degree. Attached is an example test case and the pass result from it.

![image](https://github.com/iahmad-sparta/MiniProjectAutomatedWebTestingRoom2/blob/master/src/test/resources/data/testMetrics.png?raw=true)

In this example screenshot we can see a structured test using the Cucumber language. With all the steps passing in a runtime of 1 minute 45 seconds, we can see our approach is efficient and effective.

## Defects
 The following defects were found with exploratory testing:
 - The website tries to render a product page with null data from the URL.
 - The website does not give an error for an unvalid product id.
 - The website does not give an error for an unvalid brand product id.
 - When inputting the data into the payment form, it doesn’t validate the data to ensure incorrect data is sent. However the website still processes it and completes the order.
 - When inputting an invalid email into the subscription box, the website doesn’t validate properly and gives a message pop up saying you have been subscribed.

## Acknowledgements
 This project was created by:
 - ik1g19
 - DanielFSparta
 - robert-h25
 - MGW-GH
 - makduffy
 - iahmad-sparta
