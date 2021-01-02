package com.solutions

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class P06Spec extends AnyFlatSpec with Matchers {
  "isPalindrome operation" should "return true for a palindromic list" in {
    val list = List(1, 2, 3, 2, 1)
    P06.isPalindrome(list) shouldBe true
  }

  it should "return false for a non-palindromic list" in {
    val list = List(1, 1, 2, 3, 2, 2)
    P06.isPalindrome(list) shouldBe false
  }

  it should "return true for empty list" in {
    val list = Nil
    P06.isPalindrome(list) shouldBe true
  }

  it should "return true for singleton list" in {
    val list = List(1)
    P06.isPalindrome(list) shouldBe true
  }
}
