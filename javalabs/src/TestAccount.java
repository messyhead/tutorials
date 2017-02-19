// Chapter 6 - Intro to Objects

public class TestAccount {
    public static void main(String[] args) {
        Account myAccount = new Account();

        myAccount.setName("My lottery winnings");
        myAccount.setBalance(1000);

        System.out.println("Account '" + myAccount.getName() + "' has a balance of £" + myAccount.getBalance());

        myAccount.addInterest();
        System.out.println("The account '" + myAccount.getName() + "' now has a balance of £" + myAccount.getBalance());

        // Chapter 7 - Working with arrays
        Account[] arrayOfAccounts = new Account[5];

        double[] balances = {4589, 659, 1525, 54226, 125};
        String[] names = {"Swiss", "Caymen", "Cuba", "Bahamas", "Monaco"};

        for (int i = 0; i < arrayOfAccounts.length; i++) {

            arrayOfAccounts[i] = new Account();
            arrayOfAccounts[i].setName(names[i]);
            arrayOfAccounts[i].setBalance(balances[i]);
            System.out.println("Account name: " + arrayOfAccounts[i].getName() + " has a balance of £ " + arrayOfAccounts[i].getBalance());
            arrayOfAccounts[i].addInterest();
            System.out.println("The new balance is now £ " + arrayOfAccounts[i].getBalance() + "\n");
        }
    }
}
