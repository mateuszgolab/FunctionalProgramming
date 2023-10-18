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

  test("new york chaos example1") {

    // given
    val input: Array[Int] = Array(2, 1, 5, 3, 4)

    // when
    val result = Arrays.minimumBribes(input)

    // then
    assert(result === "3")

  }

  test("new york chaos example2") {

    // given
    val input: Array[Int] = Array(2, 5, 1, 3, 4)

    // when
    val result = Arrays.minimumBribes(input)

    // then
    assert(result === "Too chaotic")

  }

  test("new york chaos min") {

    // given
    val input: Array[Int] = Array(1)

    // when
    val result = Arrays.minimumBribes(input)

    // then
    assert(result === "0")

  }

  test("new york chaos example 3") {

    // given
    val input: Array[Int] = Array(1, 2, 5, 3, 7, 8, 6, 4)

    // when
    val result = Arrays.minimumBribes(input)

    // then
    assert(result === "7")

  }

  test("new york chaos example 4") {

    // given
    val input: Array[Int] = Array(1, 2, 5, 3, 7, 6, 8, 4)

    // when
    val result = Arrays.minimumBribes(input)

    // then
    assert(result === "6")

  }

  test("new york chaos example 5") {

    // given
    val input: Array[Int] = Array(1, 4, 3, 5, 6, 7, 2, 8)

    // when
    val result = Arrays.minimumBribes(input)

    // then
    assert(result === "6")

  }

  test("new york chaos example 6") {

    // given
    val input: Array[Int] = Array(4, 1, 2, 3)

    // when
    val result = Arrays.minimumBribes(input)

    // then
    assert(result === "Too chaotic")

  }

  test("new york chaos example 7") {

    // given
    val input: Array[Int] = Array(1,2,5,6,4,8,7,3)

    // when
    val result = Arrays.minimumBribes(input)

    // then
    assert(result === "8")

  }

  test("new york chaos example 8") {

    // given
    val input: Array[Int] = Array(3,2,4,5,1,7,8,6)

    // when
    val result = Arrays.minimumBribes(input)

    // then
    assert(result === "7")

  }

  test("new york chaos ordered") {

    // given
    val input: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8)

    // when
    val result = Arrays.minimumBribes(input)

    // then
    assert(result === "0")

  }

  test("new york chaos 10^4") {

    // given
    val input: Array[Int] = (2 to 10001).reverse.toArray

    // when
    val result = Arrays.minimumBribes(input)

    // then
    //    assert(result === "0")

  }

  test("new york chaos 10^5") {

    // given
    val input: Array[Int] = (2 to 100001).reverse.toArray

    // when
    val result = Arrays.minimumBribes(input)

    // then
    //    assert(result === "0")

  }

//  test("new york chaos find test case") {
//
//    while(true) {
//
//      // given
//      val input: Array[Int] = Random.shuffle(List(1, 2, 3, 4, 5, 6, 7, 8)).toArray
//
//      // when
//      val result1 = Arrays.minimumBribes(input)
//      val result2 = Arrays.minimumBribes2(input)
//
//      if(result1 != result2) {
//        input.foreach(p => print(p))
//        break
//      }
//
//    }
//
//  }

}
