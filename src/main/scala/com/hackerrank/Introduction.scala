package com.hackerrank

import com.hackerrank.Common.factorial

object Introduction {

  def listReplication(num: Int, arr: List[Int]): List[Int] = arr.flatMap(i => List.fill(num)(i))

  def filterArray(delim: Int, arr: List[Int]): List[Int] = arr.filter(i => i < delim)

  def filterPositionsInAList(arr: List[Int]): List[Int] = arr.zipWithIndex.filter { _._2 % 2 == 1 }.map { _._1}

  def arrayOfNelements(num:Int) : List[Int] = List.fill(num)(1)

  def reverseAlist(arr:List[Int]):List[Int] = arr.reverse

  def sumOfOddElements(arr:List[Int]):Int = arr.filter( i => i % 2 != 0).sum

  def listLength(arr:List[Int]):Int = arr.size

  def updateList(arr:List[Int]):List[Int] = arr.map(e => Math.abs(e))

  def evaluatingEx(x : Double) : Double = List.range(0, 10).map(i => Math.pow(x,i)/factorial(i).doubleValue()).sum
}
