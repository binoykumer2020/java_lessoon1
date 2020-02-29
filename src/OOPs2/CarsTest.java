package OOPs2;

public class CarsTest {
    public static void main(String[] args) {

        BMWCars bmw1 = new BMWCars();
        bmw1.carsModel = "BMW CE101";
        bmw1.carsSeries = "2019";
        bmw1.carsColour = "Jet black";
        bmw1.carsPrice = 12340.00;
        bmw1.carsMade = "Germany";
     //   bmw1.displayInformation();

        AudiCars audi1 = new AudiCars();
        audi1.carsModel = "AUDI AE10100";
      //  audi1.carsSeries = "2019";
        audi1.carsColour = "Red";
        audi1.carsPrice = 72340.00;
        audi1.carsMade = "Germany";
        audi1.carsMode = "Automatic";
        audi1.displayInformation();
    }
}
