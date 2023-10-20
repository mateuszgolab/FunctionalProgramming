package com.hackerrank.interviewpreparationkit

import org.scalatest.FunSuite

class SortingTest extends FunSuite {

  test("sample 0") {

    // given
    val input = Array(6, 4, 1)

    // when
    val result = Sorting.countSwaps(input)

    // then
    assert(result === (3, 1, 6))
  }

  test("sample 1") {

    // given
    val input = Array(3, 2, 1)

    // when
    val result = Sorting.countSwaps(input)

    // then
    assert(result === (3, 1, 3))
  }

  test("sample 2") {

    // given
    val input = Array(6, 5, 4, 3, 2, 1)

    // when
    val result = Sorting.countSwaps(input)

    // then
    assert(result === (15, 1, 6))
  }

  test("sample 3") {

    // given
    val input = Array(6, 2, 3, 4, 1, 5)

    // when
    val result = Sorting.countSwaps(input)

    // then
    assert(result === (8, 1, 6))
  }

}