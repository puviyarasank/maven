Feature: Adactin hotel room booking application
@smoketest
Scenario Outline: Login functionality
Given user Launches the Adactin Application
When user Enter The"<username>" username In Inbox
And user Enter The"<password>" Password In Inbox
Then user Click On The LoginButton  Its Navigates To Searchpage 
Examples:
|username|password|
|puviyarasan|puvi@1234|
|arul|1234|
|kumar|22334|



Scenario: Search Functionality
When user Selects The Location From The Dropdown
And user Selects The Hotel From The Dropdown
And user Selects The Room Type From The Dropdown
And user Selects The No Of Rooms From The Dropdown
And user Selects The Checkin Date From The Dropdown
And user Selects The Checkout Date From The Dropdown
And user Selects The Adults Per Room From The Dropdown
And user Selects The Children Per Room From The Dropdown
Then user Clicks On Searchbutton Its Navigates To Selecthotel

Scenario: Select Hotel Function 
When user Clicks On Radiobutton To Select Hotel
Then user Clicks on Continuebutton Its Navigates To Book A Hotel

Scenario: Book A Hotel
When user Enters The First Name In Inputbox
And user Enters The Last Name In Inputbox
And user Enters The Billing Address In Inputbox
And user Selects the Credit Card Number 
And user Selects The  CreditCard Type From The Dropdown
And user Selects The  Expiry Month From The Dropdown
And user Selects The Extiry Year From The Dropdown
And user Enters The Cvv Number In Inputbox
Then  user Clicks On Booknowbutton Its Navigates To Booking Confirmation

