package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P05Spec extends AnyFlatSpec with Matchers {
  "Reverse operation" should "return reversed list" in {
    val list = List(1, 1, 2, 3, 5, 8)
    P05.reverse(list) shouldBe List(8, 5, 3, 2, 1, 1)
  }

  it should "return Nil for empty list" in {
    val list = Nil
    P05.reverse(list) shouldBe Nil
  }

  it should "return single element for singleton list" in {
    val list = List(1)
    P05.reverse(list) shouldBe List(1)
  }
}
