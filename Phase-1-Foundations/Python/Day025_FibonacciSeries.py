"""
Headline: Fibonacci Series (Iterative)
Description: Read N and print the first N Fibonacci numbers using a loop.

Pseudocode:
num1 = 0
num2 = 1

for i = 0; i < num; i++:
    print(num1)
    next = num1 + num2
    num1 = num2
    num2 = next
"""

# ---- Program ----
num = int(input("Enter N: "))

num1 = 0
num2 = 1

for i in range(num):
    print(num1)

    next_number = num1 + num2
    num1 = num2
    num2 = next_number