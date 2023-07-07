package module_2.l_5.fruits;

public class Bucket<T> { //T - type   K - ket V - value
    private static int counter = 0;
    public T[] items = (T[]) new Object[10];

    public void put(T item) {
        if (counter < 10)
            items[counter++] = item;
        else
            System.out.println("Bucket is full");
    }

    public void showItems() {
        for (int i = 0; i < counter; i++)
            System.out.println(items[i]);
    }
}
