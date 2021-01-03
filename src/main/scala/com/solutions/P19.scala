package com.solutions

//  P19 (**) Rotate a list N places to the left.
//    Examples:
//    scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//    res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)
//
//    scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
//    res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)

object P19 {
  def rotate[A](pivot: Int, as: List[A]): List[A] = {
    if (as.isEmpty) Nil else {
      val pt = (pivot + (math.abs(pivot) / as.length + 1) * as.length) % as.length
      val (a, b) = as.zipWithIndex span { _._2 < pt }
      (b map(_._1)) ::: (a map(_._1))
    }
  }
}
