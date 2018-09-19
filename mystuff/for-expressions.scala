// 'for comprehensions' are powerful in Scala
// you can make generators, write defintions, and use filters

case class Person(firstName: String, lastName: String)

val people = List(
  Person("barney", "rubble"),
  Person("fred", "flintstone")
)

val namesStartingWithB = for {
  p <- people                 // generator
  fname = p.firstName       // definition. binds p.firstName to fname
  if (fname startsWith "b") // filter
} yield fname.toUpperCase

