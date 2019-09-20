import java.util.Scanner;

public class xyzhospital {
    public static void main(String[] args) {
    Scanner userInputScanner = new Scanner(System.in);
    System.out.println("Enter first name: ");
    String userInputName = userInputScanner.nextLine();
    System.out.println("Enter last name: ");
    String userInputLast = userInputScanner.nextLine();
    System.out.println("Enter Address Line 1: ");
    String userInputAddress1 = userInputScanner.nextLine();
    System.out.println("Enter Address Line 2: ");
    String userInputAddress2 = userInputScanner.nextLine();
    System.out.println("City: ");
    String userInputCity = userInputScanner.nextLine();
    System.out.println("State:");
    String userInputState = userInputScanner.nextLine();
    System.out.println("Zip Code: ");
    String userInputZip = userInputScanner.nextLine();
    System.out.println("Amount owed: ");
    String userInputOwed = userInputScanner.nextLine();
    System.out.println("Payment Amount: ");
    String userInputPayAmt = userInputScanner.nextLine();
    System.out.println("Payment Date: ");
    String userInputPayDate = userInputScanner.nextLine();
    System.out.println("First name: " + userInputName);
    System.out.println("Last name: " + userInputLast);
    System.out.println("Address Line 1: " + userInputAddress1);
    System.out.println("Address Line 2: " +userInputAddress2);
    System.out.println("City: " + userInputCity);
    System.out.println("State: " + userInputState);
    System.out.println("Zip Code: " + userInputZip);
    System.out.println("Amount Owed: " + userInputOwed);
    System.out.println("Payment Amount: " + userInputPayAmt);
    System.out.println("Payment Date: " + userInputPayDate);






    }
}
