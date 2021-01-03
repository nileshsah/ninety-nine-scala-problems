package com.solutions

//  P20 (*) Remove the Kth element from a list.
//    Return the list and the removed element in a Tuple. Elements are numbered from 0.
//    Example:
//
//    scala> removeAt(1, List('a, 'b, 'c, 'd))
//    res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)

object P20 {
  def removeAt[A](index: Int, as: List[A]): (List[A], Option[A]) = {
    if (index < 0 || index >= as.length) (as, Option.empty)
    else (as.take(index) ::: as.drop(index + 1), Option(as(index)))
  }
}
