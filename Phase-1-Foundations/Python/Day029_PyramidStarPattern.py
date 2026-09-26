"""
Headline: Pyramid Star Pattern
Description: Print a centered pyramid of stars with N rows.

Pseudocode:
input(num)

for row in range(1, num + 1):
  for clumn in range(num - row):
    print(" ",)

  for clumn in range(2 * row - 1):
    print("*")

  print()
"""

# ---- Program ----
num = int(input("Enter number of rows: "))

for row in range(1, num + 1):

    # Print spaces
    for column in range(1, num - row + 1):
        print(" ", end=" ")

    # Print stars
    for column in range(1, 2 * row):
        print("*", end=" ")

    print()