import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String inputString = scanner.next();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(inputString.substring(start, end + 1));
    }
}