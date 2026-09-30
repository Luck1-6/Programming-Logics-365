"""
Headline: Floyd's Triangle
Description: Read N and print Floyd's Triangle with N rows
using consecutive natural numbers.

Pseudocode:
num = int(input())
value = 1
for (row = 1 to num):
  for (column = 1 to row):
    print value
    increase value by 1
  move to next line
"""

# ---- Program ----
num = int(input("Enter the number of rows: "))
value = 1

for row in range(1, num + 1):
    for column in range(1, row + 1):
        print(value, end=" ")
        value = value + 1
    print()