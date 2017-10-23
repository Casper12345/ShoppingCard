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
      val orangesCal = ((oranges / 3 * 2) + (oranges % 3)) * Orange.price
      if (apples % 2 == 0) {
        ((apples / 2) * Apple.price) + orangesCal
      } else {
        ((apples / 2 + 1) * Apple.price) + orangesCal
      }
    }

    def sum(input: List[Fruit], fruit: Fruit): Int = fruit match {
      case Apple => input match {
        case Nil => 0
        case h :: t => h match {
          case Apple => 1 + sum(t, fruit)
          case Orange => sum(t, fruit)
        }

      }
      case Orange => input match {
        case Nil => 0
        case h :: t => h match {
          case Orange => 1 + sum(t, fruit)
          case Apple => sum(t, fruit)
        }
      }
    }

    discount(input, sum(input, Apple), sum(input, Orange))
  }


}

