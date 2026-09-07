"""
Headline: Swap Two Numbers
Description: Swap two variables' values without using a third variable.

Pseudocode:
1. Read integer a
2. Read integer b
3. a = a + b
4. b = a - b
5. a = a - b
6. Print a and b (swapped)
"""

# ---- Program ----
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))

a = a + b
b = a - b
a = a - b

print("After swap: a =", a, ", b =", b)