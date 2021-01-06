package com.hackerrank


object ReadInput {

  def main0(args: Array[String]) {

    val n = io.StdIn.readInt
    val list = io.Source.stdin.getLines().toList

    val input: Int = Console.in.read()
    val inputList = Console.in.readLine().map(e => e.toInt)

  }

  def main1(args: Array[String]) {

    for (_ <- 1 to io.StdIn.readInt) {

      val k = io.StdIn.readLine().split(' ')(1).toInt
      val seq = io.StdIn.readLine().split(' ').map(_.toInt)

      val result = Seq.empty[Int]

      if (result.nonEmpty) result.foreach(e => Console.out.print(e + " "))
      else Console.out.print("-1")

      Console.out.println()
    }
  }

  def main2(args: Array[String]) {

    val n = io.StdIn.readInt

    val lists = (1 to n).map(_ => io.StdIn.readLine().split(' ').map(_.toInt).toList).toList

    //    result.foreach(e => Console.out.print(e + " "))
    Console.out.println()
  }

  def main3(args: Array[String]) {

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

}



