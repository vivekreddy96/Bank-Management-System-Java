import java.util.ArrayList;

class Bank {

    ArrayList<BankAccount> accounts = new ArrayList<>();

    // Add Account
    void addAccount(BankAccount account) {

        accounts.add(account);
        System.out.println("Account Created Successfully!");
    }

    // Find Account
    BankAccount findAccount(int accountNumber) {

        for (BankAccount account : accounts) {

            if (account.accountNumber == accountNumber) {
                return account;
            }
        }

        return null;
    }
}