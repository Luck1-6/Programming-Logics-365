"""
Headline: Reverse a Number
Description: Read an integer and print its digits in reverse order.

Pseudocode:
n = int(input())
reverse = 0

while n != 0:
  digit = n % 10
  reverse = reverse * 10 + digit
  n = n // 10

print("Reverse:", reverse)
"""

# ---- Program ----
num = int(input("Enter a number: "))

original = num
num = abs(num)

reverse = 0

while num != 0:
    digit = num % 10
    reverse = reverse * 10 + digit
    num = num // 10

if original < 0:
    reverse = -reverse

print("Reversed number:", reverse)