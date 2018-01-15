package com.hackerrank

import com.hackerrank.Common.binomialCoefficients

object Recurison {

  def pascalsTriangle(n: Int): Unit = {

    for (i <- 0 until n) {
      for (j <- 0 to i) {
        print(binomialCoefficients(i, j))
        if (j < i) {
          print(" ")
        }
      }
      if (i < n - 1) {
        println()
      }
    }
  }

  def stringMingling(p: String, q: String): String = p.toCharArray zip q.toCharArray map (e => e._1.toString concat e._2.toString) mkString

}
