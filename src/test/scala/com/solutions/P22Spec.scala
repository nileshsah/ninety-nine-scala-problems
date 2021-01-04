package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P22Spec extends AnyFlatSpec with Matchers {
  "range operation" should "generate numbers from start to end inclusive" in {
    P22.range(4, 9) shouldBe List(4, 5, 6, 7, 8, 9)
  }

  it should "return empty list for invalid range" in {
    P22.range(4, 1) shouldBe Nil
  }

  it should "return list with single item" in {
    P22.range(4, 4) shouldBe List(4)
  }
}
