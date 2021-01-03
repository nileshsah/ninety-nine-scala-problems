package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P18Spec extends AnyFlatSpec with Matchers {
  "Slice operation" should "extract the requested part of the list" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    P18.slice(3, 7, list) shouldBe List('d, 'e, 'f, 'g)
  }

  it should "return Nil for empty list" in {
    val list = Nil
    P18.slice(3, 7, list) shouldBe Nil
  }

  it should "return single-item list for singleton list" in {
    val list = List(3)
    P18.slice(0, 1, list) shouldBe List(3)
  }

  it should "return Nil for invalid slice range" in {
    val list = List(1, 2, 3, 4)
    P18.slice(5, 7, list) shouldBe Nil
  }

  it should "return partial list for overflowing range" in {
    val list = List(1, 2, 3, 4)
    P18.slice(2, 7, list) shouldBe List(3, 4)
  }
}
