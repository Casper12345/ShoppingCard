package NaiveSolution


/**
  * Algebraic Data Type
  * Sum Type Pattern
  */
sealed trait Fruit {
  val price: Double
}

case class Apple() extends Fruit {
  override val price: Double = 0.60
}

case class Orange() extends Fruit {
  override val price: Double = 0.25
}








