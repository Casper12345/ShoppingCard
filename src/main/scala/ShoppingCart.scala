class ShoppingCart {

  def checkOut(input: List[Fruit]): Double ={

    input.map(a => a.price).sum
    
  }


}
