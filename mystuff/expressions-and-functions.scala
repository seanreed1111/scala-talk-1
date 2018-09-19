// expressions
// Functional code in Scala evaluates to a result

//  This is how if else works in Scala
// NOTE: this looks like a ternary
a = 10
b = 5

val greater1 = if (a > b) a else b

// function literals also evaluate to a result
// the RHS of the equal sign is called a function literal
// can assign a function literal to a variable

// in this example the return type is implicit (Boolean)

val isEven = (i: Int) => i % 2 == 0

// can also write this way if you prefer
// val isEven = (i: Int) => { i % 2 == 0 }

// a different example
val sum = (a: Int, b: Int) => a + b

// notice that Scala does not generally infer the type of inputs!!!!
// you have to provide the input types explicitly.

// We can pass functions into other functions
// given these statements
val ints = List(1,2,3,4)
val isEven = (i: Int) => i % 2 == 0
val double = (i: Int) => i * 2

// can do this:
ints.filter(isEven) // List(2,4)

ints.map(double) // List(2,4,6,8)

// can also define a method and do the same thing
def doubleMethod(i: Int) = i * 2

ints.map(doubleMethod) // List(2,4,6,8)

//passing methods and functions into other functions is a big part of what functional programming is all about.
