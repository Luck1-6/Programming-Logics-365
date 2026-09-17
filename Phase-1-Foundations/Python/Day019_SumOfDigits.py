"""
Headline: Sum of Digits
Description: Read an integer and calculate the sum of all its digits.

Pseudocode:
num = int(input())
sum = 0

while num != 0:
  digit = num % 10
  sum = sum + digit
  num = num // 10

print("Sum of digits:", sum)
"""

# ---- Program ----
N = int(input("Enter a number: "))

N = abs(N)

sum = 0

while N != 0:
    digit = N % 10
    sum = sum + digit
    N = N // 10

print("Sum of digits:", sum)