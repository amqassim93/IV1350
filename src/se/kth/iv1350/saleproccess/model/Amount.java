package se.kth.iv1350.saleproccess.model;

public class Amount {
    private double amount ;

    /**instance representing Amount 0 */
    public Amount(){
        this(0.0);
    }


    /**instance representing a specified amount  */

    public Amount(double amount){
        this.amount = amount;
    }

    public Amount multi(Amount otheramt){
        return new Amount(amount * otheramt.amount);
    }

    public Amount plus(Amount otheramt){
        return new Amount(otheramt.amount + this.amount);
    }

    public double getAmount(){
        return this.amount;
    }

    public Amount minus(Amount otheramt){
        return new Amount(amount - otheramt.amount);
    }

    public void setAmount(double amount){
        this.amount = amount;
    }

    public String toString(){
        StringBuilder amount = new StringBuilder();
        amount.append(getAmount());
        return amount.toString();
    }

}
