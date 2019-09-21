public class KitKat extends Sweet {
    private String flavour;

    public KitKat(double weight, double price) throws IncorrectNumberException {
        super(weight, price);
        name = "KitKat";
    }

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }
}
