package com.hackerrank

import scala.collection.immutable.ListMap

object FunctionalStructures {

  // input parsing
  def gcdMain(args: Array[String]) {

    val n = io.StdIn.readInt

    val list = (1 to n).
      map(_ => scala.io.StdIn.readLine).
      map(_.split(" ").
        map(_.toInt).
        grouped(2).
        map(array => array(0) -> array(1)).
        toMap).
      toList


    val result = FunctionalStructures.gcd(list)

    result.foreach(e => Console.out.print(e + " "))
    Console.out.println()
  }


  // solution
  def gcd(input: List[Map[Int, Int]]): List[Int] = {

    def getGCD(map1: Map[Int, Int], map2: Map[Int, Int]): Map[Int, Int] = {

      map1.keySet.intersect(map2.keySet).
        map(x => x -> map1(x).min(map2(x))).
        toMap
    }

    val map = input.reduceLeft((a, b) => getGCD(a, b))

    ListMap(map.toSeq.sortBy(_._1): _*).
      flatMap(x => List(x._1, x._2)).
      toList

  }

}
