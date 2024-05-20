package com.abhinav.util


object Utilities {
  def logRuntime[T](block: => T): T = {
    val before = System.nanoTime
    val result = block
    val after = System.nanoTime
    println(s"Elapsed time: ${after - before} nano seconds")
    result
  }
}
