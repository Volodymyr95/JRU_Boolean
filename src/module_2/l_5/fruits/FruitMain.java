package module_2.l_5.fruits;

public class FruitMain {
    public static void main(String[] args) {
        Bucket<? super Fruit> appleBucket = new Bucket<>();

        appleBucket.put(new Apple("Apple1"));
        appleBucket.put(new Orange("Orange1"));
        appleBucket.showItems();

        BucketWithExtends<Fruit> bucket = new BucketWithExtends<>();
        bucket.put(new Apple("Apple1"));
        bucket.put(new Orange("Apple1"));

    }
}
// ? extend Fruit - > Fruits and under Fruit
// ? super Fruit - >  all who extends Fruit

