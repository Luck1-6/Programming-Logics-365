"""
Headline: Factorial of a Number
Description: Read N and compute N! iteratively using a loop.

Pseudocode:
n = int(input())
factorial = 1

for i in range(1, n + 1):
  factorial = factorial * i

print("Factorial:", factorial)
"""

# ---- Program ----
N = int(input("Enter N: "))

factorial = 1

for i in range(1, N + 1):
    factorial = factorial * i

print("Factorial:", factorial)