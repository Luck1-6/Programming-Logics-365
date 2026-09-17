"""
Headline: Revision - Loops Recap
Description: Read a number and find its digit count, digit sum,
reverse, and whether it is a palindrome.

Pseudocode:
num = int(input())

original = num
num = abs(num)

digit_count = 0
digit_sum = 0
reverse = 0

if num == 0:
    digit_count = 1
else:
    while num != 0:
        digit = num % 10

        digit_count = digit_count + 1
        digit_sum = digit_sum + digit
        reverse = reverse * 10 + digit

        num = num // 10

print("Number of digits:", digit_count)
print("Sum of digits:", digit_sum)
print("Reversed number:", reverse)

if original >= 0 and original == reverse:
    print("Palindrome: Yes")
else:
    print("Palindrome: No")
"""

# ---- Program ----
N = int(input("Enter a number: "))

original = N
N = abs(N)

digit_count = 0
digit_sum = 0
reverse = 0

if N == 0:
    digit_count = 1
else:
    while N != 0:
        digit = N % 10

        digit_count = digit_count + 1
        digit_sum = digit_sum + digit
        reverse = reverse * 10 + digit

        N = N // 10

print("Number of digits:", digit_count)
print("Sum of digits:", digit_sum)
print("Reversed number:", reverse)

if original >= 0 and original == reverse:
    print("Palindrome: Yes")
else:
    print("Palindrome: No")