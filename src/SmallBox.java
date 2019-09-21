import java.util.Arrays;

public class SmallBox implements Box {

    private Sweet[] present;

    public void createAndSetSize(int number) {
        this.present = new Sweet[number];
    }

    @Override
    public Sweet[] add(Sweet sweet, int index) {
        if (index>present.length-1) {
            Sweet[] sweets = new Sweet[present.length+1];
            for (int i = 0; i <present.length ; i++) {
                if (present[i]!=null) {
                    sweets[i] = present[i];
                }
            }
            sweets[present.length+1] = sweet;
            return sweets;
        }
        this.present[index] = sweet;
        return present;
    }

    @Override
    public Sweet[] remove(int index) {
        this.present[index] = null;
        Sweet[] sweets = new Sweet[present.length-1];
        for (int i = 0; i <present.length ; i++) {
            if (present[i]!=null) {
                sweets[i] = present[i];
            }
        }
        return sweets;
    }


    @Override
    public Sweet[] removeLast() {
        return this.remove(present.length-1);
    }

    @Override
    public double printWeight() {
        double sum = 0;
        for (Sweet sweet: this.present) {
            if (sweet != null) {
                sum+=sweet.getWeight();
            }
        }
        System.out.println(sum);
        return sum;
    }

    @Override
    public double printTotalPrice() {
        double sum = 0;
        for (Sweet sweet: this.present) {
            if (sweet != null) {
                sum+=sweet.getPrice();
            }
        }
        System.out.println(sum);
        return sum;
    }

    @Override
    public String toString() {
       String s = "";
        for (Sweet sweet: present) {
            if (sweet!=null) {
                s+="Name: "+sweet.getName()+", weight: "+sweet.getWeight()+", price: "+sweet.getPrice()+", ";
                if (sweet instanceof KitKat) {
                    s+= "flavour: "+((KitKat) sweet).getFlavour()+"\n";
                } else if (sweet instanceof Jellybean) {
                    s+= "colour: "+((Jellybean) sweet).getColour()+"\n";
                } else if (sweet instanceof Candy) {
                    s+= "size: "+ ((Candy) sweet).getSize()+"\n";
                } else if (sweet instanceof Mars) {
                    s+="chocolate: "+ ((Mars) sweet).getChocolate()+"\n";
                }
            }
        }
        return "This box contains: "+ present == null ? null : "\n"+s;
    }

    @Override
    public void printAll() {
        System.out.println(this.toString());
    }

    public void reduceWeight(double weight) {
        Arrays.sort(present, (o1, o2) -> {
            if (o1 != null && o2 != null) {
                if (o1.getWeight() < o2.getWeight()) {
                    return -1;
                } else if (o1.getWeight() == o2.getWeight()) {
                    return 0;
                }
            }
            return 1;
        });
        for (int i = 0; this.printWeight()>=weight && i<present.length; i++) {
            present[i] = null;
            }
        }

    public void reducePrice(double price) {
        Arrays.sort(present, (o1, o2) -> {
            if (o1 != null && o2 != null) {
                if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else if (o1.getPrice() == o2.getPrice()) {
                    return 0;
                }
            }
            return 1;
        });
        for (int i = 0; this.printTotalPrice()>=price && i<present.length; i++) {
            present[i] = null;
        }
    }
}

