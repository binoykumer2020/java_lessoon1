package OOPs2;

// Overriding
// we can't override static method as static related with Class not Object and also final keyword as it is not modifiable
// Java main method can't be override

public class Cars {
    String carsModel;
    double carsPrice;
    String carsColour;
    String carsMade;

    void displayInformation ( ){
        System.out.println(" Cars model Name :" +carsModel);
        System.out.println(" Cars Price :" + carsPrice);
        System.out.println(" Cars Colour design : "+ carsColour);
        System.out.println(" Cards made in from : "+carsMade);
    }


}
