"""
Headline: Check Prime Number
Description: Read a number and determine whether it is prime.

Pseudocode:
input(num)
if num < 2
    print "Not Prime"
else
    for i = 2 TO num - 1
        IF num % i = 0
            print "Not Prime"
            break
    print "Prime"

"""

# ---- Program ----
num = int(input("Enter a number: "))

is_prime = True

if num < 2:
    is_prime = False
else:
    for i in range(2, num):
        if num % i == 0:
            is_prime = False
            break

if is_prime:
    print(num, "is a prime number")
else:
    print(num, "is not a prime number")