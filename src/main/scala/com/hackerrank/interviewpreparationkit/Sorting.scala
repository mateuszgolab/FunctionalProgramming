package com.hackerrank.interviewpreparationkit

object Sorting {

  /*
       * Complete the 'countSwaps' function below.
       *
       * The function accepts INTEGER_ARRAY a as parameter.
       */

  def countSwaps(a: Array[Int]): (Int, Int, Int) = {
    var counter = 0
    for (
      i <- a.indices;
      j <- 0 to (a.length - 2 - i)
    ) {
      if (a(j) > a(j + 1)) {
        val tmp = a(j)
        a(j) = a(j + 1)
        a(j + 1) = tmp
        counter = counter + 1
      }
    }
    (counter, a.head, a.last)
  }
}