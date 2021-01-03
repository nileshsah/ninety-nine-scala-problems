package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P14Spec extends AnyFlatSpec with Matchers {
  "Duplicate operation" should "repeat every element in the list twice" in {
    val list = List('a, 'b, 'c, 'c, 'd)
    P14.duplicate(list) shouldBe List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  }

  it should "return Nil for empty list" in {
    val list = Nil
    P14.duplicate(list) shouldBe Nil
  }

  it should "return two-item list for singleton list" in {
    val list = List(3)
    P14.duplicate(list) shouldBe List(3, 3)
  }
}
