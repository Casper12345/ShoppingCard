package FullyFunctionalSolution

class ShoppingCart2 {

  /**
    * Checkout function calculates item price.
    *
    * @param input list of Fruit
    * @return summed price as Double
    */
  def checkOut(input: List[Fruit]): Double =
    input.map(a => a.price).sum.toDouble / 100

  /**
    * Discount function.
    *
    * @param input list Fruit
    * @return discounted amount as Double
    */
  def checkOutWithDiscount(input: List[Fruit]): Double = {
    def discount(input: List[Fruit], apples: Int, oranges: Int): Double = {
      (Apple.discount(apples) + Orange.discount(oranges)).toDouble / 100
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


