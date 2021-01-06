package co.hackajob

object CodingChallenge {

  def challenge1(student_list: Array[Int]): Int = {

    student_list.groupBy(identity).
      mapValues(s => s.length).
      filter(s => s._2 % 2 == 1).
      last._1

  }


}
