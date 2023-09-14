public class AccountTest {
    public static void main(String[]args) {

        // Creating two new accounts
        Account Acc1 = new Account("0", "Nathaniel", 5000);
        Account Acc2 = new Account("1", "Nathaniel", 4000);

        System.out.println("\n");
        System.out.println("Before:");

        // Printing the balance of the two accounts
        System.out.println("Account 1: " + Acc1.getBalance());
        System.out.println("Account 2: " + Acc2.getBalance());

        System.out.println("\n");
        System.out.println("Transferring money from account 1 to account 2");
        // Transfering money from account 1 to account 2
        System.out.println(Acc1.transferTo(Acc2, 1000));

        System.out.println("\n");
        System.out.println("After:");
        // Printing the balance of the two accounts
        System.out.println("Account 1: " + Acc1.getBalance());
        System.out.println("Account 2: " + Acc2.getBalance());

    }
}
