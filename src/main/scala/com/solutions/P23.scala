package com.solutions

//  P23 (**) Extract a given number of randomly selected elements from a list.
//    Example:
//    scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
//    res0: List[Symbol] = List('e, 'd, 'a)
//    Hint: Use the solution to problem P20

import P20.removeAt

import scala.util.Random

object P23 {
  val randInt: Random = new Random(42)

  def randomSelect[A](total: Int, as: List[A]): List[A] =
    if (total <= 0 || as.isEmpty) Nil
    else removeAt(randInt.nextInt(as.length), as) match {
      case (cs, Some(e)) => e :: randomSelect(total - 1, cs)
    }
}
