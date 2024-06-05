


object Main extends App {

  def factorial(num: Int): Int = {
    @scala.annotation.tailrec
    def _loop(num: Int, result: Int = 1): Int = {
      if( num < 2 ) result
      else _loop(num-1, result * num)
    }
    _loop(num)
  }

  for( i <- 6 until 15 ) println(s"Factorial of ${i} : ${factorial(i)}")

}
