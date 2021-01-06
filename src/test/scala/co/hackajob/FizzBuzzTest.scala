package co.hackajob

import org.scalatest.FunSuite

class FizzBuzzTest extends FunSuite {

  test("example") {
    val result = FizzBuzz.run(1, 5)
    assert(result === "1,2,Fizz,4,Buzz")
  }

  test("test1") {
    val result = FizzBuzz.run(10, 15)
    assert(result === "Buzz,11,Fizz,13,14,FizzBuzz")
  }

  test("test2") {
    val result = FizzBuzz.run(15, 15)
    assert(result === "FizzBuzz")
  }

  test("test3") {
    val result = FizzBuzz.run(0, 5)
    assert(result === "0,1,2,Fizz,4,Buzz")
  }


}
