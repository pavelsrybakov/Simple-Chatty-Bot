import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int checkingNumber = 20;
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();

        System.out.println(int1 + int2 == checkingNumber || int1 + int3 == checkingNumber || int2 + int3 == checkingNumber);
    }
}