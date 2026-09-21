"""
Headline: LCM of Two Numbers
Description: Compute the least common multiple of two numbers.

Pseudocode:
input (num1, num2)
original_num1 = num1
original_num2 = num2

while num2 != 0:
  remainder = num1 % num2
  num1 = num2
  num2 = remainder

gcd = num1
lcm = (original_num1 * original_num2) // gcd

print("LCM:", lcm)
"""

# ---- Program ----
num1 = int(input("Enter first number: "))
num2 = int(input("Enter second number: "))

original_num1 = num1
original_num2 = num2

num1 = abs(num1)
num2 = abs(num2)

if num1 == 0 or num2 == 0:
    lcm = 0
else:
    num3 = num1
    num4 = num2

    while num4 != 0:
        remainder = num3 % num4
        num3 = num4
        num4 = remainder

    gcd = num3
    lcm = (num1 * num2) // gcd

print("LCM:", lcm)