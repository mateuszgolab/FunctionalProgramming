package com.hackerrank.interviewpreparationkit

import org.scalatest.FunSuite

class DictionariesAndHashmapsTest extends FunSuite {

  test("magazine example Yes") {

    // given
    val magazine = Array("give", "me", "one", "grand", "today", "night")
    val note = Array("give", "one", "grand", "today")

    // when
    val result = DictionariesAndHashmaps.checkMagazine(magazine, note)

    // then
    assert(result === "Yes")
  }

  test("magazine example No") {

    // given
    val magazine = Array("two", "times", "three", "is", "not", "four")
    val note = Array("two", "times", "two", "is", "four")

    // when
    val result = DictionariesAndHashmaps.checkMagazine(magazine, note)

    // then
    assert(result === "No")
  }

  test("magazine example No 2") {

    // given
    val magazine = Array("ive", "got", "lovely", "bunch", "of", "coconuts")
    val note = Array("ive", "got", "some", "coconuts")

    // when
    val result = DictionariesAndHashmaps.checkMagazine(magazine, note)

    // then
    assert(result === "No")
  }


}