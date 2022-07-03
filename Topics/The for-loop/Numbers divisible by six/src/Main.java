import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int sum = 0;
        final int divider = 6;
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            if (num % divider == 0) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}