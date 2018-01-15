package com.hackerrank

import org.scalatest.FunSuite

class RecurisonTest extends FunSuite {

  test("Pascal's Triangle 4") {

    Recurison.pascalsTriangle(4)

  }

  test("String Mingling") {

    val result = Recurison.stringMingling("hacker", "ranker")

    assert(result === "hraacnkkeerr")

  }


}
