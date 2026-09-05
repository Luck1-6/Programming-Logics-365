# Phase 1 — Foundations (Days 1–30)
### Focus: Variables, Conditionals, Loops | Difficulty: Easy

## Question Table

| Day | Title | Difficulty | Concept | Problem |
|---|---|---|---|---|
| 1 | Print Hello World | Easy | basics, I/O | Print `"Hello, World!"` to the console — your first output statement. |
| 2 | Add Two Numbers | Easy | variables, I/O | Read two integers and print their sum. |
| 3 | Swap Two Numbers | Easy | variables | Swap two variables' values without using a third variable. |
| 4 | Check Even or Odd | Easy | conditionals | Read an integer and print whether it's even or odd. |
| 5 | Find Maximum of Two Numbers | Easy | conditionals | Read two integers and print the larger one. |
| 6 | Find Maximum of Three Numbers | Easy | conditionals | Read three integers and print the largest. |
| 7 | Simple Calculator | Easy | conditionals, switch | Read two numbers and an operator (+ - * /); print the result. |
| 8 | Check Leap Year | Easy | conditionals | Read a year and determine if it's a leap year. |
| 9 | Grade Calculator | Easy | conditionals | Read a percentage score and print the letter grade. |
| 10 | Revision — Conditionals Recap | Easy | conditionals (mixed) | Print sign, parity, and divisibility-by-5 of a number in one program. |
| 11 | Print Numbers 1 to N | Easy | loops | Read N and print integers 1 through N. |
| 12 | Print Numbers N to 1 | Easy | loops | Read N and print integers N down to 1. |
| 13 | Sum of First N Natural Numbers | Easy | loops | Read N and compute the sum 1+2+...+N. |
| 14 | Factorial of a Number | Easy | loops | Read N and compute N! iteratively. |
| 15 | Multiplication Table | Easy | loops | Read N and print its table from 1 to 10. |
| 16 | Count Digits in a Number | Easy | loops | Read an integer and count its digits. |
| 17 | Reverse a Number | Easy | loops | Read an integer and print its digits reversed. |
| 18 | Check Palindrome Number | Easy | loops | Determine if a number reads the same forwards and backwards. |
| 19 | Sum of Digits | Easy | loops | Read an integer and sum its digits. |
| 20 | Revision — Loops Recap | Easy | loops (mixed) | Print digit count, digit sum, and palindrome check for one number. |
| 21 | Check Prime Number | Easy–Medium | loops, logic | Determine if a number is prime. |
| 22 | Print Prime Numbers up to N | Medium | nested loops | Read N and print all primes from 2 to N. |
| 23 | GCD of Two Numbers | Medium | loops, logic | Compute the greatest common divisor using the Euclidean algorithm. |
| 24 | LCM of Two Numbers | Medium | loops, logic | Compute the least common multiple of two numbers. |
| 25 | Fibonacci Series (Iterative) | Medium | loops | Print the first N Fibonacci numbers. |
| 26 | Armstrong Number Check | Medium | loops, logic | Check if a number equals the sum of its digits raised to the digit-count power. |
| 27 | Right Triangle Star Pattern | Medium | nested loops | Print a right-angled triangle of stars with N rows. |
| 28 | Inverted Triangle Star Pattern | Medium | nested loops | Print an inverted right-angled triangle of stars. |
| 29 | Pyramid Star Pattern | Medium | nested loops | Print a centered pyramid of stars with N rows. |
| 30 | Revision — Phase 1 Mixed Challenge | Medium | loops, conditionals (mixed) | Combine factorial, prime check, and pattern printing for one N. |

---

## Per-Day READMEs & Commit Messages

### Day 1 — Print Hello World
```
# Day 1 — Print Hello World

**Difficulty:** Easy
**Concept(s):** basics, I/O
**Phase:** Phase 1 — Foundations

## Problem
Write a program that prints "Hello, World!" to the console.
This is your first step into programming — get comfortable with output syntax.

## Example
Input:  none
Output: Hello, World!

## Approach
Use the language's print/output statement to display a fixed string.

## Complexity
- Time: O(1)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-001: print-hello-world

- Difficulty: Easy
- Concept: basics, io
- Adds problem README and solution for Day 1
```

