package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P15Spec extends AnyFlatSpec with Matchers {
  "Duplicate N operation" should "repeat every element N-times in the list" in {
    val list = List('a, 'b, 'c, 'c, 'd)
    P15.duplicateN(3, list) shouldBe List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  }

  it should "return Nil for empty list" in {
    val list = Nil
    P15.duplicateN(3, list) shouldBe Nil
  }

  it should "return single-item list for singleton list" in {
    val list = List(3)
    P15.duplicateN(1, list) shouldBe List(3)
  }
}
