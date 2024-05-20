package com.abhinav.algo

import com.abhinav.util.Utilities._

object DP extends App{

  def nth_fib(num: Int): Int = {
    if(num < 3) 1 else nth_fib(num-1) + nth_fib(num-2)
  }

  override def main(args: Array[String]) = {
    for ( num <- 1 to 10 )
      println(s"${num}th Fibonnaci Number: ${logRuntime(nth_fib(num))}")
  }
}
