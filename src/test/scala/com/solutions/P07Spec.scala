package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P07Spec extends AnyFlatSpec with Matchers {
  "Flatten operation" should "flatten a diverse list" in {
    val list = List(List(1, 1), 2, List(3, List(5, 8)))
    P07.flatten(list) shouldBe List(1, 1, 2, 3, 5, 8)
  }

  it should "return Nil for empty list" in {
    val list = Nil
    P07.flatten(list) shouldBe Nil
  }

  it should "return list of integers" in {
    val list = List(1, 2, 3, 4, 5)
    P07.flatten(list) shouldBe List(1, 2, 3, 4, 5)
  }

  it should "return concatenated elements in list" in {
    val list = List(List(1), List(2), List(3, List(4, List(List(5)))))
    P07.flatten(list) shouldBe List(1, 2, 3, 4, 5)
  }
}
