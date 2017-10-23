import org.scalatest.FunSuite

class ShoppingCartTest extends FunSuite {


  /**
    * TDD test for creating checkout.
    */
  test("testShoppingCart") {

    val sC = new ShoppingCart

    val list = List[Fruit](Apple, Apple, Apple, Apple, Apple)

    assert(sC.checkOut(list) == 5 * 0.60)


  }

}
