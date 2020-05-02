package OOPs2;

// Super keyword is used to refer super class objects such instance variable, overridden method and constructor

public class AudiCars extends Cars {

    String carsMode;

    AudiCars(String carsModel, double carsPrice, String carsColour, String carsMade, String carsMode) {
        super(carsModel, carsPrice, carsColour, carsMade);

        this.carsModel = carsModel;
        this.carsPrice = carsPrice;
        this.carsColour = carsColour;
        this.carsMade = carsMade;
        this.carsMode = carsMode;
    }

    @Override
    void displayInformation() { // child methods override parent's method
        super.displayInformation();
        System.out.println( " Cars Mode is " + carsMode);


    }
}