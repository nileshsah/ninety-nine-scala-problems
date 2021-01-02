package com.solutions

//  P05 (*) Reverse a list.
//    Example:
//    scala> reverse(List(1, 1, 2, 3, 5, 8))
//    res0: List[Int] = List(8, 5, 3, 2, 1, 1)

object P05 {
  def reverse[A](as: List[A]): List[A] = reverseWithFold(as)

  def reverseRecursive[A](as: List[A]): List[A] = {
    def reverseR(rs: List[A], as: List[A]): List[A] = as match {
      case Nil => rs
      case h :: tail => reverseR(h :: rs, tail)
    }
    reverseR(List[A](), as)
  }

  def reverseWithFold[A](as: List[A]): List[A] =
    as.foldRight(List[A]()) { (left, cur) => cur ::: List(left)}
}
