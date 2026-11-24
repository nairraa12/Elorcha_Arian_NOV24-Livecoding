package printaccount;

/**
 *
 * @author ELORCHA_CPE113
 */
public class Main_printacc {

    public static void main(String[] args) {

        // Create two independent objects
        PrintAccount mia = new PrintAccount("Mia", 10);
        PrintAccount luis = new PrintAccount("Luis", -4);

        // Test 1: Starting credits
        System.out.println("Mia: " + mia.getCredits() + ", Luis: " + luis.getCredits());

        // Test 2: Mia prints 4 pages
        boolean result1 = mia.printPages(4);

        System.out.println(result1 + "; Mia: " + mia.getCredits());

        // Test 3: Mia tries to print 7 pages
        boolean result2 = mia.printPages(7);

        System.out.println(result2 + "; Mia: " + mia.getCredits());

        // Test 4: Mia tries to add -3 credits
        boolean result3 = mia.addCredits(-3);

        System.out.println(result3 + "; Mia: " + mia.getCredits());

        // Test 5: Mia adds 4 credits
        boolean result4 = mia.addCredits(4);

        System.out.println(result4 + "; Mia: " + mia.getCredits()
                + ", Luis: " + luis.getCredits());
        
        
        
        // Activity 1 – AI Use Note

        /*Prompt Used:
        "How can I check if the number of pages is positive and if the student has enough credits before deducting credits?"
         I accepted the suggestion to check whether the page count is positive and whether the account has enough credits before deducting. I also followed the idea of returning false when the conditions are not met so the credits remain unchanged.
         I tested the program using the given test cases. I checked whether Mia's credits decreased correctly, whether invalid transactions were rejected, and whether Luis's credits remained unchanged.*/

               
    }

}
