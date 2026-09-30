"""
Headline: Pascal's Triangle
Description: Read N and print the first N rows of
Pascal's Triangle.

Pseudocode:
number = int(input())
value = 1

for row in range(1, number + 1):
    print consecutive values for this row
    increase value after each number
"""

# ---- Program ----
num = int(input("Enter the number for rows: "))

for row in range(num):
    value = 1

    for column in range(row + 1):
        print(value, end=" ")
        value = value * (row - column) // (column + 1)

    print()
