Feature: Verify if the room occupancy is calculated correctly

Scenario Outline: Verify if the number of rooms occupied and the amount earned by the hotel

Given the user enters the premium room count "<premiumCount>" economy room count "<economyCount>"
And clicks calculate occupancy button
Then the count of free rooms "<premiumCount>" "<economyCount>" along with their usage "<usagePremium>" "<usageEconomy>" should be displayed

Examples:
	|	premiumCount	|	economyCount	|	usagePremium	|	usageEconomy	|
	|	3	|	3	|	3 (EUR 738)	|	3 (EUR 167)	|
	|	7	|	5	|	6 (EUR 1054)	|	4 (EUR 189)	|
	|	2	|	7	|	2 (EUR 583)	|	4 (EUR 189)	|
	|	7	|	1	|	7 (EUR 1153)	|	1 (EUR 45)	|