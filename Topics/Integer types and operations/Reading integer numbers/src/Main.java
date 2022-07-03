import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int numberOfIntegers = 4;
        int[] integers = new int[numberOfIntegers];
        for (int i = 0; i < numberOfIntegers; i++) {
            integers[i] = scanner.nextInt();
        }
        for (int i = 0; i < numberOfIntegers; i++) {
            System.out.println(integers[i]);
        }
    }
}