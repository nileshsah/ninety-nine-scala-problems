package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P02Spec extends AnyFlatSpec with Matchers {
  "Penultimate operation" should "return the second-last element of a list" in {
    val list = List(1, 1, 2, 3, 5, 8)
    P02.penultimate(list) shouldBe Option(5)
  }

  it should "return the first element" in {
    val list = List(1, 2)
    P02.penultimate(list) shouldBe Option(1)
  }

  it should "return empty option for empty list" in {
    val list = Nil
    P02.penultimate(list) shouldBe Option.empty
  }

  it should "return empty option for singleton list" in {
    val list = List(1)
    P02.penultimate(list) shouldBe Option.empty
  }
}
