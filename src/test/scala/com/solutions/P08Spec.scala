package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P08Spec extends AnyFlatSpec with Matchers {
  "Compress operation" should "remove consecutive duplicates" in {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    P08.compress(list) shouldBe List('a, 'b, 'c, 'a, 'd, 'e)
  }

  it should "return Nil for empty list" in {
    val list = Nil
    P08.compress(list) shouldBe Nil
  }

  it should "return single element list for singleton list" in {
    val list = List(2)
    P08.compress(list) shouldBe List(2)
  }

  it should "return same list if it contains no consecutive duplicates" in {
    val list = List(1, 2, 1, 3, 2)
    P08.compress(list) shouldBe List(1, 2, 1, 3, 2)
  }
}
