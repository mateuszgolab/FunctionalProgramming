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


}


