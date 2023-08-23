package module_2.l_18;


public class MazdaUtils extends CarUtils {

    @Override
    public void createCar(String carJson) {
        super.createCar(carJson);
    }

    @Deprecated()
    public void changeCarColor(String carName, String color) {
        // logic
    }

    @Logger(level = LogLevel.ERROR)
    public void changeColor() {
        System.out.println("Color Changed!");
    }

    public void checkCar(String... vins) {

    }
}
