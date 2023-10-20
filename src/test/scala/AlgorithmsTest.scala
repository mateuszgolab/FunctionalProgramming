import org.scalatest.FunSuite

class AlgorithmsTest extends FunSuite {


  test("bubble sort 1") {

    // given
    val input = List(6, 5, 4, 3, 2, 1)

    // when
    val result = Algorithms.bubbleSort(input)

    // then
    assert(result === input.sorted)
  }

  test("bubble sort 2") {

    // given
    val input = List(6, 2, 3, 4, 1, 5)

    // when
    val result = Algorithms.bubbleSort(input)

    // then
    assert(result === input.sorted)
  }

}
