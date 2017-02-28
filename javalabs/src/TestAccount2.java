
public class TestAccount2 {
    public static void main(String[] args) {
        Account[] myAccounts = new Account[5];

        double[] balances = {50,78,9654,45,3258};
        String[] names = {"Monday","Tuesday","Wednesday","Thursday","Friday"};

        Account.setInterestRate(50);

        for(int i=0;i<myAccounts.length;i++) {
            myAccounts[i] = new Account(balances[i], names[i]);
            System.out.println("Account name " + myAccounts[i].getName() + " has a balance of £" + myAccounts[i].getBalance());
            myAccounts[i].addInterest();
            System.out.println("The account balance is now £" + myAccounts[i].getBalance() + "\n");
        }

        myAccounts[0].withdraw(76);
        System.out.println("Account name " + myAccounts[0].getName() + " now has a balance of £" + myAccounts[0].getBalance());

        myAccounts[3].withdraw();
        System.out.println("Account name " + myAccounts[3].getName() + " now has a balance of £" + myAccounts[3].getBalance());
    }
}


