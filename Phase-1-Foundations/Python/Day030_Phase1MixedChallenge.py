"""
Headline: Revision - Phase 1 Mixed Challenge
Description: Read N and combine factorial calculation, prime checking,
and right triangle star pattern printing in one program.

Pseudocode:
num = int(input())

# Calculate factorial
factorial = 1

for i in range(1, num + 1):
  factorial = factorial * i

print(factorial)

# Check prime
is_prime = True

if num < 2:
  is_prime = False
else:
  for check_num in range(2, num):
    if num % check_num == 0:
      is_prime = False
      break

if is_prime:
  print(num, "is a prime number")
else:
  print(num, "is not a prime number")

# Print right triangle pattern
print("Star Pattern:")

for row in range(1, num + 1):
  for clumn in range(1, row + 1):
    print("*", end=" ")
  print()
"""

# ---- Program ----
num = int(input("Enter N: "))

# Calculate factorial
factorial = 1

for check_num in range(1, num + 1):
    factorial = factorial * check_num

print("Factorial:", factorial)

# Check prime
is_prime = True

if num < 2:
    is_prime = False
else:
    for row in range(2, num):
        if num % row == 0:
            is_prime = False
            break

if is_prime:
    print(num, "is a prime number")
else:
    print(num, "is not a prime number")

# Print right triangle pattern
print("Star Pattern:")

for row in range(1, num + 1):
    for column in range(1, row + 1):
        print("*", end=" ")
    print()