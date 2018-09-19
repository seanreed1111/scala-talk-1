source: 'Functional Programming Simplified' by Alvin Alexander

What is Functional Programming?
1) FP is about writing software applications using only pure functions.
2) When writing FP code you only use immutable values - val fields in Scala

or

Functional programming is a way of writing software applications using only pure functions and immutable values.

What is a pure function?
1) The output of a pure function depends only on 
    a) its input parameters and 
    b) its internal algorithm.

2) A pure function has no side effects, meaning that it does not read anything from the outside world or write anything to the outside world. Output only depends on input.

As a result of those first two statements, if a pure function is called with an input parameter 'x' an infinite number of times it will always return the same result.
--------------------------------------------
Two additional statements:
1) Higher order functions are a feature of FP languages.
2) Recursion is a by-product of the definition of FP.

Once you dig into FP, you'll see that if you only use pure functions and immutable values, the only way you can do things like "calculate the sum of a list" is to use recursion. 

