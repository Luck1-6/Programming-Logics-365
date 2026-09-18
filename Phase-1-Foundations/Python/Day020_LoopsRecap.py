```python
"""
Headline: Revision - Loops Recap
Description: Read a number and find its digit count, digit sum,
reverse, and whether it is a palindrome.

Pseudocode:

    num = int(input())

    digit_count = count_digits(num)
    digit_sum = sum_of_digits(num)
    reverse = reverse_number(num)
    palindrome = is_palindrome(num)

    print all results
"""


# ---- Functions ----

# Function 1: Count the number of digits
def count_digits(num):

    num = abs(num)

    if num == 0:
        return 1

    digit_count = 0

    while num != 0:
        digit_count = digit_count + 1
        num = num // 10

    return digit_count


# Function 2: Calculate the sum of digits
def sum_of_digits(num):

    num = abs(num)

    digit_sum = 0

    while num != 0:
        digit = num % 10
        digit_sum = digit_sum + digit
        num = num // 10

    return digit_sum


# Function 3: Reverse the number
def reverse_number(num):

    num = abs(num)

    reverse = 0

    while num != 0:
        digit = num % 10
        reverse = reverse * 10 + digit
        num = num // 10

    return reverse


# Function 4: Check whether the number is palindrome
def is_palindrome(num):

    # Negative numbers are not considered palindrome
    if num < 0:
        return False

    reverse = reverse_number(num)

    return num == reverse


# ---- Main Program ----

N = int(input("Enter a number: "))

digit_count = count_digits(N)
digit_sum = sum_of_digits(N)
reverse = reverse_number(N)
palindrome = is_palindrome(N)

print("Number of digits:", digit_count)
print("Sum of digits:", digit_sum)
print("Reversed number:", reverse)

if palindrome:
    print("Palindrome: Yes")
else:
    print("Palindrome: No")
```
