"""
Headline: Revision - Conditionals Recap
Description: Read a number and print its sign, parity, and whether it is divisible by 5.

Pseudocode:
n = int(input())

if n > 0:
  print("Positive")
elif n < 0:
  print("Negative")
else:
  print("Zero")

if n % 2 == 0:
  print("Even")
else:
  print("Odd")

if n % 5 == 0:
  print("Divisible by 5")
else:
  print("Not divisible by 5")
"""

# ---- Program ----
n = int(input("Enter a number: "))

# Check sign
if n > 0:
    print("Sign: Positive")
elif n < 0:
    print("Sign: Negative")
else:
    print("Sign: Zero")

# Check parity
if n % 2 == 0:
    print("Parity: Even")
else:
    print("Parity: Odd")

# Check divisibility by 5
if n % 5 == 0:
    print("Divisible by 5: Yes")
else:
    print("Divisible by 5: No")