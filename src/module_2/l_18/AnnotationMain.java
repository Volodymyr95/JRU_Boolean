package module_2.l_18;

import java.lang.reflect.Method;

public class AnnotationMain {
    public static void main(String[] args) throws NoSuchMethodException {
        MazdaUtils mazdaUtils = new MazdaUtils();

        Class<?> mazda = mazdaUtils.getClass();
        Method method = mazda.getMethod("changeColor");
        if (method.isAnnotationPresent(Logger.class)) {
            Logger annotation = method.getAnnotation(Logger.class);
            LogLevel level = annotation.level();

            if (level == LogLevel.INFO) {
                System.out.println("It's OK!");
            } else if (level == LogLevel.ERROR) {
                System.err.println("Error!");
            }
        }
        mazdaUtils.changeColor();
    }
}
