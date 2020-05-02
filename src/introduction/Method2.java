package introduction;

public class Method2 {

        //public  class ITShop {  // why did you create another class here where you have already Method2

            String productName;
            double productPrice;
            String productId;
            double productsalePrice;

            void setAllProductInfo(String n, double p, String id, double s) { // And what's value you can get from this method creation
                productName = n;
                productPrice = p;
                productId = id;
                productsalePrice = s;

                // or what you can do
                System.out.println(" Product name : " + n);
                System.out.println(" Product price : " +p );
                System.out.println(" Product ID : " + id);
                System.out.println(" Product Sale Price : " + s);

            }
                // then you dont need this below method
                /*  void displayInformation() {

                System.out.println(" Product name : " + productName);
                System.out.println(" Product price : " + productPrice);
                System.out.println(" Product ID : " + productId);
                System.out.println(" Product Sale Price : " + productsalePrice);
                System.out.println(" ");
                }

               */
               // this is class where all the logic

        public static void main(String[] args) {

            Method2 ob1 = new Method2();
            ob1.setAllProductInfo("Apple", 100.89, "ABC123", 90.89);

            // how come you display the info where you dont have any print info


          /*  Method2 ob2 = new Method2();
            ob2.productId = "sm2012";
            ob2.productName = "Samsung";
            ob2.productPrice = 399.99;
            ob2.productsalePrice = 299.99;
            ob2.displayInformation();
           */
        }

    }

