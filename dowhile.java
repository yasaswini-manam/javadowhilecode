import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Say Hello");
            System.out.println("2. Print Numbers");
            System.out.println("3. Exit");

            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.println("Hello");
                    break;

                case 2:
                    for(int i = 1; i <= 5; i++) {
                        System.out.println(i);
                    }
                    break;

                case 3:
                    System.out.println("Program Stopped");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice != 3);

    }
}