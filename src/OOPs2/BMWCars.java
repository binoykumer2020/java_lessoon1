package OOPs2;

public class BMWCars extends Cars {
    String carsSeries;

    @Override
    void displayInformation() { // child methods override parent's method
        System.out.println(" Cars model Name :" +carsModel);
        System.out.println(" Cars series no : "+carsSeries);
        System.out.println(" Cars Price : " +  "£ " +carsPrice);
        System.out.println(" Cars Colour design : "+ carsColour);
        System.out.println(" Cards made in from : "+carsMade);
    }
}

// Java doesn't support multiple inheritance WHY? --> Ambiguity
// Diamond problems
// resolving by interface