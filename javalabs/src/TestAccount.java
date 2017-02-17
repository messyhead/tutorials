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

        double[] balances = {4589,659,1525,54226,125};
        String[] names = {"Swiss", "Caymen", "Cuba", "Bahamas", "Monaco"};
        

    }
}
