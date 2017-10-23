sealed trait Fruit {
  val price: Double
}

case object Apple extends Fruit {
  override val price: Double = 0.60
}

case object Orange extends Fruit {
  override val price: Double = 0.25
}






