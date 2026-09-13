"""
Headline: Sum of First N Natural Numbers
Description: Read N and compute the sum 1 + 2 + ... + N.

Pseudocode:
n = int(input())
sum = 0

for i in range(1, n + 1):
  sum = sum + i

print("Sum:", sum)
"""

# ---- Program ----
N = int(input("Enter N: "))

sum = 0

for i in range(1, N + 1):
    sum = sum + i

print("Sum:", sum)