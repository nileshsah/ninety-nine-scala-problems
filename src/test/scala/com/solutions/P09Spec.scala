package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P09Spec extends AnyFlatSpec with Matchers {
  "Pack operation" should "collect consecutive duplicates" in {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    P09.pack(list) shouldBe List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  }

  it should "return Nil for empty list" in {
    val list = Nil
    P09.pack(list) shouldBe Nil
  }

  it should "return single list element list for singleton list" in {
    val list = List(2)
    P09.pack(list) shouldBe List(List(2))
  }

  it should "return list of same elements if it contains no consecutive duplicates" in {
    val list = List(1, 2, 1)
    P09.pack(list) shouldBe List(List(1), List(2), List(1))
  }
}
