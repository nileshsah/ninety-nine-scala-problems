package com.solutions

//  P08 (**) Eliminate consecutive duplicates of list elements.
//    If a list contains repeated elements they should be replaced with a single copy of the element.
//    The order of the elements should not be changed.
//
//    Example:
//    scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//    res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)

object P08 {
  def compress[A](as: List[A]): List[A] = compressRecursive(as)

  def compressRecursive[A](as: List[A]): List[A] = {
    def compressR(last: A, rs: List[A]): List[A] = rs match {
      case Nil => Nil
      case h :: tail => if (h == last) compressR(h, tail) else h :: compressR(h, tail)
    }
    as match {
      case Nil => Nil
      case h :: tail => h :: compressR(h, tail)
    }
  }

  def compressWithFold[A](as: List[A]): List[A] = as.foldLeft(List[A]()) {
      (cur, next) => if (cur.nonEmpty && cur.last == next) cur else cur ::: List(next)
    }
}
