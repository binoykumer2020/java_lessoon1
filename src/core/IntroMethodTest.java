package core;

import core.IntroMethod.GroceryShop;

public class IntroMethodTest {

    public static void main(String[] args) {

       // IntroMethod.GroceryShop ob1; object declaration
      //  ob1 = new GroceryShop( ); and object creation

        GroceryShop ob1 = new GroceryShop();
        ob1.setAllProductInfo("Sony VAIO", 1000.99, "AV-1000");
        ob1.displayInformation();

        GroceryShop ob2 = new GroceryShop();
        ob2.productId = "AV1002";
        ob2.productName = "Apple";
        ob2.productPrice = 1799.90;

        ob2.displayInformation();




    }
}
