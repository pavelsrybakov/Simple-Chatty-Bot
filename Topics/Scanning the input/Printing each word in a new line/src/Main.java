import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        final int numberOfWords = 5;
        String[] words = new String[numberOfWords];
        for (int inputIndex = 0; inputIndex < numberOfWords; inputIndex++) {
            words[inputIndex] = scanner.next();
        }
        for (int outputIndex = 0; outputIndex < numberOfWords; outputIndex++) {
            System.out.println(words[outputIndex]);
        }
    }
}