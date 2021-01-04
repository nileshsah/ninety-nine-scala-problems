package com.solutions

//  P22 (*) Create a list containing all integers within a given range.
//    Example:
//    scala> range(4, 9)
//    res0: List[Int] = List(4, 5, 6, 7, 8, 9)

object P22 {
  def range(start: Int, end: Int): List[Int] = rangeWithUnfold(start, end)

  def rangeRecursive(start: Int, end: Int): List[Int] =
    if (start > end) Nil else start :: range(start + 1, end)

  def unfoldLeft[A, B](s: B)(f: B => Option[(A, B)]): List[A] = f(s) match {
    case None => Nil
    case Some((a, b)) => unfoldLeft(b)(f) ::: List(a)
  }

  def rangeWithUnfold(start: Int, end: Int): List[Int] = unfoldLeft(end) {
    e => if (e < start) Option.empty else Option((e, e - 1))
  }
}
