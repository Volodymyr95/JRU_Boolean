package module_2.l_10;

import java.io.File;

public class Main {
    private static int counter = 0;

    public static void main(String[] args) {
//        try {
//            r();
//        } catch (StackOverflowError e) {
//            System.out.println("Error!");
//        }
//
//        r();
//        System.out.println("After");

        int [] arr = {1,2,3,4,5};
        System.out.println(getArraySum(arr, 0));
        System.out.println(factorial(5));
        System.out.println(sum(3));
        System.out.println(fibonacci(5));
        printAllFiles(new File("one/"));
    }

    public static void r() {
        System.out.println(counter++);
        r();
    }

    public static int factorial(int n) {
        if ((n == 0) || (n == 1)) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int sum(int n) {
        if (n == 1) {
            return n;
        } else {
            return n + sum(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void printAllFiles(File dir) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                System.out.println(file);
                printAllFiles(file);
            } else {
                System.out.println(file.getAbsolutePath());
            }
        }
    }

    public static int getArraySum(int[] arr, int i) {
        if (i == arr.length - 1) {
            return arr[i];
        } else {
            return arr[i] + getArraySum(arr, i + 1);
        }
    }
}
