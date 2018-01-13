package com.hackerrank

import com.hackerrank.Introduction.factorial

object Recurison {

  def binomialCoefficients(n : Int, k : Int): BigInt = factorial(n)/(factorial(k)*factorial(n-k))

  def pascalsTriangle(n : Int): Unit = {

    for (i <- 0 until n) {
        for( j <- 0 to i) {
          print(binomialCoefficients(i,j))
          if(j < i){
            print(" ")
          }
        }
      if(i < n-1) {
        println()
      }
    }
  }
}
