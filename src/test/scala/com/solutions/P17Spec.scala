package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P17Spec extends AnyFlatSpec with Matchers {
  "Split operation" should "break list into pair" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    P17.split(3, list) shouldBe (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }

  it should "return Nil for empty list" in {
    val list = Nil
    P17.split(3, list) shouldBe (Nil, Nil)
  }

  it should "return single-item list for singleton list" in {
    val list = List(3)
    P17.split(2, list) shouldBe (List(3), Nil)
  }

  it should "break the list at correct place" in {
    val list = List(1, 2, 3, 4)
    P17.split(1, list) shouldBe (List(1), List(2, 3, 4))
  }
}
