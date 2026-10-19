Exercise 1 Output: 
My name is Martha
The reason that I am learning Java its because its really important to understand OOP
A program could help me decide which assignment to finish first based on its deadline.

Process finished with exit code 0

Exercise 2 Pseudocode:
Inputs: Number of teams, Total number of notebook, notebooks per team
Output: Quantity of notebooks left

1. Create private final inputs
2. Calculate how many notebooks are left by multyplying the number of teams times the amount of notebooks per team and subtracting it with the total amount of notebooks.
3. print result

Test-Log 
- Run the program with 4 teams: 11 notebooks remaining 
- Run the program with 5 teams: 5 notebooks remaining
- Run the program with 0 teams: 35 notebooks remaining 

Why (35 - 6) × 4 does not solve the problem?
You must multiply the number of teams by the notebooks each team receives before subtracting from the total. Otherwise we are multiplying
the remaining notebooks instead of calculating how many were distributed

Output: There are 11 remaining notebooks


Exercise 3:
1. Why is a student ID such as "0042" usually better stored as text than as an int?
Because it preserves the zeros
2. Why would int hours = 2.5; fail to compile?
Because its a decimal and we would have to use double instead of int as a data type

Output:
LAB STATION INFORMATION

Station Number: 3
Student Name: Martha
Row: b
Hours Used: 4.0
Available: true
Max Users: 4
Updated Hours Used: 6.0

Process finished with exit code 0

Exercise 4:
Why is 60 an important boundary?
Because 60 equals to one complete hour w/o any remaining minutes

Output:
Total minutes: 135
Complete hours: 2
Remaining minutes: 15

Process finished with exit code 0

Exercise 5: 

Output:

Score 1: 8
Score 2: 7
Score 3: 9
Average: 8
Decimal Division Average: 8.00

Score 1: 8
Score 2: 7
Score 3: 10
Average: 8
Decimal Division Average: 8.33

Explain why merely declaring the result as double is not enough?
Because Java performs integer division first when both numbers are integers, and removes the decimal portion before storing the result as a double.