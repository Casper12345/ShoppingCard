package FullyFunctionalSolution

class ShoppingCart {

  /**
    * Checkout function calculates item price.
    *
    * @param input list of Fruit
    * @return summed price as Double
    */
  def checkOut(input: List[Fruit]): Double =
    input.map(a => a.price).sum

  /**
    * Discount function.
    *
    * @param input list Fruit
    * @return discounted amount
    */
  def checkOutWithDiscount(input: List[Fruit]): Double = {
    def discount(input: List[Fruit], apples: Int, oranges: Int): Double = {
      val f = Apple.discount
      val f2 = Orange.discount
      f(apples) + f2(oranges)
    }

    def sum(input: List[Fruit], fruit: Fruit): Int = fruit match {
      case Apple => input.filter(a => a match {
        case Apple => true
        case Orange => false
      }).map(b => 1).sum
      case Orange => input.filter(a => a match {
        case Apple => false
        case Orange => true
      }).map(b => 1).sum
    }

    discount(input, sum(input, Apple), sum(input, Orange))
  }

}

