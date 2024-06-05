

object Main extends App {

  @scala.annotation.tailrec
  def isSorted(sequence: Seq[Int]): Boolean = {
    if( sequence.size < 2 ) true
    else (sequence(0) < sequence(1)) && isSorted(sequence.slice(2, sequence.size))
  }

  println(s"Is Sorted ${1 to 50}: ${isSorted(1 to 50)}")
  println(s"Is Sorted ${10 to 5 by -1}: ${isSorted(10 to 5 by -1)}")

}
