public class Main {
    public static void main(String[] args) throws IncorrectNumberException {
        Box box = new SmallBox();
        ((SmallBox) box).createAndSetSize(4);
        KitKat kitKat = new KitKat(50.25, 1.78);
        kitKat.setFlavour("Matcha");
        box.add(kitKat,0);
        Jellybean jellybean = new Jellybean(0.99, 2.99);
        jellybean.setColour("Red");
        box.add(jellybean,1);
        Candy candy = new Candy(0.25, 4.89);
        candy.setSize(1);
        box.add(candy,2);
        Mars mars = new Mars(30.36, 3.87);
        mars.setChocolate("White");
        box.add(mars, 3);
        box.printWeight();
        box.printTotalPrice();
        box.printAll();
        //((SmallBox) box).reduceWeight(50);
        ((SmallBox) box).reducePrice(3);
    }
}
