import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        int int3 = scanner.nextInt();
        boolean result1 = int1 <= int2 && int1 >= int3;
        boolean result2 = int1 >= int2 && int1 <= int3;
        System.out.println(result1 || result2);
    }
}