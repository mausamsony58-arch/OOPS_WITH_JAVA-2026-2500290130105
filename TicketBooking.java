import java.util.*;

public class TicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("Enter passenger's age : ");
            int age = sc.nextInt();
            System.out.println("Number of seats : ");
            int seats = sc.nextInt();
            int availableSeats = 500;
            bookTicket(age, seats, availableSeats);
        } catch (AgeException e) {
            System.out.println("Error :  "+e.getMessage());
        } catch(SeatsException e){  
            System.out.println("Error : "+e.getMessage());
        } catch(InsufficientSeatsException e){
            System.out.println("Error : "+e.getMessage());
        } catch(InputMismatchException e){
            System.out.println("Please enter numbers only");
        }

    }
    static void bookTicket(int age, int seats, int availableSeats) throws AgeException,SeatsException,InsufficientSeatsException{
        if(age <= 0){
            throw new AgeException("Age must be gretaer than zero");
        }
        if(seats <= 0){
            throw new SeatsException("Seats must be greater than zero");
        }
        if(seats > availableSeats){
            throw new InsufficientSeatsException("InsufficientSeats");
        }
        System.out.println("Booking successful!");
        System.out.println("Seats booked: " + seats);
        System.out.println("Remaining seats: "+ (availableSeats - seats));
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
    
}

class SeatsException extends Exception {
    public SeatsException(String message) {
        super(message);
    }
    
}

class InsufficientSeatsException extends Exception {
    public InsufficientSeatsException(String message) {
        super(message);
    }
    
}