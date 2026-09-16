"""
Headline: Count Digits in a Number
Description: Read an integer and count the number of digits using a loop.

Pseudocode:
n = int(input())
count = 0

while n != 0:
  n = n // 10
  count = count + 1

print("Number of digits:", count)
"""

# ---- Program ----
num = int(input("Enter a number: "))

num = abs(num)

if num == 0:
    digit_count = 1
else:
    digit_count = 0

    while num > 0:
        num = num // 10
        digit_count = digit_count + 1

print("Number of digits:", digit_count)