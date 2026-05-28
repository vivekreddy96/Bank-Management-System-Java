import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            Bank bank = new Bank();
            
            int choice;
            
            do {
                
                System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
                
                System.out.println("1. Create Account");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Check Balance");
                System.out.println("5. View Account Details");
                System.out.println("6. Exit");
                
                System.out.print("Enter Your Choice: ");
                choice = sc.nextInt();
                
                switch (choice) {
                    
                    case 1:
                        
                        sc.nextLine();
                        
                        System.out.print("Enter Account Holder Name: ");
                        String name = sc.nextLine();
                        
                        System.out.print("Enter Account Number: ");
                        int accNo = sc.nextInt();
                        
                        System.out.print("Enter Initial Balance: ");
                        double balance = sc.nextDouble();
                        
                        BankAccount newAccount =
                                new BankAccount(name, accNo, balance);
                        
                        bank.addAccount(newAccount);
                        
                        break;
                        
                    case 2:
                        
                        System.out.print("Enter Account Number: ");
                        accNo = sc.nextInt();
                        
                        BankAccount depositAccount =
                                bank.findAccount(accNo);
                        
                        if (depositAccount != null) {
                            
                            System.out.print("Enter Deposit Amount: ");
                            double amount = sc.nextDouble();
                            
                            depositAccount.deposit(amount);
                            
                        } else {
                            
                            System.out.println("Account Not Found!");
                        }
                        
                        break;
                        
                    case 3:
                        
                        System.out.print("Enter Account Number: ");
                        accNo = sc.nextInt();
                        
                        BankAccount withdrawAccount =
                                bank.findAccount(accNo);
                        
                        if (withdrawAccount != null) {
                            
                            System.out.print("Enter Withdraw Amount: ");
                            double amount = sc.nextDouble();
                            
                            withdrawAccount.withdraw(amount);
                            
                        } else {
                            
                            System.out.println("Account Not Found!");
                        }
                        
                        break;
                        
                    case 4:
                        
                        System.out.print("Enter Account Number: ");
                        accNo = sc.nextInt();
                        
                        BankAccount balanceAccount =
                                bank.findAccount(accNo);
                        
                        if (balanceAccount != null) {
                            
                            System.out.println("Current Balance: "
                                    + balanceAccount.balance);
                            
                        } else {
                            
                            System.out.println("Account Not Found!");
                        }
                        
                        break;
                        
                    case 5:
                        
                        System.out.print("Enter Account Number: ");
                        accNo = sc.nextInt();
                        
                        BankAccount detailsAccount =
                                bank.findAccount(accNo);
                        
                        if (detailsAccount != null) {
                            
                            detailsAccount.displayAccount();
                            
                        } else {
                            
                            System.out.println("Account Not Found!");
                        }
                        
                        break;
                        
                    case 6:
                        
                        System.out.println("Thank You For Using Our Bank!");
                        break;
                        
                    default:
                        
                        System.out.println("Invalid Choice!");
                }
                
            } while (choice != 6);
        }
    }
}