### Day 2 — Add Two Numbers
```
# Day 2 — Add Two Numbers

**Difficulty:** Easy
**Concept(s):** variables, I/O
**Phase:** Phase 1 — Foundations

## Problem
Read two integers from input and print their sum.

## Example
Input:  5 7
Output: 12

## Approach
Store both numbers in variables, add them, print the result.

## Complexity
- Time: O(1)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-002: add-two-numbers

- Difficulty: Easy
- Concept: variables, io
- Adds problem README and solution for Day 2
```

### Day 3 — Swap Two Numbers
```
# Day 3 — Swap Two Numbers

**Difficulty:** Easy
**Concept(s):** variables
**Phase:** Phase 1 — Foundations

## Problem
Swap the values of two variables without using a third variable.

## Example
Input:  a=3, b=9
Output: a=9, b=3

## Approach
Use arithmetic (a=a+b, b=a-b, a=a-b) or an XOR swap.

## Complexity
- Time: O(1)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-003: swap-two-numbers

- Difficulty: Easy
- Concept: variables
- Adds problem README and solution for Day 3
```

### Day 4 — Check Even or Odd
```
# Day 4 — Check Even or Odd

**Difficulty:** Easy
**Concept(s):** conditionals
**Phase:** Phase 1 — Foundations

## Problem
Read an integer and determine whether it is even or odd.

## Example
Input:  7
Output: Odd

## Approach
Check the remainder of the number divided by 2.

## Complexity
- Time: O(1)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-004: check-even-or-odd

- Difficulty: Easy
- Concept: conditionals
- Adds problem README and solution for Day 4
```

### Day 5 — Find Maximum of Two Numbers
```
# Day 5 — Find Maximum of Two Numbers

**Difficulty:** Easy
**Concept(s):** conditionals
**Phase:** Phase 1 — Foundations

## Problem
Read two integers and print the larger one.

## Example
Input:  4 9
Output: 9

## Approach
Compare the two values using an if-else statement.

## Complexity
- Time: O(1)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-005: find-max-of-two-numbers

- Difficulty: Easy
- Concept: conditionals
- Adds problem README and solution for Day 5
```

### Day 6 — Find Maximum of Three Numbers
```
# Day 6 — Find Maximum of Three Numbers

**Difficulty:** Easy
**Concept(s):** conditionals
**Phase:** Phase 1 — Foundations

## Problem
Read three integers and print the largest of the three.

## Example
Input:  3 8 5
Output: 8

## Approach
Chain comparisons using nested if-else statements.

## Complexity
- Time: O(1)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-006: find-max-of-three-numbers

- Difficulty: Easy
- Concept: conditionals
- Adds problem README and solution for Day 6
```

### Day 7 — Simple Calculator
```
# Day 7 — Simple Calculator

**Difficulty:** Easy
**Concept(s):** conditionals, switch-case
**Phase:** Phase 1 — Foundations

## Problem
Read two numbers and an operator (+, -, *, /); print the result of applying
that operation to the two numbers.

## Example
Input:  6 3 *
Output: 18

## Approach
Use a switch/if-else chain to select the operation based on the operator.

## Complexity
- Time: O(1)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-007: simple-calculator

- Difficulty: Easy
- Concept: conditionals, switch-case
- Adds problem README and solution for Day 7
```

### Day 8 — Check Leap Year
```
# Day 8 — Check Leap Year

**Difficulty:** Easy
**Concept(s):** conditionals
**Phase:** Phase 1 — Foundations

## Problem
Read a year and determine whether it is a leap year using standard
divisibility rules.

## Example
Input:  2024
Output: Leap Year

## Approach
Check divisibility by 4, excluding centuries unless divisible by 400.

## Complexity
- Time: O(1)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-008: check-leap-year

- Difficulty: Easy
- Concept: conditionals
- Adds problem README and solution for Day 8
```

### Day 9 — Grade Calculator
```
# Day 9 — Grade Calculator

**Difficulty:** Easy
**Concept(s):** conditionals
**Phase:** Phase 1 — Foundations

## Problem
Read a percentage score and print the corresponding letter grade
(A/B/C/D/F) using threshold ranges.

## Example
Input:  82
Output: B

## Approach
Use an if-elif chain to bucket the score into a grade range.

## Complexity
- Time: O(1)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-009: grade-calculator

- Difficulty: Easy
- Concept: conditionals
- Adds problem README and solution for Day 9
```

