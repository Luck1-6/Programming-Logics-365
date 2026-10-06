"""
Headline: Function to Find Factorial
Description: Write a function that returns the factorial of N.

Pseudocode:
Define a function find_factorial(num):

  factorial = 1

  for check_num from 1 to num:
    factorial = factorial * check_num

  return factorial

Read num

Call find_factorial(num)
Store the returned value

Print the factorial
"""

# ---- Program ----
def find_factorial(num):
    factorial = 1

    for check_num in range(1, num + 1):
        factorial = factorial * check_num

    return factorial

num = int(input("Enter the number: "))
result = find_factorial(num)
print("Factorial:", result)