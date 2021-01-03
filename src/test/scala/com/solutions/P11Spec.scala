package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P11Spec extends AnyFlatSpec with Matchers {
  "Encode operation" should "encode consecutive duplicates" in {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    P11.encodeModified(list) shouldBe List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  }

  it should "return Nil for empty list" in {
    val list = Nil
    P11.encodeModified(list) shouldBe Nil
  }

  it should "return single list element list for singleton list" in {
    val list = List(2)
    P11.encodeModified(list) shouldBe List(2)
  }

  it should "return list of same elements if it contains no consecutive duplicates" in {
    val list = List(1, 2, 1, 1)
    P11.encodeModified(list) shouldBe List(1, 2, (2, 1))
  }
}
