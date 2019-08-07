package com.hackerrank

import com.hackerrank.Recurison._
import org.scalatest.FunSuite

import scala.util.Random


class RecurisonTest extends FunSuite {

  val random = new Random()

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

    assert(numberOfWays(10, 2) == 1)
    assert(numberOfWays(100, 2) == 3)
    assert(numberOfWays(100, 3) == 1)
    assert(numberOfWays(1000, 3) == 1)


  }

  test("Sequence full of colors") {

    assert(sequenceFullOfColors("RGGR") === "True")
    assert(sequenceFullOfColors("RYBG") === "True")
    assert(sequenceFullOfColors("RYRB") === "False")
    assert(sequenceFullOfColors("RYRBGG") === "False")
    assert(sequenceFullOfColors("YGYGRBRB") === "False")
    assert(sequenceFullOfColors("RYBG" * 100000) === "True")

  }

  test("Filter elements") {

    assert(filterElements(Seq(4, 5, 2, 5, 4, 3, 1, 3, 4), 2) === Seq(4, 5, 3))
    assert(filterElements(Seq(4, 5, 2, 5, 4, 3, 1, 3, 4), 4) === Seq.empty[Int])
    assert(filterElements(Seq(5, 4, 3, 2, 1, 1, 2, 3, 4, 5), 2) === Seq(5, 4, 3, 2, 1))


    filterElements(Seq.fill(10000)(random.nextInt()), random.nextInt())


  }

  test("Filter elements no mutable") {

    assert(filterElementsNoMutable(Seq(4, 5, 2, 5, 4, 3, 1, 3, 4), 2) === Seq(4, 5, 3))
    assert(filterElementsNoMutable(Seq(4, 5, 2, 5, 4, 3, 1, 3, 4), 4) === Seq.empty[Int])
    assert(filterElementsNoMutable(Seq(5, 4, 3, 2, 1, 1, 2, 3, 4, 5), 2) === Seq(5, 4, 3, 2, 1))


    filterElementsNoMutable(Seq.fill(10000)(random.nextInt()), random.nextInt())

  }

}
