Feature: Verify if the room occupancy is calculated correctly

Scenario Outline: Verify if the number of rooms occupied and the amount earned by the hotel

Given the user enters the premium room count "<premiumCount>" economy room count "<economyCount>"
And clicks calculate occupancy button
Then the number of premium rooms occupied "<premiumOccupiedCount>" along with the amount earned "<premiumAmount>" should be displayed
And the number of economy rooms occupied "<economyOccupiedCount>" along with the amount earned "<economyAmount>" should be displayed

Examples:
	|	premiumCount	|	economyCount	|	premiumOccupiedCount	|	premiumAmount	|	economyOccupiedCount|	economyAmount	|
	|	3	|	3	|	3	|	738	|	3	|	167	|
#	|	7	|	5	|	6	|	1054	|	4	|	189	|
#	|	2	|	7	|	2	|	583	|	4	|	189	|
#	|	7	|	1	|	7	|	1153	|	1	|	45	|