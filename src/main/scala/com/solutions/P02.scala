package com.solutions

// P02 (*) Find the last but one element of a list.
//     Example:
//     scala> penultimate(List(1, 1, 2, 3, 5, 8))
//     res0: Int = 5

object P02 {
  def penultimate[A](as: List[A]): Option[A] = as match {
    case h :: _ :: Nil => Option(h)
    case _ :: tail => penultimate(tail)
    case _ | Nil => Option.empty
  }
}
