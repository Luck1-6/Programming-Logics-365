"""
Headline: Grade Calculator
Description: Read a percentage score and print the corresponding letter grade.

Pseudocode:
marks = int(input())

if marks >= 90:
  print("Grade A")
elif marks >= 80:
  print("Grade B")
elif marks >= 70:
  print("Grade C")
elif marks >= 60:
  print("Grade D")
elif marks >= 50:
  print("Grade E")
else:
  print("Grade F")
"""

# ---- Program ----
score = float(input("Enter percentage score: "))

if score >= 90:
    print("Grade: A")
elif score >= 80:
    print("Grade: B")
elif score >= 70:
    print("Grade: C")
elif score >= 60:
    print("Grade: D")
elif score >= 50:
    print("Grade: E")
else:
    print("Grade: F")