package com.hackerrank.interviewpreparationkit

object Arrays {

  /*
   * Complete the 'hourglassSum' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts 2D_INTEGER_ARRAY arr as parameter.
   */

  def hourglassSum(arr: Array[Array[Int]]): Int = {

    def calculateHourGlass(arr: Array[Array[Int]], row: Int, column: Int): Int = {
      if ((row + 2) < arr.length && (column + 2) < arr(0).length) {
        arr(row)(column) + arr(row)(column + 1) + arr(row)(column + 2) + arr(row + 1)(column + 1) + arr(row + 2)(column) + arr(row + 2)(column + 1) + arr(row + 2)(column + 2)
      } else -100000
    }

    val sums = for (
      i <- 0 to arr.length;
      j <- 0 to arr.length
    ) yield calculateHourGlass(arr, i, j)

    sums.max
  }

  def rotLeft(a: Array[Int], d: Int): Array[Int] = (for (i <- d until d + a.length) yield a(i % a.length)).toArray

  def minimumBribes(q: Array[Int]): String = {

    def swap(ar: Array[Int], index1: Int, index2: Int): Unit = {
      val tmp = ar(index1)
      ar(index1) = ar(index2)
      ar(index2) = tmp
    }

    val check = q.indices.find(i => q(i) - 1 - i >= 3)
    if (check.isDefined) return "Too chaotic"

    var swapCounter = 0
    q.indices.reverse.foreach(i => {
      if (i > 0 && q(i - 1) == i + 1) {
        swap(q, i - 1, i)
        swapCounter = swapCounter + 1
      } else if (i > 1 && q(i - 2) == i + 1) {
        swap(q, i - 2, i - 1)
        swap(q, i - 1, i)
        swapCounter = swapCounter + 2
      }
    })

    swapCounter.toString
  }

}


