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

}

case object Apple extends Fruit
case object Orange extends Fruit










