import java.util.Scanner;

public class Atm_Machine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int user_input;
        int amount = 0;
        System.out.println("Enter your name sir");
        String name = sc.nextLine();
        System.out.println("Enter your password please");
        String password = sc.nextLine();

        do {
            System.out.println("welcome " + name + " sir");
            System.out.println("press 1 for deposit cash ");
            System.out.println("press 2 for withdraw cash ");
            System.out.println("press 3 for check your account balance ");
            System.out.println("press 4 for exit ");
             user_input = sc.nextInt();

            if (user_input == 1) {
                System.out.println("how much amount you want to deposit");
                int depositCash = sc.nextInt();

                amount = amount + depositCash;
                System.out.println("Amount deposit successfully");
            } else if (user_input == 2) {
                System.out.println("how much amount you want to withdraw");
                int withdrawCash = sc.nextInt();
                if (withdrawCash <= amount) {
                    amount = amount - withdrawCash;
                    System.out.println("amount withdraw successfully");
                } else {
                    System.out.println("sorry you have insufficient balance");
                }

            } else if (user_input == 3) {
                System.out.println("your account balance is " + amount);
            }
        }while(user_input!=4);
    }
}