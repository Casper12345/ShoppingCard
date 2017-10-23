
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
    * Discount function for Apple
    *
    * @param input list Apple
    * @return discounted amount
    */
  def discountApple(input: List[Apple]): Int = if (input.size % 2 == 0) input.size / 2 else input.size / 2 + 1

  /**
    * Discount function for Orange
    *
    * @param input list Orange
    * @return discounted amount
    */
  def discountOrange(input: List[Orange]): Int = (input.size / 3 * 2) + input.size % 3

  /**
    * Checkout function calculates discounted item price.
    *
    * @param input list of Fruit
    * @return summed price as Double
    */
  def checkOutWithDiscount(input: List[Fruit]): Double = {

    discountApple(input.filter(a => a.isInstanceOf[Apple])
      .map(b => b.asInstanceOf[Apple])) * Apple().price + discountOrange(input
      .filter(a => a.isInstanceOf[Orange]).map(b => b.asInstanceOf[Orange])) * Orange().price
  }
}

