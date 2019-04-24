package se.rosa.sortingArray;


import se.rosa.sortingArray.repository.NumberRepository;

public class Main {

    public static void main(String[] args) {

        NumberRepository repository = new NumberRepository(5);
        repository.sortArray();
        repository.printNumbers();

        NumberRepository repository2 = new NumberRepository(5);
        repository.mergeArray(repository2.getNumbers());
        repository2.sortArray();
        repository2.printNumbers();
        repository.sortArray();
        repository.printNumbers();

    }
}
