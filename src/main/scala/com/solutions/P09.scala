package com.solutions

//  P09 (**) Pack consecutive duplicates of list elements into sublists.
//    If a list contains repeated elements they should be placed in separate sublists.
//    Example:
//
//    scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
//    res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))

object P09 {
  def pack[A](as: List[A]): List[List[A]] = packWithSpan(as)

  def packRecursive[A](as: List[A]): List[List[A]] = {
    def packR(last: A, rep: Int, rs: List[A]): List[List[A]] = rs match {
      case Nil => List(List.fill[A](rep)(last))
      case h :: tail => if (h == last) packR(h, rep + 1, tail)
      else List.fill[A](rep)(last) :: packR(h, 1, tail)
    }

    as match {
      case Nil => Nil
      case h :: tail => packR(h, 1, tail)
    }
  }

  def packWithSpan[A](as: List[A]): List[List[A]] = as match {
    case Nil => Nil
    case cs: List[A] => {
      val (collected, nexts) = cs span { _ == cs.head }
      collected :: packWithSpan(nexts)
    }
  }
}
