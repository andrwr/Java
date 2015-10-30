
public class Accounts {

    public static void main(String[] args) {
        // Code in Account.Java should not be touched!
        // write your code here
        
        Account accountMatt = new Account("Matt's account", 1000.0);
        Account accountMy = new Account("My account", 0);
        accountMatt.withdrawal(100.0);
        accountMy.deposit(100.0);
        
        System.out.println(accountMatt);
        System.out.println(accountMy);
    }

}
