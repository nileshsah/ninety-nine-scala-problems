package com.solutions

//  P07 (**) Flatten a nested list structure.
//    Example:
//    scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
//    res0: List[Any] = List(1, 1, 2, 3, 5, 8)

object P07 {
  def flatten(as: List[Any]): List[Any] = flattenRecursive(as)

    def flattenRecursive(as: List[Any]): List[Any] = as match {
      case Nil => Nil
      case h :: tail => h match {
        case l: List[Any] => flattenRecursive(l) ::: flattenRecursive(tail)
        case e: Any => e :: flattenRecursive(tail)
      }
    }
}
