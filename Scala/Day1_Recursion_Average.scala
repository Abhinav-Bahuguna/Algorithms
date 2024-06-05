

object Main extends App {

  def average(seq: Seq[Int]): Double = {
    @scala.annotation.tailrec
    def _loop(seq: Seq[Int], sum: Int, count: Int): Double = {
      if(seq.isEmpty) sum.toDouble / count
      else _loop(seq.tail, sum + seq.head, count + 1)
    }
    _loop(seq, 0, 0)
  }

  println(s"Avergae of ${1 to 10}: ${average(1 to 10)}")

}
