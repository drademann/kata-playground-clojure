# Fibonacci Kata

This is the _Hello World_ of the functional world.
The calculation of the _n_-th Fibonacci number.

    fibs(0) = 0
    fibs(1) = 1
    fibs(n) = fibs(n-2) + fibs(n-1) ;; n > 1

__Remember__:

- Do TDD.
- Do one requirement at a time, do not read ahead.
- Test first, there is no try.

## Task

Implement the following function:

    (fibs n)

It returns the _n_-th Fibonacci number.
As a next step, implement a function `fibs-seq` that returns a lazy sequence
of all Fibonacci numbers up till _n_.
