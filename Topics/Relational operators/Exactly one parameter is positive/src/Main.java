import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        boolean bool1 = n1 > 0 && n2 <= 0 && n3 <= 0;
        boolean bool2 = n1 <= 0 && n2 > 0 && n3 <= 0;
        boolean bool3 = n1 <= 0 && n2 <= 0 && n3 > 0;

        System.out.println(bool1 || bool2 || bool3);
    }
}