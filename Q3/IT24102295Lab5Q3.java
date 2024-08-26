import java.util.Scanner;

public class IT24102295Lab5Q3 {
    static final int ROOM_CHARGE = 48000;
    static final int NO_DISCOUNT = 0;
    static final int DISCOUNT_3_TO_4_DAYS = 10;
    static final int DISCOUNT_5_OR_MORE_DAYS = 20;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Start Date (1-31): ");
        int startDate = input.nextInt();
        System.out.print("Enter End Date (1-31): ");
        int endDate = input.nextInt();

        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Days must be between 1 and 31");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start Date must be less than End Date");
            return;
        }

        int numberOfDaysReserved = endDate - startDate;

        int discountRate = NO_DISCOUNT;
        if (numberOfDaysReserved >= 3 && numberOfDaysReserved < 5) {
            discountRate = DISCOUNT_3_TO_4_DAYS;
        } else if (numberOfDaysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        double totalAmount = numberOfDaysReserved * ROOM_CHARGE * (1 - discountRate / 100.0);

        // Output the results
        System.out.println("\nRoom Charge Per Day: Rs. " + ROOM_CHARGE + "/=");
        System.out.println("Number of Days Reserved: " + numberOfDaysReserved);
        System.out.println("Total Amount to be Paid: " + totalAmount);
    }
}