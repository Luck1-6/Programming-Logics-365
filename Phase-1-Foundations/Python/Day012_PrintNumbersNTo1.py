"""
Headline: Print Numbers N to 1
Description: Read N and print integers from N down to 1.

Pseudocode:
n = int(input())

for i in range(n, 0, -1):
  print(i)
"""

# ---- Program ----
N = int(input("Enter N: "))

for i in range(N, 0, -1):
    print(i)