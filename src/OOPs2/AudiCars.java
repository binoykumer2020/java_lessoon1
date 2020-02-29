package OOPs2;

// Super keyword is used to refer super class objects such instance variable, overridden method and constructor

public class AudiCars extends Cars {

    String carsMode;

    @Override
    void displayInformation() { // child methods override parent's method
        super.displayInformation();
        System.out.println( " Cars Mode is " + carsMode);


    }
}