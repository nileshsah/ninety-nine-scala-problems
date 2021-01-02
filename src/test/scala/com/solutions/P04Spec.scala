package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P04Spec extends AnyFlatSpec with Matchers {
  "Length operation" should "return correct length of list" in {
    val list = List(1, 1, 2, 3, 5, 8)
    P04.length(list) shouldBe 6
  }

  it should "return zero for empty list" in {
    val list = Nil
    P04.length(list) shouldBe 0
  }
}
