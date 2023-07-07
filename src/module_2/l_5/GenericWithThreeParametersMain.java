package module_2.l_5;

public class GenericWithThreeParametersMain {
    public static void main(String[] args) {
        GenericWithThreeParameters<String, Integer, Double> item = new GenericWithThreeParameters<>();
        item.put("Banana", 5, 2.5);
    }
}
