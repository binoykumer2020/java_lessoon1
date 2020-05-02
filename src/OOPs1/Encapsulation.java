package OOPs1;
// There are 4 core concepts for OOPs such encapsulations, Inheritance, Abstraction, Polymorphism
// there are 4 types access modifier Public/Private/Default/Protected
// Encapsulation is a process of packaging variables and methods in a single unit/class
// Protecting data by declaring them as private; to access these we can use setters and getters

public class Encapsulation {

        private String fruitName;
        private int fruitPrice;
        private  String fruitExport;
        String country;

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getFruitPrice() {
        return fruitPrice;
    }

    public String getFruitExport() {
        return fruitExport;
    }

    public void setFruitPrice(int fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    public void setFruitExport(String fruitExport) {
        this.fruitExport = fruitExport;
    }


}
