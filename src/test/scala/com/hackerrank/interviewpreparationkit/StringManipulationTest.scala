package com.hackerrank.interviewpreparationkit

import org.scalatest.FunSuite

class StringManipulationTest extends FunSuite {

  test("sample 0") {

    // given
    val a = "cde"
    val b = "dcf"

    // when
    val result = StringManipulation.makeAnagram(a, b)

    // then
    assert(result === 2)
  }

  test("sample 1") {

    // given
    val a = "cde"
    val b = "abc"

    // when
    val result = StringManipulation.makeAnagram(a, b)

    // then
    assert(result === 4)
  }

  test("sample 2") {

    // given
    val a = "cdeed"
    val b = "abceddd"

    // when
    val result = StringManipulation.makeAnagram(a, b)

    // then
    assert(result === 4)
  }

}