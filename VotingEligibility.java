import java.util.Scanner;

class AgeInvalidException extends Exception {
    AgeInvalidException(String message) {
        super(message);
    }
}
public class VotingEligibility {
    static void checkAge(int age) throws AgeInvalidException {
        if (age < 0) {
            throw new AgeInvalidException("Age cannot be negative");
        }
        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } 
        catch (AgeInvalidException e) {
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}