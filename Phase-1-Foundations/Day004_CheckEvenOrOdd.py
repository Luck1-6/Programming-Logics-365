"""
Headline: Check Even or Odd
Description: Read an integer and print whether it's even or odd.

Pseudocode:
N=int(input("Enter a number: "))
If N%2==0:
   print("N is even")
else:
   print("N is odd")
"""

# ---- Program ----
n = int(input("Enter a number: "))

if n % 2 == 0:
    print("Even")
else:
    print("Odd")