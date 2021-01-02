package com.solutions

//  P06 (*) Find out whether a list is a palindrome.
//    Example:
//    scala> isPalindrome(List(1, 2, 3, 2, 1))
//    res0: Boolean = true

object P06 {
  def isPalindrome[A](as: List[A]): Boolean = isPalindromeRecursive(as)

  def isPalindromeRecursive[A](as: List[A]): Boolean = {
    def reverseR(rs: List[A], cs: List[A]): Boolean = cs match {
      case Nil => rs == as
      case h :: tail => reverseR(h :: rs, tail)
    }
    reverseR(List[A](), as)
  }

  def isPalindromeBuiltIn[A](as: List[A]): Boolean = as == as.reverse
}
