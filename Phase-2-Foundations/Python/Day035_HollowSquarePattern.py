"""
Headline: Hollow Square Pattern
Description: Read N and print an N x N square of stars
with stars only on the boundary and spaces inside.

Pseudocode:
num = int(input())

for row = 1 to num:

  for column = 1 to num:

    if row is first row
       OR row is last row
       OR column is first column
       OR column is last column:
      print "*"
    else:
      print space

  move to next line
"""

# ---- Program ----
num = int(input("Enter N: "))

for row in range(1, num + 1):

    for column in range(1, num + 1):

        if row == 1 or row == num or column == 1 or column == num:
            print("*", end=" ")
        else:
            print(" ", end=" ")

    print()