### Day 10 — Revision: Conditionals Recap
```
# Day 10 — Revision: Conditionals Recap

**Difficulty:** Easy
**Concept(s):** conditionals (mixed)
**Phase:** Phase 1 — Foundations

## Problem
Read a number and print whether it's positive/negative/zero, even/odd,
and divisible by 5 — all in one program.

## Example
Input:  -15
Output: Negative, Odd, Divisible by 5

## Approach
Combine multiple independent condition checks in sequence, reusing logic
from Days 4–9.

## Complexity
- Time: O(1)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-010: revision-conditionals-recap

- Difficulty: Easy
- Concept: conditionals-mixed
- Adds problem README and solution for Day 10
```

### Day 11 — Print Numbers 1 to N
```
# Day 11 — Print Numbers 1 to N

**Difficulty:** Easy
**Concept(s):** loops
**Phase:** Phase 1 — Foundations

## Problem
Read N and print all integers from 1 to N.

## Example
Input:  5
Output: 1 2 3 4 5

## Approach
Use a for loop iterating from 1 to N.

## Complexity
- Time: O(N)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-011: print-numbers-1-to-n

- Difficulty: Easy
- Concept: loops
- Adds problem README and solution for Day 11
```

### Day 12 — Print Numbers N to 1
```
# Day 12 — Print Numbers N to 1

**Difficulty:** Easy
**Concept(s):** loops
**Phase:** Phase 1 — Foundations

## Problem
Read N and print all integers from N down to 1.

## Example
Input:  5
Output: 5 4 3 2 1

## Approach
Use a for loop iterating in reverse from N to 1.

## Complexity
- Time: O(N)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-012: print-numbers-n-to-1

- Difficulty: Easy
- Concept: loops
- Adds problem README and solution for Day 12
```

### Day 13 — Sum of First N Natural Numbers
```
# Day 13 — Sum of First N Natural Numbers

**Difficulty:** Easy
**Concept(s):** loops
**Phase:** Phase 1 — Foundations

## Problem
Read N and compute the sum of all natural numbers from 1 to N.

## Example
Input:  5
Output: 15

## Approach
Accumulate the sum in a loop, or use the closed-form formula N*(N+1)/2.

## Complexity
- Time: O(N) (or O(1) with formula)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-013: sum-of-first-n-natural-numbers

- Difficulty: Easy
- Concept: loops
- Adds problem README and solution for Day 13
```

### Day 14 — Factorial of a Number
```
# Day 14 — Factorial of a Number

**Difficulty:** Easy
**Concept(s):** loops
**Phase:** Phase 1 — Foundations

## Problem
Read N and compute N! (factorial) iteratively.

## Example
Input:  5
Output: 120

## Approach
Multiply numbers from 1 to N iteratively, accumulating the product.

## Complexity
- Time: O(N)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-014: factorial-of-a-number

- Difficulty: Easy
- Concept: loops
- Adds problem README and solution for Day 14
```

### Day 15 — Multiplication Table
```
# Day 15 — Multiplication Table

**Difficulty:** Easy
**Concept(s):** loops
**Phase:** Phase 1 — Foundations

## Problem
Read N and print its multiplication table from 1 to 10.

## Example
Input:  4
Output: 4 8 12 16 20 24 28 32 36 40

## Approach
Loop from 1 to 10, printing N*i at each step.

## Complexity
- Time: O(1) (fixed 10 iterations)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-015: multiplication-table

- Difficulty: Easy
- Concept: loops
- Adds problem README and solution for Day 15
```

### Day 16 — Count Digits in a Number
```
# Day 16 — Count Digits in a Number

**Difficulty:** Easy
**Concept(s):** loops
**Phase:** Phase 1 — Foundations

## Problem
Read an integer and count how many digits it has.

## Example
Input:  45321
Output: 5

## Approach
Repeatedly divide the number by 10 until it becomes 0, counting the steps.

## Complexity
- Time: O(log N)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-016: count-digits-in-a-number

- Difficulty: Easy
- Concept: loops
- Adds problem README and solution for Day 16
```

