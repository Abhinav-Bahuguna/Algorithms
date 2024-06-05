

object Main extends App {

  def power(num: Int, power: Int): Int = {
    @scala.annotation.tailrec
    def _loop(num: Int, power: Int, result: Int): Int = {
      if(power < 1) return result
      else _loop(num, power-1, num*result)
    }

    _loop(num, power, 1)
  }

  println(s"Power of 2^8: ${power(2, 8)}")
}
