public class Candy extends Sweet {
    private int size;

    public Candy(double weight, double price) throws IncorrectNumberException {
        super(weight, price);
        name = "Candy";
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
