package se.kth.iv1350.saleproccess.model;

import java.util.ArrayList;

public class Display implements Subject {
    private ArrayList <TotalObserver> totalObservers;
    private Amount runningtotal = new Amount(0);

    public Display(){
        totalObservers = new ArrayList<TotalObserver>();
    }

    @Override
    public void regis(TotalObserver newdisplay) {
        totalObservers.add(newdisplay);
    }

    @Override
    public void notifyObserver() {
        for(TotalObserver totalObserver : totalObservers){
            totalObserver.update(runningtotal);
        }
    }

    @Override
    public void addNewPrice(Amount newamt) {
        runningtotal= runningtotal.plus(newamt);
        notifyObserver();
    }

    public void resetprice (){
        runningtotal =new Amount (0);
    }
}
