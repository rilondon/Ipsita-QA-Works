@acceptanceTests
Feature: Contact Us Page
As an end user
I want a contact us page
So that I can find out more about QAWorks exciting services!!

Background: 
Given I am on the QAWorks Site

Scenario: Valid Submission
Then I should be able to contact QAWorks with the following information
	| name  |email | message |	
	| R.Bridge | R.Bridge@qaworks.com |please contact me I want to find out more |

Scenario: Validate ContactUs Page
Then the content should be displayed

Scenario: Validate Error messages
When I enter null values to the contact form
	| name  |email | message |	
	|  		  | 		 | 				 |
Then the appropriate messages would be displayed