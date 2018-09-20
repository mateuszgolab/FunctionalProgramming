package com.hackerrank

import com.hackerrank.Common.binomialCoefficients

import scala.annotation.tailrec
import scala.collection.mutable

object Recurison {

  def pascalsTriangle(n: Int): Unit = {

    for (i <- 0 until n) {
      for (j <- 0 to i) {
        print(binomialCoefficients(i, j))
        if (j < i) {
          print(" ")
        }
      }
      if (i < n - 1) {
        println()
      }
    }
  }

  def stringMingling(p: String, q: String): String = p.toCharArray zip q.toCharArray map (e => e._1.toString concat e._2.toString) mkString ""

  def stringOPermute(input: String): String = input.grouped(2).map(_.reverse).mkString("")

  def stringCompression(input: String): String = {

    @tailrec
    def consecutiveCounter(in: List[Char], lastChar: Char, counter: Int, result: StringBuilder): String = in match {
      case head :: tail =>
        if (head == lastChar) consecutiveCounter(tail, lastChar, counter + 1, result)
        else consecutiveCounter(tail, head, 1, result.append(lastChar).append(if (counter > 1) counter else ""))
      case _ => result.append(lastChar).append(if (counter > 1) counter else "").toString()
    }

    consecutiveCounter(input.toList.tail, input.head, 1, new StringBuilder)

  }

// TODO : try with zip
  def prefixCompression(x: String, y: String): List[String] = {

    @tailrec
    def compression(x: List[Char], y: List[Char], prefix: mutable.StringBuilder): List[String] = x match {
      case head :: tail =>
        if(y.isEmpty) List(prefix.toString(), x mkString "", "")
        else if (head == y.head) compression(tail, y.tail, prefix.append(head))
        else List(prefix.toString(), x mkString "", y mkString "")
      case _ => List(prefix.toString(), "", "")
    }

    compression(x.toList, y.toList, new StringBuilder)

  }

  def stringReductions(s : String) : String = s.toCharArray.distinct mkString ""

  def numberOfWays(X:Int,N:Int):Int = {

    def rec(X:Int, N:Int, I:Int, limit : Int) : Int = {
      if(X == 0) 1
      else if(X < 0) 0
      else (I to limit).map(i => rec(X - Math.pow(i, N).toInt, N, i + 1, limit)).sum

    }

    (1 to Math.sqrt(X).toInt).map(i => rec(X - Math.pow(i, N).toInt, N, i + 1, Math.sqrt(X).toInt)).sum
  }

}
