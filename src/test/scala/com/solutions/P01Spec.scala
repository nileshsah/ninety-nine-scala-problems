package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P01Spec extends AnyFlatSpec with Matchers {
  "Last operation" should "return the last element of a list" in {
    val list = List(1, 1, 2, 3, 5, 8)
    P01.last(list) shouldBe Option(8)
  }

  it should "return the only element" in {
    val list = List(1)
    P01.last(list) shouldBe Option(1)
  }

  it should "return empty option" in {
    val list = Nil
    P01.last(list) shouldBe Option.empty
  }
}
