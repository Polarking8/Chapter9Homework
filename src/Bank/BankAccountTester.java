package Bank;

import java.util.Scanner;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount basicAccount = new BasicAccount("savings", 1000);
        System.out.println("You have " + basicAccount.getBalance() + " dollars in your account available. \n What would you like to do?");
        System.out.println("Press 1 to deposit");
        System.out.println("Press 2 to withdraw");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        System.out.println("How much?");
        double amount = in.nextDouble();
        switch(choice){
            case 1:
                basicAccount.deposit(amount);
                break;
            case 2:
                basicAccount.withdraw(amount);
                break;
            default:
                System.out.println("That is an invalid choice - Goodbye");
                System.exit(0);

        }
        System.out.println("Your new balance is: "+ basicAccount.getBalance());
    }
}
