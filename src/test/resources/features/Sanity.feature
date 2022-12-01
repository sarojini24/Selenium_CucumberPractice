Feature:verify PPF calcuclator
Scenario:Verify year end balance in PPF calculatorfor different time
Given  check year end balance in PPF Launch URL
Then home page scuccessfully displayed
And Enter "10,000" in "I want to make a deposit
Then Verify if the entered amount is desplayed in words.
Then Verify if the "Current rate of Interest" input box is default
Then Click the Recalculate
Then Click on view output as "table"
Then verify if the investment period is by default 15 years.