### Day 17 — Reverse a Number
```
# Day 17 — Reverse a Number

**Difficulty:** Easy
**Concept(s):** loops
**Phase:** Phase 1 — Foundations

## Problem
Read an integer and print its digits in reverse order.

## Example
Input:  1234
Output: 4321

## Approach
Extract the last digit repeatedly using modulo, build the reversed number.

## Complexity
- Time: O(log N)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-017: reverse-a-number

- Difficulty: Easy
- Concept: loops
- Adds problem README and solution for Day 17
```

### Day 18 — Check Palindrome Number
```
# Day 18 — Check Palindrome Number

**Difficulty:** Easy
**Concept(s):** loops
**Phase:** Phase 1 — Foundations

## Problem
Read an integer and determine if it reads the same forwards and backwards.

## Example
Input:  1221
Output: Palindrome

## Approach
Reverse the number (reuse Day 17's logic) and compare it to the original.

## Complexity
- Time: O(log N)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-018: check-palindrome-number

- Difficulty: Easy
- Concept: loops
- Adds problem README and solution for Day 18
```

### Day 19 — Sum of Digits
```
# Day 19 — Sum of Digits

**Difficulty:** Easy
**Concept(s):** loops
**Phase:** Phase 1 — Foundations

## Problem
Read an integer and compute the sum of its digits.

## Example
Input:  1234
Output: 10

## Approach
Extract each digit using modulo and integer division, accumulate the sum.

## Complexity
- Time: O(log N)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-019: sum-of-digits

- Difficulty: Easy
- Concept: loops
- Adds problem README and solution for Day 19
```

### Day 20 — Revision: Loops Recap
```
# Day 20 — Revision: Loops Recap

**Difficulty:** Easy
**Concept(s):** loops (mixed)
**Phase:** Phase 1 — Foundations

## Problem
Read a number and print its digit count, digit sum, and whether it's a
palindrome — all in one program.

## Example
Input:  121
Output: Digits: 3, Sum: 4, Palindrome: Yes

## Approach
Reuse the digit-extraction logic built across Days 16–19.

## Complexity
- Time: O(log N)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-020: revision-loops-recap

- Difficulty: Easy
- Concept: loops-mixed
- Adds problem README and solution for Day 20
```

### Day 21 — Check Prime Number
```
# Day 21 — Check Prime Number

**Difficulty:** Easy–Medium
**Concept(s):** loops, logic
**Phase:** Phase 1 — Foundations

## Problem
Read an integer and determine whether it is a prime number.

## Example
Input:  17
Output: Prime

## Approach
Check divisibility by every integer from 2 up to sqrt(N).

## Complexity
- Time: O(√N)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-021: check-prime-number

- Difficulty: Easy-Medium
- Concept: loops, logic
- Adds problem README and solution for Day 21
```

### Day 22 — Print Prime Numbers up to N
```
# Day 22 — Print Prime Numbers up to N

**Difficulty:** Medium
**Concept(s):** nested loops
**Phase:** Phase 1 — Foundations

## Problem
Read N and print all prime numbers from 2 up to N.

## Example
Input:  20
Output: 2 3 5 7 11 13 17 19

## Approach
For each number in the range, test primality using Day 21's logic.

## Complexity
- Time: O(N√N)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-022: print-primes-up-to-n

- Difficulty: Medium
- Concept: nested-loops
- Adds problem README and solution for Day 22
```

### Day 23 — GCD of Two Numbers
```
# Day 23 — GCD of Two Numbers

**Difficulty:** Medium
**Concept(s):** loops, logic
**Phase:** Phase 1 — Foundations

## Problem
Read two integers and compute their greatest common divisor.

## Example
Input:  12 18
Output: 6

## Approach
Use the Euclidean algorithm (repeated modulo) until the remainder is 0.

## Complexity
- Time: O(log(min(a,b)))
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-023: gcd-of-two-numbers

- Difficulty: Medium
- Concept: loops, logic
- Adds problem README and solution for Day 23
```

### Day 24 — LCM of Two Numbers
```
# Day 24 — LCM of Two Numbers

**Difficulty:** Medium
**Concept(s):** loops, logic
**Phase:** Phase 1 — Foundations

## Problem
Read two integers and compute their least common multiple.

## Example
Input:  4 6
Output: 12

## Approach
Use the relation LCM(a,b) = (a*b) / GCD(a,b), reusing Day 23's GCD logic.

## Complexity
- Time: O(log(min(a,b)))
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-024: lcm-of-two-numbers

- Difficulty: Medium
- Concept: loops, logic
- Adds problem README and solution for Day 24
```

