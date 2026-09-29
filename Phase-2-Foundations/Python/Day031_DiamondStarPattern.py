"""
Headline: Diamond Star Pattern
Description: Read N and print a diamond-shaped star pattern
where N represents the number of stars in the widest row.

Pseudocode:
number = int(input())

for row in range(1, number + 1):
    print spaces
    print increasing stars

for row in range(1, number):
    print spaces
    print decreasing stars
"""

# ---- Program ----
number = int(input("Enter number: "))

count = 0

for row in range(1, number + 1):
    star = row + count
    count += 1

    print(" " * (number - row), end="")
    print("*" * star)

for row in range(number + 1, 2 * number):
    count -= 1
    star = (number * 2 - 1) - (row - number) * 2

    print(" " * (row - number), end="")
    print("*" * star)
