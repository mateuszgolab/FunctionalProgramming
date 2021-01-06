package com.codingdojo

import com.codingdojo.GameOfLife.{generation1, nextGeneration}
import org.scalatest.FunSuite

class GameOfLifeTest extends FunSuite {

  test("Generation 2") {

    val gen2 = nextGeneration(generation1())

    assert(gen2(0) === "........")
    assert(gen2(1) === "...**...")
    assert(gen2(2) === "...**...")
    assert(gen2(3) === "........")

  }

  test("Generation 3") {

    val gen2 = nextGeneration(nextGeneration(generation1()))

    assert(gen2(0) === "........")
    assert(gen2(1) === "...**...")
    assert(gen2(2) === "...**...")
    assert(gen2(3) === "........")

  }

  test("edge cases") {

    val gen1: Array[String] = Array("*......*", "........", "...*....", "*......*")

    val gen2 = nextGeneration(gen1)

    assert(gen2(0) === "........")
    assert(gen2(1) === "........")
    assert(gen2(2) === "........")
    assert(gen2(3) === "........")

  }

}
