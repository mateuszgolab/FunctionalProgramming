package com.hackerrank

import com.hackerrank.Recurison._
import org.scalatest.FunSuite



class RecurisonTest extends FunSuite {

  test("Pascal's Triangle 4") {

    pascalsTriangle(4)

  }

  test("String Mingling") {

    val result = stringMingling("hacker", "ranker")

    assert(result === "hraacnkkeerr")

  }

  test("String-o-Permute") {

    var result = stringOPermute("abcdpqrs")

    assert(result === "badcqpsr")

    result = stringOPermute("az")

    assert(result === "za")

  }

  test("String Compression") {

    assert(stringCompression("abcaaabbb") === "abca3b3")
    assert(stringCompression("abcd") === "abcd")
    assert(stringCompression("aaabaaaaccaaaaba") === "a3ba4c2a4ba")

  }

  test("Prefix Compression") {

    assert(prefixCompression("abcdefpr", "abcpqr") === List("abc", "defpr", "pqr"))
    assert(prefixCompression("kitkat", "kit") === List("kit", "kat", ""))
    assert(prefixCompression("puppy", "puppy") === List("puppy", "", ""))

  }

  test("String reductions") {

    assert(stringReductions("accabb") == "acb")
    assert(stringReductions("abc") == "abc")
    assert(stringReductions("pprrqq") == "prq")
    assert(stringReductions("asdsa") == "asd")

  }

  test("Number Of Ways") {

    assert(numberOfWays(10,2) == 1)
    assert(numberOfWays(100,2) == 3)
    assert(numberOfWays(100,3) == 1)
    assert(numberOfWays(1000,3) == 1)


  }

  test("Sequence full of colors") {

    assert(sequenceFullOfColors("RGGR") === "True")
    assert(sequenceFullOfColors("RYBG") === "True")
    assert(sequenceFullOfColors("RYRB") === "False")
    assert(sequenceFullOfColors("RYRBGG") === "False")
    assert(sequenceFullOfColors("YGYGRBRB") === "False")
    assert(sequenceFullOfColors("RYBG" * 100000) === "True")


  }

}
