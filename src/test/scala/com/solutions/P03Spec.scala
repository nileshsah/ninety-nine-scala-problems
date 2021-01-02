package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P03Spec extends AnyFlatSpec with Matchers {
  "Nth operation" should "return the requested element of a list" in {
    val list = List(1, 1, 2, 3, 5, 8)
    P03.nth(0, list) shouldBe Option(1)
    P03.nth(1, list) shouldBe Option(1)
    P03.nth(2, list) shouldBe Option(2)
    P03.nth(5, list) shouldBe Option(8)
  }

  it should "return empty option for out of bound n" in {
    val list = List(1, 2, 3, 4)
    P03.nth(4, list) shouldBe Option.empty
  }

  it should "return empty option for empty list" in {
    val list = Nil
    P03.nth(3, list) shouldBe Option.empty
  }
}
