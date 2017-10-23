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

  def discount(amount: Int): Double = this match {
    case Apple =>
      if (amount % 2 == 0) (amount / 2) * Apple.price
      else (amount / 2 + 1) * Apple.price
    case Orange => ((amount / 3 * 2) + (amount % 3)) * Orange.price
  }

}

case object Apple extends Fruit

case object Orange extends Fruit








