package OOPs2;

public class BMWCars extends Cars {

    String carsSeries;

    BMWCars(String carsModel, double carsPrice, String carsColour, String carsMade, String carsSeries) {
        super(carsModel, carsPrice, carsColour, carsMade);
        this.carsModel = carsModel;
        this.carsPrice = carsPrice;
        this.carsColour = carsColour;
        this.carsMade = carsMade;
        this.carsSeries = carsSeries;

    }

    @Override
     void displayInformation() { // child methods override parent's method
        super.displayInformation();
        System.out.println(" Cars series :" + carsSeries);
    }
}

// Java doesn't support multiple inheritance WHY? --> Ambiguity
// Diamond problems
// resolving by interface