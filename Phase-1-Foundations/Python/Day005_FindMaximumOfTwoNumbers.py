"""
Headline: Find Maximum of Two Numbers
Description: Read two integers and print the larger one.

Pseudocode:
A, B=int(input())
if A > B:
  print(A "is greater")
elseif B > A:
  print(B "is greater")
else:
  print("Both" A "and" B "are equal")
"""

# ---- Program ----
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

if a > b:
    print("Maximum:", a)
else:
    print("Maximum:", b)