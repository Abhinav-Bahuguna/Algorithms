

object Main extends App {

  def power(num: Int, p: Int): Int = {
    if( p == 0 ) 1
    else if ( p == 1 ) num
    else {
      val result = power(num, p/2)
      result * result * { if(p % 2 == 0) num else 1 }
    }
  }

  println(s"Power of 4^8: ${power(4, 8)}")
  println(s"Power of 2^9: ${power(2, 9)}")
  println(s"Power of 7^5: ${power(7, 5)}")
  println(s"Power of 9^0: ${power(9, 0)}")
  println(s"Power of 6^5: ${power(6, 5)}")

}
