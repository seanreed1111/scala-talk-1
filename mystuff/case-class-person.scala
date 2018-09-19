// case classes consist of state
// The are NOT the same as classes from OOP

// they are vals, so they do not get reassigned
// you need to copy from old to new, not overwrite!

case class Person(name: String, location:String)

val p1 = Person("Sean Reed", "New York")

val p2 = p1.copy(location = "New York City")

// we can use this Person case class in a function if we'd like
val info = (p: Person) => s"{p.name} lives in {p.location}."
