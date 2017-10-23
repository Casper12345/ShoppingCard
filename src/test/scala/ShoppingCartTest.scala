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

  /**
    * Second TDD test for creating checkout.
    */
  test("testShoppingCart2") {

    val sC = new ShoppingCart

    val list = List[Fruit](Orange, Orange, Orange, Orange, Orange)

    assert(sC.checkOut(list) == 5 * 0.25)


  }

  /**
    * Third TDD test for creating checkout.
    */
  test("testShoppingCart3") {

    val sC = new ShoppingCart

    val list = List[Fruit](Apple, Apple, Orange, Apple)

    assert(sC.checkOut(list) == (3 * 0.60) + (1 * 0.25))


  }

}
