public class errors {
    public static void main(String[] args) {
        String[] names = {"Fudge", "forgotten", "Luna", "Nala"};

        try{
        System.out.println("My first cat's name was " + names[0] + ".");
        System.out.println("My second cat's name has been " + names[1] + ".");
        System.out.println("My third cat's name was " + names[2] + ".");
        System.out.println("My fourth cat's name was " + names[3] + ".");
        System.out.println("My fifth cat's name was " + names[4] + ".");
        }
        catch (Exception e){
            System.out.println("Error. You have attempted to print out a name that does not exist.");
            System.out.println("Arrays start at 0. Therefore the names in the array are labeled 0-3. You attempted to print out name # 4, which does not exist.");
        }
        try{
        int numbers[] = {0,3,8,12,15,21};
        int addition = numbers[2] + numbers[4];
        System.out.println(numbers[2] + " plus " + numbers[4] + " is " + addition + ".");
        int subtraction = numbers[5] - numbers[3];
        System.out.println(numbers[5] + " minus " + numbers[3] + " is " + subtraction + ".");
        int multiplication = numbers[1] * numbers[4];
        System.out.println(numbers[1] + " times " + numbers[4] + " is " + multiplication + ".");
        int division = numbers[3]/numbers[0];
        System.out.println(numbers[3] + " divided by " + numbers[0] + " is " + division + ".");
        } catch (Exception e) {
            System.out.println("Error. You tried to divide a number by 0. This cannot be done.");
        }
        finally{
            System.out.println("The computer caught your errors and kept the system from crashing.");
        }
    }
    
}
