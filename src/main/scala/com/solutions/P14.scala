package com.solutions

//  P14 (*) Duplicate the elements of a list.
//    Example:
//    scala> duplicate(List('a, 'b, 'c, 'c, 'd))
//    res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)

object P14 {
  def duplicate[A](as: List[A]): List[A] = as flatMap { e => List.fill(2)(e) }
}
