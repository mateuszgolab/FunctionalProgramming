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

}
