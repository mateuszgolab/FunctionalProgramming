package com.hackerrank.interviewpreparationkit

object DictionariesAndHashmaps {

  /*
       * Complete the 'checkMagazine' function below.
       *
       * The function accepts following parameters:
       *  1. STRING_ARRAY magazine
       *  2. STRING_ARRAY note
       */

  def checkMagazine(magazine: Array[String], note: Array[String]): String = {
    val magazineMap = magazine.groupBy(identity).mapValues(_.length)
    val noteMap = note.groupBy(identity).mapValues(_.length)
    val result = noteMap.find(n => magazineMap.getOrElse(n._1, 0) < n._2)
    result match {
      case None => "Yes"
      case _ => "No"
    }
  }
}