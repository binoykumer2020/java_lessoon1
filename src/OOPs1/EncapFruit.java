package OOPs1;

class EncapFruit {

    String fruitName ;
    private double fruitPrice;

    public double getFruitPrice() {
        return fruitPrice;
    }

    public void setFruitPrice(double fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    void display ( ){
        System.out.println(" Fruit names : "+fruitName);
        System.out.println(" Fruit price " +fruitPrice);
    }
}
