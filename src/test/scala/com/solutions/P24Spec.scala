package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P24Spec extends AnyFlatSpec with Matchers {
  "Lotto operation" should "randomly select elements from set" in {
    P24.lotto(6, 49) shouldBe List(30, 34, 35, 32, 20, 26)
  }

  it should "return empty list" in {
    P24.lotto(0, 20) shouldBe Nil
  }

  it should "return entire list when number of elements to select exceed list size" in {
    P24.lotto(7, 5) shouldBe List(1, 4, 5, 4, 3, 3, 2)
  }
}
