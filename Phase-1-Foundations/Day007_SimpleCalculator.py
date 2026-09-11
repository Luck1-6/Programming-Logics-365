"""
Headline: Simple Calculator
Description: Read two numbers and an operator (+, -, *, /); print the result.

Pseudocode:
a = int(input())
b = int(input())
operator = input()

if operator == "+":
  result = a + b
  print("Result:", result)
elif operator == "-":
  result = a - b
  print("Result:", result)
elif operator == "*":
  result = a * b
  print("Result:", result)
elif operator == "/":
  result = a / b
  print("Result:", result)
else:
  print("Invalid operator")
"""

# ---- Program ----
A = float(input("Enter first number: "))
B = float(input("Enter second number: "))
operator = input("Enter operator (+, -, *, /): ")

if operator == "+":
    result = A + B
    print("Result:", result)

elif operator == "-":
    result = A - B
    print("Result:", result)

elif operator == "*":
    result = A * B
    print("Result:", result)

elif operator == "/":
    if B != 0:
        result = A / B
        print("Result:", result)
    else:
        print("Cannot divide by zero")

else:
    print("Invalid operator")

    