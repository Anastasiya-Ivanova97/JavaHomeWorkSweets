public interface Box {
     Sweet[] add(Sweet sweet, int index);
     Sweet[] remove(int index);
     Sweet[] removeLast();
     double printWeight();
     double printTotalPrice();
     void printAll();
}
