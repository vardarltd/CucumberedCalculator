# Calculator with Cucumber Acceptance Tests

### What is it?
Simple Calculator Java Class multiplies given 2 long numbers, and returns the result.
That’s all :)

But: Maven and Cucumber are used to build and perform acceptance tests respectively.
### How about Cucumber features?
calculator.features file that resides in test/resources/cucumber contains acceptance scenarios and steps.

Feature: Sample Calculator  
Scenario: multiplication  
    Given Calculator is available  
    When someone entered 3 and 4  
    Then result must be 12  
Scenario Outline: Calculator knows kerrat cetveli  
    Given Calculator is available  
    When someone tries to multiply  \<param\_1\> with  \<param\_2\>  
    Then check \<param\_3\> is the output  
	    Examples:  
	    | param_1 | param_2 | param_3 |  
	    | 1 | 1 | 1 |  
	    | 1 | 2 | 2 |  
	    | 1 | 3 | 3 |  
	    | 1 | 4 | 4 |  
	    | 1 | 5 | 5 |  
	    | 1 | 6 | 6 |  
	    | 1 | 7 | 7 |  
	    | 1 | 8 | 8 |  
	    | 1 | 9 | 9 |  
	    | 1 | 10 | 10 |
### How to run tests?
Just run mvn test target. Easy enough right? :)

### What if I change the test data in Examples,  like |1|10|11|, ie., 1x10=11?
It is an obvious error, as you guess. So acceptance tests will fail.
