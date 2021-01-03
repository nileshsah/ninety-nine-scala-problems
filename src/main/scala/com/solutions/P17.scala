package com.solutions

//  P17 (*) Split a list into two parts.
//    The length of the first part is given. Use a Tuple for your result.
//    Example:
//
//    scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//    res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))

object P17 {
  def split[A](n: Int, as: List[A]): (List[A], List[A]) = splitTailRecursive(n, as)

  def splitWithZip[A](n: Int, as: List[A]): (List[A], List[A]) = {
    val (a, b) = as.zipWithIndex span { _._2 < n }
    (a map {_._1}, b map {_._1})
  }

  def splitTailRecursive[A](n: Int, as: List[A]): (List[A], List[A]) = {
    def splitR(n: Int, cs: List[A], rs: List[A]): (List[A], List[A]) = (n, cs) match {
      case (0, left) => (rs.reverse, left)
      case (_, Nil) => (rs.reverse, Nil)
      case (index, h :: tail)  => splitR(index - 1, tail, h :: rs)
    }
    splitR(n, as, Nil)
  }
}
