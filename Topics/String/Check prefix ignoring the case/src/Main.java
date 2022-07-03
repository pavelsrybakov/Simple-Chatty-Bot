import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String inputString = scanner.next();
        String prefix = "J";

        System.out.println(inputString.toLowerCase().startsWith(prefix.toLowerCase()));
    }
}
