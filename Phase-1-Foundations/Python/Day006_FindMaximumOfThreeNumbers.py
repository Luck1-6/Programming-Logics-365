"""
Headline: Find Maximum of Three Numbers
Description: Read three integers and print the largest.

Pseudocode:
a = int(input())
b = int(input())
c = int(input())

if a > b and a > c:
  print("Maximum:", a)
elif b > a and b > c:
  print("Maximum:", b)
else:
  print("Maximum:", c)
"""

# ---- Program ----
A = int(input("Enter first number: "))
B = int(input("Enter second number: "))
C = int(input("Enter third number: "))

if A > B and A > C:
    print(A, "is the largest")
elif B > A and B > C:
    print(B, "is the largest")
elif C > A and C > B:
    print(C, "is the largest")
else:
    print("Some numbers are equal")