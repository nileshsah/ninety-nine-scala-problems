package com.solutions

//  P16 (**) Drop every Nth element from a list.
//    Example:
//    scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//    res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)

object P16 {
  def drop[A](n: Int, as: List[A]): List[A] = dropWithZip(n, as)

  def dropRecursive[A](n: Int, as: List[A]): List[A] = {
    def dropR(index: Int, n: Int, as: List[A]): List[A] = as match {
      case Nil => Nil
      case h :: tail => if (index % n == 0) dropR(index + 1, n, tail)
      else h :: dropR(index + 1, n, tail)
    }
    dropR(1, n, as)
  }

  def dropWithZip[A](n: Int, as: List[A]): List[A] =
    as.zipWithIndex filter { e => (e._2 + 1) % n  != 0 } map { _._1 }
}
