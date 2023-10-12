package com.hackerrank

import scala.annotation.tailrec

object MemoizationAndDP {

  // input
  def main(args: Array[String]) {

    val n = io.StdIn.readInt

    (1 to n).
      map(_ => io.StdIn.readInt).
      foreach(x => println(pentagonalNumbers(x)))

  }

  def main2(args: Array[String]) {

    val n = io.StdIn.readInt

    (1 to n).
      map(_ => scala.io.StdIn.readLine).
      flatMap(_.split(" ").
        map(_.toInt).
        grouped(2)).
      foreach(x => println(differentWays(x(0), x(1))))

  }


  // solutions
  def pentagonalNumbers(n: Long): Long = (3 * n * n - n) / 2

  def fibonacciFp(n: Int): Int = {
    @tailrec
    def fib(n: Int, acc1: Int, acc2: Int): Int = n match {
      case 0 => acc1
      case 1 => acc2
      case _ => fib(n - 1, acc2, (acc1 + acc2) % 100000007)
    }

    fib(n, 0, 1)
  }

  def memoize[N, K, V](f: (N,K) => V): (N,K) => V = {
    val cache = scala.collection.mutable.Map.empty[(N, K), V]
    (n, k) => cache.getOrElseUpdate((n, k) , f(n, k))
  }

  val differentWays: (Int, Int) => Int = memoize((n, k) => {
    if (k == 0 || k == n) 1
    else (differentWays(n - 1, k - 1) + differentWays(n - 1, k)) % 100000007
  })


}
