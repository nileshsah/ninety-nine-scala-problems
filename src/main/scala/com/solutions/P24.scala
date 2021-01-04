package com.solutions

import scala.util.Random

//  P24 (*) Lotto: Draw N different random numbers from the set 1..M.
//    Example:
//    scala> lotto(6, 49)
//    res0: List[Int] = List(23, 1, 17, 33, 21, 37)

object P24 {
  val rand: Random = new Random(42)

  def lotto(n: Int, m: Int): List[Int] =
    if (n <= 0) Nil
    else rand.nextInt(m) + 1 :: lotto(n - 1, m)
}
