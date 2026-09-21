"""
Headline: Armstrong Number Check
Description: Check if a number equals the sum of its digits raised
to the power of the number of digits.

Pseudocode:
input = int(num)
original = num
count = 0
sum = 0

while num != 0:
  num = num // 10
  count = count + 1

num = original

while num != 0:
  digit = num % 10
  sum = sum + digit ** count
  num = num // 10

if sum == original:
  print("Armstrong Number")
else:
  print("Not an Armstrong Number")
"""

# ---- Program ----
num = int(input("Enter a number: "))

original = num
num = abs(num)

# Count digits
if num == 0:
    digit_count = 1
else:
    digit_count = 0
    temp = num

    while temp > 0:
        temp = temp // 10
        digit_count = digit_count + 1

# Calculate Armstrong sum
temp = num
armstrong_sum = 0

while temp > 0:
    digit = temp % 10
    armstrong_sum = armstrong_sum + digit ** digit_count
    temp = temp // 10

# Check result
if original >= 0 and armstrong_sum == original:
    print("Armstrong number")
else:
    print("Not an Armstrong number")