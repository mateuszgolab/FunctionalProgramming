package com.hackerrank

import scala.annotation.tailrec

object Common {

  def factorial(n: BigInt): BigInt = {
    if (n < 2) 1
    else n * factorial(n - 1)
  }

  def binomialCoefficients(n: Int, k: Int): BigInt = factorial(n) / (factorial(k) * factorial(n - k))


  def fibonacciStream(n: Int): BigInt = {
    def fib: Stream[BigInt] = 0 #:: fib.scan(BigInt(1))(_ + _)

    fib(n)
  }

  def fibonacciTailRec(n: Int): BigInt = {
    @tailrec
    def fib(n: Int, acc1: BigInt, acc2: BigInt): BigInt = n match {
      case 0 => acc1
      case 1 => acc2
      case _ => fib(n - 1, acc2, acc1 + acc2)
    }

    fib(n, 0, 1)
  }

}
