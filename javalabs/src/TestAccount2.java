
public class TestAccount2 {
    public static void main(String[] args) {
        Account[] myAccounts = new Account[5];

        double[] balances = {50,78,9654,45,3258};
        String[] names = {"Monday","Tuesday","Wednesday","Thursday","Friday"};

        for(int i=0;i<myAccounts.length;i++) {
            myAccounts[i] = new Account(balances[i], names[i]);
            System.out.println("Account name " + myAccounts[i].getName() + " has a balance of £" + myAccounts[i].getBalance());
            myAccounts[i].addInterest();
            System.out.println("The account balance is now £" + myAccounts[i].getBalance() + "\n");
        }

    }
}


