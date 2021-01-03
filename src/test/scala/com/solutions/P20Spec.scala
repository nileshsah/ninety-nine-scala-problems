package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P20Spec extends AnyFlatSpec with Matchers {
  "Remove At operation" should "remove the element at specified position" in {
    val list = List('a, 'b, 'c, 'd)
    P20.removeAt(1, list) shouldBe (List('a, 'c, 'd), Option('b))
  }

  it should "return empty option for invalid index" in {
    val list = List('a, 'b, 'c, 'd)
    P20.removeAt(-2, list) shouldBe (List('a, 'b, 'c, 'd), Option.empty)
  }

  it should "return Nil for empty list" in {
    val list = Nil
    P20.removeAt(0, list) shouldBe (Nil, Option.empty)
  }

  it should "return empty option when index out of bound" in {
    val list = List(1, 2, 3)
    P20.removeAt(3, list) shouldBe (List(1, 2, 3), Option.empty)
  }

  it should "return list with first element removed" in {
    val list = List(1, 2, 3, 4)
    P20.removeAt(0, list) shouldBe (List(2, 3, 4), Option(1))
  }
}
