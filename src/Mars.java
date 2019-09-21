public class Mars extends Sweet {
    private String chocolate;

    public Mars(double weight, double price) throws IncorrectNumberException {
        super(weight, price);
        name = "Mars";
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }
}
