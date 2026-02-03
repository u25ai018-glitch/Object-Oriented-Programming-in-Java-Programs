import java.util.Scanner;
// Customer.java
 class Customer {
    private int accountNumber;
    private double beginningBalance;
    private double charges;
    private double credits;
    private double creditLimit;

    // Constructor
    public Customer(int accountNumber, double beginningBalance, double charges, double credits, double creditLimit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.charges = charges;
        this.credits = credits;
        this.creditLimit = creditLimit;
    }

    // Method to calculate new balance
    public double calculateNewBalance() {
        return beginningBalance + charges - credits;
    }


     // Method to display customer info
    public void displayResult() {
        double newBalance = calculateNewBalance();
        System.out.println("Account Number: " + accountNumber);
        System.out.println("New Balance: " + newBalance);

        if (calculateNewBalance()>creditLimit) {
            System.out.println("Credit limit exceeded!\n");
        } else {
            System.out.println("Credit limit not exceeded.\n");
        }
    }
}

public class CreditLimitCalculator {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter account number (or -1 to quit): ");
            int accountNumber = sc.nextInt();

            if (accountNumber == -1) {
                break; // exit loop
            }

            System.out.print("Enter balance at the beginning of the month: ");
            double beginningBalance = sc.nextDouble();

            System.out.print("Enter total of all items charged this month: ");
            double charges = sc.nextDouble();

            System.out.print("Enter total of all credits applied this month: ");
            double credits = sc.nextDouble();

            System.out.print("Enter allowed credit limit: ");
            double creditLimit = sc.nextDouble();

            // Create Customer object
            Customer customer = new Customer(accountNumber, beginningBalance, charges, credits, creditLimit);

            // Display result
            customer.displayResult();
        }

        sc.close();
    }

    
}
