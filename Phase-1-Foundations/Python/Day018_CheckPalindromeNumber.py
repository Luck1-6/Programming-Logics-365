"""
Headline: Check Palindrome Number
Description: Determine if a number reads the same forwards and backwards.

Pseudocode:
n = int(input())
original = n
reverse = 0

while n != 0:
  digit = n % 10
  reverse = reverse * 10 + digit
  n = n // 10

if original == reverse:
  print("Palindrome")
else:
  print("Not a Palindrome")
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

if original >= 0 and original == reverse:
    print("Palindrome")
else:
    print("Not a palindrome")