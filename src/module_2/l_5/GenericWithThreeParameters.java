package module_2.l_5;

public class GenericWithThreeParameters <T,K,V>{

    public void put(T item, K key, V value){
        System.out.println(item + " " + key + " " + value);
    }
}
