import java.util.Scanner;

public class RunPrograms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nSelect a program to run:");
            System.out.println("1. PetClass");
            System.out.println("2. PetWrapper");
            System.out.println("3. CarComparator");
            System.out.println("4. Errors");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    petclass.main(new String[]{});       // Calls PetClass
                    break;
                case 2:
                    petWrapper.main(new String[]{});    // Calls PetWrapper
                    break;
                case 3:
                    carComparator.main(new String[]{}); // Calls CarComparator
                    break;
                case 4:
                    errors.main(new String[]{});        // Calls Errors
                    break;
                case 5:
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
