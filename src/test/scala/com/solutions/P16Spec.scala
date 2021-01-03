package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P16Spec extends AnyFlatSpec with Matchers {
  "Drop N operation" should "remove every n-th number" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    P16.drop(3, list) shouldBe List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  }

  it should "return Nil for empty list" in {
    val list = Nil
    P16.drop(3, list) shouldBe Nil
  }

  it should "return single-item list for singleton list" in {
    val list = List(3)
    P16.drop(2, list) shouldBe List(3)
  }

  it should "return empty list when n equals one" in {
    val list = List(1, 2, 3, 4)
    P16.drop(1, list) shouldBe Nil
  }
}
