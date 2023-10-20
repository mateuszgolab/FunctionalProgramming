import scala.annotation.tailrec

/**
 * Algorithms implemented in FP way
 */
object Algorithms {

  def bubbleSort(a: List[Int]): List[Int] = {
    def sort(a: List[Int], result: List[Int]): List[Int] = {
      if (a.isEmpty) result
      else bubble(a, Nil, result)
    }

    @tailrec
    def bubble(head: List[Int], tail: List[Int], result: List[Int]): List[Int] = head match {
      case h1 :: h2 :: t =>
        if (h1 > h2) bubble(h1 :: t, h2 :: tail, result)
        else bubble(h2 :: t, h1 :: tail, result)
      case h :: Nil => sort(tail, h :: result)
    }

    sort(a, Nil)
  }

}
