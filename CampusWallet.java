package CampusWallet;

/**
 *
 * @author ELORCHA_CPE113
 */
public class CampusWallet {

    private String owner;
    private int balance;

    public CampusWallet(String owner, int balance) {
        this.owner = owner;

        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    //
    public CampusWallet(String owner) {
        this(owner, 0);
    }
    
    //deposit credits
    boolean deposit (int amount){
        
        if(amount <= 0){
            return false;
        }
        
        this.balance +=amount;
        return true;
    }
    
    //transfer credits to another wallet
    boolean transferTo (CampusWallet recipient, int amount){
        
        //validate recipient and transfer amount
        if(recipient == null || recipient == this || amount <= 0 || amount > this.balance){
            return false;
        }
        
        //deduct credits from sender
        this.balance -= amount;
        
        //add credits to recipient
        recipient.balance +=amount;
        
        return true;
    }
    
    // get balance
    int getBalance(){
        return this.balance;
    }
    
    // get owner
    public String getOwner(){
        return this.owner;
    }

}

