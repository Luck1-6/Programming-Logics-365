"""
Headline: Inverted Triangle Star Pattern
Description: Print an inverted right-angled triangle of stars.

Pseudocode:
input(num)

for row in range(num, 0, -1):
  for column in range(1, row + 1):
    print("*")
"""

# ---- Program ----
num = int(input("Enter number of rows: "))

for row in range(num, 0, -1):
    for column in range(1, row + 1):
        print("*", end=" ")
    print()