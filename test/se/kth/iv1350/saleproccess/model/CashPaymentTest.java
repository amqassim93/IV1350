package se.kth.iv1350.saleproccess.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashPaymentTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void calculateTotalCost() {
        Amount theAmt = new Amount(500);
        Sale sale = null;
        CashPayment instance = new CashPayment(theAmt);
        instance.calculateTotalCost(sale);
        Amount expResult = null;
        Amount result = instance.calculateTotalCost(sale);
        assertEquals(expResult,result);


}}