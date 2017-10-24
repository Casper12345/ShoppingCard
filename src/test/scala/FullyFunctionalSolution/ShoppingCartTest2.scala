package FullyFunctionalSolution

import org.scalatest.FunSuite

class ShoppingCartTest2 extends FunSuite {


  /**
    * TDD test for creating checkout.
    */
  test("testShoppingCart") {

    val sC = new ShoppingCart2

    val list = List[Fruit](Apple, Apple, Apple, Apple, Apple)

    assert(sC.checkOut(list) == 5 * 0.60)


  }

  /**
    * Second TDD test for creating checkout.
    */
  test("testShoppingCart2") {

    val sC = new ShoppingCart2

    val list = List[Fruit](Orange, Orange, Orange, Orange, Orange)

    assert(sC.checkOut(list) == 5 * 0.25)


  }

  /**
    * Third TDD test for creating checkout.
    */
  test("testShoppingCart3") {

    val sC = new ShoppingCart2

    val list = List[Fruit](Apple, Apple, Orange, Apple)

    assert(sC.checkOut(list) == (3 * 0.60) + (1 * 0.25))


  }
  /**
    * First TDD test appleDiscount
    */
  test("testShoppingDiscountApples") {

    val sC = new ShoppingCart2

    assert(sC.checkOutWithDiscount(List[Fruit](Apple, Apple)) == 0.60)

  }

  /**
    * Second TDD test appleDiscount
    */
  test("testShoppingDiscountApples2") {

    val sC = new ShoppingCart2
    assert(sC.checkOutWithDiscount(List[Fruit](Apple)) == 0.60)

  }

  /**
    * First TDD test checkOutWithDiscount
    */
  test("testCheckOutWithDiscount") {

    val sC = new ShoppingCart2
    assert(sC.checkOutWithDiscount(List[Fruit](Orange, Orange, Orange)) == 2 * 0.25)

  }

  /**
    * Second TDD test checkOutWithDiscount
    */
  test("testCheckOutWithDiscount2") {

    val sC = new ShoppingCart2
    assert(sC.checkOutWithDiscount(List[Fruit](Orange, Orange, Orange, Apple)) == 2 * 0.25 + 1 * 0.60)

  }

  /**
    * Third TDD test checkOutWithDiscount
    */
  test("testCheckOutWithDiscount3") {

    val sC = new ShoppingCart2
    assert(sC.checkOutWithDiscount(List[Fruit](Orange, Orange, Orange, Apple, Apple)) == 2 * 0.25 + 1 * 0.60)

  }

  /**
    * Fourth TDD test checkOutWithDiscount
    */
  test("testCheckOutWithDiscount4") {

    val sC = new ShoppingCart2
    assert(sC.checkOutWithDiscount(List[Fruit](Orange, Orange, Orange, Apple, Apple, Apple)) == 2 * 0.25 + 2 * 0.60)

  }


}
