"""
Headline: Function to Check Even/Odd
Description: Write a function that returns "Even" or
"Odd" for a given number.

Pseudocode:
Define a function check_even_odd(num):

  if num is divisible by 2:
    return "Even"
  else:
    return "Odd"

Read num

Call check_even_odd(num)
Store the returned value

Print the result
"""

# ---- Program ----
def check_even_odd(num):
    if num % 2 == 0:
        return "Even"
    else:
        return "Odd"

num = int(input("Enter a number: "))
result = check_even_odd(num)
print("Result:", result)