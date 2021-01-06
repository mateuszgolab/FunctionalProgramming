package com.hackerrank

import scala.math.BigInt

object Common {

  def factorial(n: BigInt): BigInt = {
    if (n < 2) 1
    else n * factorial(n - 1)
  }

  def binomialCoefficients(n: Int, k: Int): BigInt = factorial(n) / (factorial(k) * factorial(n - k))

}
