"""
Headline: Right Triangle Star Pattern
Description: Print a right-angled triangle of stars with N rows.

Pseudocode:
inupt(num)
for row in range(1, num + 1):
  for column in range(1, row + 1):
    print("*")
  print()
"""

# ---- Program ----
num = int(input("Enter number of rows: "))

for row in range(1, num + 1):
    for cloumn in range(1, row + 1):
        print("*", end=" ")
    print()