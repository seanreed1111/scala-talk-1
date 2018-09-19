// partially applied functions aka curried functions

def plus(a: Int)(b: Int) = a + b

def plus2 = plus(2)(_) // plus2: Int => Int

plus2(5) // Int = 7



def add(x: Int, y: Int) = x + y

val addCurried = (add _).curried

val addCurriedTwo = addCurried(2)
addCurriedTwo(10) // Int = 12