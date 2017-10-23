package FullyFunctionalSolution


/**
  * Algebraic Data Type
  * Sum Type Pattern
  */
sealed trait Fruit {
  def price: Double = this match {
    case Apple => 0.60
    case Orange => 0.25
  }

  def discount: Int => Double = this match {
    case Apple => apples: Int =>
      if (apples % 2 == 0) (apples / 2) * Apple.price
      else (apples / 2 + 1) * Apple.price
    case Orange => oranges: Int => ((oranges / 3 * 2) + (oranges % 3)) * Orange.price
  }

}

case object Apple extends Fruit

case object Orange extends Fruit








