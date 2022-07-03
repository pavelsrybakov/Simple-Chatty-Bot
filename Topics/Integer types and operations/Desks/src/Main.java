import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        final int groupNumber = 3;
        final int numberOfStudentsPerDesk = 2;
        int deskNumber = 0;
        for (int i = 0; i < groupNumber; i++) {
            int studentsInGroup = scanner.nextInt();
            deskNumber += studentsInGroup / numberOfStudentsPerDesk + studentsInGroup % numberOfStudentsPerDesk;
        }
        System.out.println(deskNumber);
    }
}