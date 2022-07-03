import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int newNumber = number % 10 * 100 + number % 100 / 10 * 10 + number / 100;
        System.out.println(newNumber);
    }
}
