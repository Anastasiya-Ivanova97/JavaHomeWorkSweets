

public class Jellybean extends Sweet {
    private String colour;

    public Jellybean(double weight, double price) throws IncorrectNumberException {
        super(weight, price);
        name = "Jellybean";
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String color) {
        this.colour = color;
    }
}
