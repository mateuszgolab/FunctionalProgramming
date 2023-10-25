package com.hackerrank.interviewpreparationkit

object StringManipulation {

  /*
      * Complete the 'makeAnagram' function below.
      *
      * The function is expected to return an INTEGER.
      * The function accepts following parameters:
      *  1. STRING a
      *  2. STRING b
      */

  def makeAnagram(a: String, b: String): Int = {
    def toMap(s: String): Map[Char, Int] = s.groupBy(identity).mapValues(_.length) //.foldLeft(Map[Char, Int]() withDefaultValue 0) { (map, character) => map.updated(character, map(character) + 1) }

    val aMap = toMap(a)
    val bMap = toMap(b)
    val allKeys = aMap.keySet union bMap.keySet
    allKeys
      .toSeq
      .map(k => Math.abs(aMap.getOrElse(k, 0) - bMap.getOrElse(k, 0)))
      .sum
  }
}