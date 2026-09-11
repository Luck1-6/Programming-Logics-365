"""
Headline: Check Leap Year
Description: Read a year and determine if it is a leap year.

Pseudocode:
year = int(input())

if year % 400 == 0:
  print("Leap Year")
elif year % 100 == 0:
  print("Not a Leap Year")
elif year % 4 == 0:
  print("Leap Year")
else:
  print("Not a Leap Year")
"""

# ---- Program ----
year = int(input("Enter a year: "))

if year % 400 == 0:
    print(year, "is a leap year")
elif year % 100 == 0:
    print(year, "is not a leap year")
elif year % 4 == 0:
    print(year, "is a leap year")
else:
    print(year, "is not a leap year")