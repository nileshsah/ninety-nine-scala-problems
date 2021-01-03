package com.solutions

//  P18 (**) Extract a slice from a list.
//    Given two indices, I and K, the slice is the list containing the elements from and including
//    the Ith element up to but not including the Kth element of the original list. Start counting
//    the elements with 0.
//
// Example:
//
//    scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//    res0: List[Symbol] = List('d, 'e, 'f, 'g)

object P18 {
  def slice[A](start: Int, end: Int, as: List[A]): List[A] = sliceTailRecursive(start, end, as)

  def sliceWithBuiltin[A](start: Int, end: Int, as: List[A]): List[A] =
    as.drop(start).take(end - start)

  def sliceTailRecursive[A](start: Int, end: Int, as: List[A]): List[A] = {
    def sliceR(start: Int, end: Int, cs: List[A], rs: List[A]): List[A] = (start, end, cs) match {
      case (_, _, Nil) | (_, 0, _) => rs.reverse
      case (0, _, h :: tail) => sliceR(0, end - 1, tail, h :: rs)
      case (s, e, h :: tail)  => sliceR(s - 1, e - 1, tail, rs)
    }
    sliceR(start, end, as, Nil)
  }
}
