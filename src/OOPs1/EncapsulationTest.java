package OOPs1;

public class EncapsulationTest {

    public static void main(String[] args) {

        Encapsulation mango = new Encapsulation();

        mango.setFruitName("Chaunsa");
        mango.setFruitExport("India");
        mango.setFruitPrice(1000);

        System.out.println(mango.getFruitName());
        System.out.println(mango.getFruitPrice());
        System.out.println(mango.getFruitExport());

        Encapsulation berry = new Encapsulation();

        berry.setFruitName("Strawberry");
        berry.setFruitExport("Portugal");
        berry.setFruitPrice(200);

        System.out.println();
        System.out.println(berry.getFruitName());
        System.out.println(berry.getFruitExport());
        System.out.println(berry.getFruitPrice());

    }
}
