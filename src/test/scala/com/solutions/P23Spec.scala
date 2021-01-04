package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P23Spec extends AnyFlatSpec with Matchers {
  "Random select operation" should "select random numbers from list" in {
    val list = List('a, 'b, 'c, 'd, 'f, 'g, 'h)
    P23.randomSelect(3, list) shouldBe List('b, 'f, 'g)
  }

  it should "return empty list" in {
    P23.randomSelect(3, Nil) shouldBe Nil
  }

  it should "return entire list when number of elements to select exceed list size" in {
    val list = List(1, 2, 3, 4, 5)
    P23.randomSelect(7, list) shouldBe List(5, 2, 3, 1, 4)
  }
}
