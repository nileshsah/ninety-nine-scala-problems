package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P21Spec extends AnyFlatSpec with Matchers {
  "Insert At operation" should "insert the element at specified position" in {
    val list = List('a, 'b, 'c, 'd)
    P21.insertAt('new, 1, list) shouldBe List('a, 'new, 'b, 'c, 'd)
  }

  it should "return list with single element for empty list" in {
    val list = Nil
    P21.insertAt(100, 0, list) shouldBe List(100)
  }

  it should "insert element at the beginning of the list" in {
    val list = List(1, 2, 3)
    P21.insertAt(0, 0, list) shouldBe List(0, 1, 2, 3)
  }
}
