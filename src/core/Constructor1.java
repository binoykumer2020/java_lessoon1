package core;

public class Constructor1 {

    String shoppingCenterName;
    String location;
    double distance;

    // default constructor
    Constructor1 ( ){

    }

    Constructor1 (String name, double dis ){

        shoppingCenterName = name;
        distance = dis;

    }

    Constructor1 (String s, double d, String l ){
        shoppingCenterName = s;
        distance = d;
        location = l;


    }

    Constructor1 (String shoppingCenterName, String location, double distance){

        this. shoppingCenterName = shoppingCenterName;
        this.location = location;
        this.distance = distance;
    }

        void methodTest (String shoppingCenterName, String location){
         this.shoppingCenterName = shoppingCenterName;
         this.location = location;
            System.out.println("The shopping center name is " +shoppingCenterName + " and located in " +location );
        }

    void display( ){
        System.out.println(" Shopping center name is : " +shoppingCenterName);
        System.out.println(" Location is : " +location);
        System.out.println(" Distance from my home : " + distance +  " km"); // appending
    }
}
