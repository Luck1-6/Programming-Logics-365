"""
Headline: Multiplication Table
Description: Read N and print its multiplication table from 1 to 10.

Pseudocode:
n = int(input())

for i in range(1, 11):
  result = n * i
  print(n, "x", i, "=", result)
"""

# ---- Program ----
num = int(input("Enter the number: "))

for i in range(1, 11):
    result = num * i
    print(num, "x", i, "=", result)