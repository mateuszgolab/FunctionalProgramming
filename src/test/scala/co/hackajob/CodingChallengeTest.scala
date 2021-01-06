package co.hackajob

import org.scalatest.FunSuite

class CodingChallengeTest extends FunSuite {

  test("example") {

    val result = CodingChallenge.challenge1(Array(2,4,5,4,2))

    assert(result === 5)

  }

  test("minimal") {

    val result = CodingChallenge.challenge1(Array(2,4,2))

    assert(result === 4)

  }

  test("minimal - no pairs") {

    val result = CodingChallenge.challenge1(Array(2,4,7))

    assert(result === 7)

  }

}
