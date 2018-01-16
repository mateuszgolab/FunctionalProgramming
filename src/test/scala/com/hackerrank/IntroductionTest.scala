package com.hackerrank

import org.scalactic.{Equality, TolerantNumerics}
import org.scalatest.{FunSuite, Matchers}

class IntroductionTest extends FunSuite with Matchers {

  test("list replication") {

    val list = Introduction.listReplication(2, List(1, 2, 3))

    assert(list.head === 1)
    assert(list(1) === 1)
    assert(list(2) === 2)
    assert(list(3) === 2)
    assert(list(4) === 3)
    assert(list(5) === 3)
    assert(list.size == 6)

  }

  test("filter array") {

    val list = Introduction.filterArray(3, List(3, 10, 9, 8, 2, 7, 5, 1, 3, 0))

    assert(list.head === 2)
    assert(list(1) === 1)
    assert(list(2) === 0)
    assert(list.size == 3)

  }

  test("filter positions in a list") {

    val list = Introduction.filterPositionsInAList(List(2, 3, 10, 9, 8, 2, 7, 5, 1, 3, 0))

    assert(list.head === 3)
    assert(list(1) === 9)
    assert(list(2) === 2)
    assert(list(3) === 5)
    assert(list(4) === 3)
    assert(list.size == 5)

  }

  test("array of N elements") {

    val list = Introduction.arrayOfNelements(2)

    assert(list.size == 2)

  }

  test("reverse a list") {

    val list = Introduction.reverseAlist(List(2,4,5,6,1))

    assert(list.head === 1)
    assert(list(1) === 6)
    assert(list(2) === 5)
    assert(list(3) === 4)
    assert(list(4) === 2)
    assert(list.size == 5)

  }

  test("sum of odd elements") {

    val sum = Introduction.sumOfOddElements(List(2,4,5,6,1))

    assert(sum == 6)

  }

  test("list length") {

    val sum = Introduction.listLength(List(2,4,5,6,1))

    assert(sum == 5)

  }

  test("update list") {

    val list = Introduction.updateList(List(2,-4,-5,6,1))

    assert(list.head === 2)
    assert(list(1) === 4)
    assert(list(2) === 5)
    assert(list(3) === 6)
    assert(list(4) === 1)
    assert(list.size == 5)

  }

  test("Evaluating e^x 20.0") {

    val epsilon = 1e-4f
    implicit val doubleEq: Equality[Double] = TolerantNumerics.tolerantDoubleEquality(epsilon)

    val ex = Introduction.evaluatingEx(20.0)

    assert(ex === 2423600.1887)

  }

  test("Evaluating e^x 0.5") {

    val epsilon = 1e-4f
    implicit val doubleEq: Equality[Double] = TolerantNumerics.tolerantDoubleEquality(epsilon)

    val ex2 = Introduction.evaluatingEx(0.5)

    assert(ex2 === 1.6487)

  }

  test("Functions or not ?") {

    val x = List(1,2,4)
    val y = List(1,2,3)

    val result = Introduction.isFunction(x,y)

    assert(result === "YES")

  }

  test("Functions or not ? 2") {

    val x = List(1,1,3)
    val y = List(1,2,3)

    val result = Introduction.isFunction(x,y)

    assert(result === "NO")

  }

  test("Functions or not ? 3") {

    val x = List(1,2,1)
    val y = List(1,2,1)

    val result = Introduction.isFunction(x,y)

    assert(result === "YES")

  }

}