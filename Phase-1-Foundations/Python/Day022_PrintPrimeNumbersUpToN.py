"""
Headline: Print Prime Numbers up to N
Description: Read N and print all prime numbers from 2 to N.

Pseudocode:
input(num)
for number in range(2, num+ 1):
  is_prime = True

  for i in range(2, number):
    if number % i == 0:
      is_prime = False
      break

  if is_prime:
    print(number)
"""

# ---- Program ----
num = int(input("Enter a number: "))

for num in range(2, num + 1):

    is_prime = True

    for i in range(2, num):
        if num % i == 0:
            is_prime = False
            break

    if is_prime:
        print(num)