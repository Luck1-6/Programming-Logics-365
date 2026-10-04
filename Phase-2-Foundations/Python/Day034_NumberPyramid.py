"""
Headline: Number Pyramid
Description: Read N and print a number pyramid where
each row repeats its row number.

Pseudocode:
num = int(input())

for row = 1 to num:
  print spaces

  for column = 1 to row:
    print row

  move to next line
"""

# ---- Program ----
num = int(input("Enter N: "))

for row in range(1, num + 1):

    # Print spaces
    for space in range(1, num - row + 1):
        print(" ", end=" ")

    # Print row number
    for column in range(1, row + 1):
        print(row, end=" ")

    print()