package se.kth.iv1350.saleproccess.model;

public interface Subject {
    public void regis(TotalObserver display);
    public void notifyObserver();
    public void addNewPrice(Amount amt);
}
