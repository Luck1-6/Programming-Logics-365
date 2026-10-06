"""
Headline: Function to Find Square
Description: Write a function that takes a number
and returns its square.

Pseudocode:
def square(number):
    return number * number

number
square(number)
print result
"""

# ---- Program ----
def find_square(num):
    square = num * num
    return square

num = int(input("Enter a number: "))
result = find_square(num)
print("Square:", result)