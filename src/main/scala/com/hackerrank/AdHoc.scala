package com.hackerrank


object AdHoc {

  def rotateString(s: String): Unit = subRotate(s.tail, s.head, 1, s.length)

  def subRotate(prefix: String, suffix: Char, step : Int, limit :Int): Unit = {

    val subString = prefix.concat(suffix.toString)
    print(subString)

    if (step < limit) {
      print(" ")
      subRotate(subString.tail, subString.head, step + 1, limit)
    } else{
      println()
    }

  }

}
