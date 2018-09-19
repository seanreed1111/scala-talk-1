def sum1(ints: List[Int]): Int ={
  var sum = 0
  for (i <- ints){
    sum += i
  }
  sum
}

// recursive sum
def sum2(xs: List[Int]): Int = xs match {
  case Nil => 0
  case x :: tail => x + sum2(tail)
}

