package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P19Spec extends AnyFlatSpec with Matchers {
  "Rotate operation" should "rotate the list at specified position" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    P19.rotate(3, list) shouldBe List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
  }

  it should "rotate the list for negative index" in {
    val list = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)
    P19.rotate(-2, list) shouldBe List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
  }

  it should "return Nil for empty list" in {
    val list = Nil
    P19.rotate(3, list) shouldBe Nil
  }

  it should "return single-item list for singleton list" in {
    val list = List(3)
    P19.rotate(1, list) shouldBe List(3)
  }

  it should "return same list for first index as pivot" in {
    val list = List(1, 2, 3, 4)
    P19.rotate(0, list) shouldBe List(1, 2, 3, 4)
  }
}
