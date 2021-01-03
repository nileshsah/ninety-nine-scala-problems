package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P12Spec extends AnyFlatSpec with Matchers {
  "Decode operation" should "expand repeating elements to list" in {
    val list = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
    P12.decode(list) shouldBe List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  }

  it should "return Nil for empty list" in {
    val list = Nil
    P12.decode(list) shouldBe Nil
  }

  it should "return single list element list for singleton list" in {
    val list = List((1, 2))
    P12.decode(list) shouldBe List(2)
  }

  it should "return list of same elements if it contains no consecutive duplicates" in {
    val list = List((1, 1), (1, 2), (2, 1))
    P12.decode(list) shouldBe List(1, 2, 1, 1)
  }
}
