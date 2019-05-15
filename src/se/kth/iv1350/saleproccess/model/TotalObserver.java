package se.kth.iv1350.saleproccess.model;
/** this interface to receive the notifications about paid total.*/
public interface TotalObserver {

    /** Invoke when the total has been paid.
     * @param total the total that was paid. */

    public void update (Amount total);
}
