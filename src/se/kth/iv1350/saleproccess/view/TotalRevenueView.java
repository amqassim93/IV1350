package se.kth.iv1350.saleproccess.view;

import se.kth.iv1350.saleproccess.model.Amount;
import se.kth.iv1350.saleproccess.model.Subject;
import se.kth.iv1350.saleproccess.model.TotalObserver;

public class TotalRevenueView implements TotalObserver {
    private Amount total;
    private Subject display;

    public TotalRevenueView(Subject display){
        this.display = display;
        display.regis(this);
    }

    @Override
    public void update(Amount total) {
        this.total = total;
        System.out.println("the current total:   "+ total);
    }
}
