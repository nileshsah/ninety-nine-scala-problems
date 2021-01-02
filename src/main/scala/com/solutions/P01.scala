package com.solutions

// P01 (*) Find the last element of a list.
//     Example:
//     scala> last(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 8

object P01 {
  def last[A](as: List[A]): Option[A] = as match {
    case h :: Nil => Option(h)
    case _ :: tail => last(tail)
    case _ => Option.empty
  }
}
