package core;

// Introduction to Methods
// Parametarised methods

public class IntroMethod {

    public static class GroceryShop {
        String productName;
        double productPrice;
        String productId;

        void setAllProductInfo (String n, double p, String id ){
                 productName = n;
                 productPrice = p;
                 productId = id;
        }
        void displayInformation ( ){

            System.out.println(" Product name : " + productName );
            System.out.println(" Product price : " +productPrice);
            System.out.println(" Product ID : " +productId);
            System.out.println(" ");
        }
    }

}
