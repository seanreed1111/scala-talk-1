def sum1(ints: List[Int]): Int ={
  var sum = 0
  for (i <- ints){
    sum += i
  }
  sum
}

// recursive sum

def sum2(list: List[Int]): Int = list match {
  case Nil => 0
  case x :: xs => x + sum(xs)
}

val list = List(1,2,3,4)
println(sum(list))

// notice sum2 is not tail recursive!
// I can break sum2 with a big enough list!
// what kind of error will I get??

// this is tail recursive. Note the annotation to the compiler!
// if method not tail recursive, will not compile.

def sum3(list: List[Int]): Int = {
  @tailrec
  def sumWithAccumulator(list: List[Int], currentSum: Int): Int ={
    list match {
      case Nil => currentSum
      case x :: xs => sumWithAccumulator(xs, currentSum + x)
    }
  }
  sumWithAccumulator(list, 0) // call the inner function
}