### Day 25 — Fibonacci Series (Iterative)
```
# Day 25 — Fibonacci Series (Iterative)

**Difficulty:** Medium
**Concept(s):** loops
**Phase:** Phase 1 — Foundations

## Problem
Read N and print the first N terms of the Fibonacci sequence.

## Example
Input:  6
Output: 0 1 1 2 3 5

## Approach
Maintain two running variables and iterate, updating each at every step.

## Complexity
- Time: O(N)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-025: fibonacci-series-iterative

- Difficulty: Medium
- Concept: loops
- Adds problem README and solution for Day 25
```

### Day 26 — Armstrong Number Check
```
# Day 26 — Armstrong Number Check

**Difficulty:** Medium
**Concept(s):** loops, logic
**Phase:** Phase 1 — Foundations

## Problem
Read an integer and check if it's an Armstrong number (the sum of its
digits, each raised to the power of the digit count, equals the number).

## Example
Input:  153
Output: Armstrong (1^3 + 5^3 + 3^3 = 153)

## Approach
Count the digits, raise each digit to that power, sum, and compare to
the original number.

## Complexity
- Time: O(log N)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-026: armstrong-number-check

- Difficulty: Medium
- Concept: loops, logic
- Adds problem README and solution for Day 26
```

### Day 27 — Right Triangle Star Pattern
```
# Day 27 — Right Triangle Star Pattern

**Difficulty:** Medium
**Concept(s):** nested loops
**Phase:** Phase 1 — Foundations

## Problem
Read N and print a right-angled triangle of stars with N rows, where
row i has i stars.

## Example
Input:  3
Output:
*
**
***

## Approach
Outer loop iterates over rows; inner loop prints i stars per row.

## Complexity
- Time: O(N²)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-027: right-triangle-star-pattern

- Difficulty: Medium
- Concept: nested-loops
- Adds problem README and solution for Day 27
```

### Day 28 — Inverted Triangle Star Pattern
```
# Day 28 — Inverted Triangle Star Pattern

**Difficulty:** Medium
**Concept(s):** nested loops
**Phase:** Phase 1 — Foundations

## Problem
Read N and print an inverted right-angled triangle of stars with N rows.

## Example
Input:  3
Output:
***
**
*

## Approach
Outer loop iterates over rows; inner loop prints a decreasing number of
stars per row.

## Complexity
- Time: O(N²)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-028: inverted-triangle-star-pattern

- Difficulty: Medium
- Concept: nested-loops
- Adds problem README and solution for Day 28
```

### Day 29 — Pyramid Star Pattern
```
# Day 29 — Pyramid Star Pattern

**Difficulty:** Medium
**Concept(s):** nested loops
**Phase:** Phase 1 — Foundations

## Problem
Read N and print a centered pyramid of stars with N rows.

## Example
Input:  3
Output:
  *
 ***
*****

## Approach
Use nested loops: one for leading spaces (decreasing) and one for stars
(increasing odd counts) per row.

## Complexity
- Time: O(N²)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-029: pyramid-star-pattern

- Difficulty: Medium
- Concept: nested-loops
- Adds problem README and solution for Day 29
```

### Day 30 — Revision: Phase 1 Mixed Challenge
```
# Day 30 — Revision: Phase 1 Mixed Challenge

**Difficulty:** Medium
**Concept(s):** loops, conditionals (mixed)
**Phase:** Phase 1 — Foundations

## Problem
Read N and print: its factorial, whether it's prime, and a right-angled
star triangle of height N — combining everything learned in Phase 1.

## Example
Input:  4
Output:
Factorial: 24
Prime: No
*
**
***
****

## Approach
Combine the loop-based factorial (Day 14), primality check (Day 21), and
pattern printing (Day 27) logic into a single program.

## Complexity
- Time: O(N² + √N)
- Space: O(1)

## Files
- `solution.py` — implementation
```
**Commit message:**
```
day-030: revision-phase-1-mixed-challenge

- Difficulty: Medium
- Concept: loops-conditionals-mixed
- Adds problem README and solution for Day 30
```

---

## Next
Say **"Give me Days 31–90"** to generate Phase 2 (Patterns, Arrays, Strings, Functions) in the same format.
