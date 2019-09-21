public abstract class Sweet {
    String name;
    private double weight;
    private double price;


    public Sweet() {

    }

    public Sweet(double weight, double price) throws IncorrectNumberException{
        if (weight<0 || price<0) {
            throw new IncorrectNumberException();
        }
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }
}
