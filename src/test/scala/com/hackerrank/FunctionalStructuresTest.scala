package com.hackerrank

import org.scalatest.FunSuite

class FunctionalStructuresTest extends FunSuite {


  test("Lists and GCD test 1") {

    val map1 = Map(7 -> 2)
    val map2 = Map(2 -> 2, 7 -> 1)

    val result = FunctionalStructures.gcd(List(map1, map2))

    assert(result === List(7, 1))

  }

  test("Lists and GCD test 2") {

    val map1 = Map(2 -> 2, 3 -> 2, 5 -> 3)
    val map2 = Map(3 -> 2, 5 -> 3, 11 -> 1)
    val map3 = Map(2 -> 2, 3 -> 3, 5 -> 4, 7 -> 6, 19 -> 18)
    val map4 = Map(3 -> 10, 5 -> 15)

    val result = FunctionalStructures.gcd(List(map1, map2, map3, map4))

    assert(result === List(3, 2, 5, 3))

  }

  test("Lists and GCD test 3") {

    val map1 = Map(5 -> 3, 2 -> 2, 3 -> 2 )
    val map2 = Map(3 -> 2, 5 -> 3, 11 -> 1)
    val map3 = Map(2 -> 2, 3 -> 3, 5 -> 4, 7 -> 6, 19 -> 18)
    val map4 = Map(3 -> 10, 5 -> 15)

    val result = FunctionalStructures.gcd(List(map1, map2, map3, map4))

    assert(result === List(3, 2, 5, 3))

  }

}
