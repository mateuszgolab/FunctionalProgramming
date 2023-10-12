package com.hackerrank.interviewpreparationkit

import org.scalatest.FunSuite

class ArraysTest extends FunSuite {

  test("hourglass example") {

    // given
    val input = Array(
      Array[Int](1, 1, 1, 0, 0, 0),
      Array[Int](0, 1, 0, 0, 0, 0),
      Array[Int](1, 1, 1, 0, 0, 0),
      Array[Int](0, 0, 2, 4, 4, 0),
      Array[Int](0, 0, 0, 2, 0, 0),
      Array[Int](0, 0, 1, 2, 4, 0)
    )

    val result = Arrays.hourglassSum(input)

    assert(result === 19)

  }

  test("hour glass min input") {

    // given
    val input = Array(
      Array[Int](1, 1, 1),
      Array[Int](0, 1, 0),
      Array[Int](1, 1, 1)
    )

    val result = Arrays.hourglassSum(input)

    assert(result === 7)

  }

  test("rotLeft example") {

    // given
    val input = Array[Int](1, 2, 3, 4, 5)

    // when
    val result = Arrays.rotLeft(input, 4)

    // then
    assert(result === Array[Int](5, 1, 2, 3, 4))

  }

}

