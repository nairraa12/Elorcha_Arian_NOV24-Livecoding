package CampusWallet;

/**
 *
 * @author ELORCHA_CPE113
 */
public class Main_campuswallet {

    public static void main(String[] args) {

        CampusWallet aly = new CampusWallet("Aly", 100);
        CampusWallet ben = new CampusWallet("Ben");

        // Test 1: Starting balances
        System.out.println("Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Test 2: Aly transfers 35 credits to Ben
        boolean transfer1 = aly.transferTo(ben, 35);

        System.out.println(transfer1 + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Test 3: Aly tries to transfer 70 credits to Ben
        boolean transfer2 = aly.transferTo(ben, 70);

        System.out.println(transfer2 + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Test 4: Aly tries to transfer 10 credits to herself
        boolean transfer3 = aly.transferTo(aly, 10);

        System.out.println(transfer3 + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Test 5: Ben deposits 15 credits
        boolean deposit1 = ben.deposit(15);

        System.out.println(deposit1 + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Test 6: Aly transfers all remaining 65 credits to Ben
        boolean transfer4 = aly.transferTo(ben, 65);

        System.out.println(transfer4 + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Additional Test 1: Zero-credit transfer
        boolean transfer5 = aly.transferTo(ben, 0);

        System.out.println("Zero-credit transfer: " + transfer5 + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

        // Additional Test 2: Transfer to null
        boolean transfer6 = aly.transferTo(null, 10);

        System.out.println("Transfer to null: " + transfer6 + "; Aly: " + aly.getBalance() + ", Ben: " + ben.getBalance());

    }
}
