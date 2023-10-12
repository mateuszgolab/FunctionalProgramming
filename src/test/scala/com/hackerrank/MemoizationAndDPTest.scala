package com.hackerrank

import com.hackerrank.MemoizationAndDP.{differentWays, fibonacciFp, pentagonalNumbers}
import org.scalatest.FunSuite

class MemoizationAndDPTest extends FunSuite {

  test("pentagonal numbers") {

    assert(pentagonalNumbers(1) === 1)
    assert(pentagonalNumbers(2) === 5)
    assert(pentagonalNumbers(3) === 12)
    assert(pentagonalNumbers(4) === 22)
    assert(pentagonalNumbers(5) === 35)
    assert(pentagonalNumbers(100000) === 14999950000L)

  }

  test("fibonacci fp") {

    assert(fibonacciFp(0) === 0)
    assert(fibonacciFp(1) === 1)
    assert(fibonacciFp(5) === 5)
    assert(fibonacciFp(10) === 55)
    assert(fibonacciFp(100) === 24278230)
    assert(fibonacciFp(1000) === 95802669)
    assert(fibonacciFp(10000) === 49520320)

  }

  test("different ways") {

    assert(differentWays(2,1) === 2)
    assert(differentWays(5,1) === 5)
    assert(differentWays(5,2) === 10)
    assert(differentWays(5,3) === 10)
    assert(differentWays(10,5) === 252)
    assert(differentWays(100,5) === 75287520)
    assert(differentWays(900,5) === 86947046)
  }

}
