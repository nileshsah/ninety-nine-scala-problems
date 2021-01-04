package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P26Spec extends AnyFlatSpec with Matchers {
  "Combinations operation" should "generate all requested combinations" in {
    val list = List(1, 2, 3)
    P26.combinations(2, list) shouldBe List(List(1, 2), List(1, 3), List(2, 3))
  }

  it should "return empty list" in {
    P26.combinations(4, List(1, 2, 3)) shouldBe Nil
  }

  it should "return the complete" in {
    val list = List(1, 2, 3)
    P26.combinations(3, list) shouldBe List(List(1, 2, 3))
  }
}
