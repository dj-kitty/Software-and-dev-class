import java.util.Scanner;

public class RunPrograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Select a program to run:");
            System.out.println("1. Hello");
            System.out.println("2. Flow Control");
            System.out.println("3. array");
            System.out.println("4. bubbleSort");
            System.out.println("5. Horse");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Hello.main(new String[]{});       // Calls Hello
                    break;
                case 2:
                    Flow Control.main(new String[]{});    // Calls Flow Control
                    break;
                case 3:
                    array.main(new String[]{}); // Calls array
                    break;
                case 4:
                    bubbleSort.main(new String[]{});        // Calls bubbleSort
                    break;
                case 5: 
                    Horse.main(new String[]{});        // Calls Horse
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
