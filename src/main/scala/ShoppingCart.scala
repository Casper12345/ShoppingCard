class ShoppingCart {

  /**
    * Checkout function calculates item price.
    * @param input list of Fruit
    * @return summed price as Double
    */
  def checkOut(input: List[Fruit]): Double = input.map(a => a.price).sum




}
