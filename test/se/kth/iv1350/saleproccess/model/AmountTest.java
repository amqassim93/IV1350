package se.kth.iv1350.saleproccess.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AmountTest {
    private Amount noamt;
    private Amount amtWithfive;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void testMulti() {
        double firstAmt = 3;
        double secondAmt = 4 ;
        Amount firstAmount = new Amount(firstAmt);
        Amount secondAmount = new Amount(secondAmt);
        Amount expResult = new Amount(firstAmt * secondAmt);
        Amount result = firstAmount.multi(secondAmount);
        assertEquals(" wrong multiplation result ",expResult,result);
    }

    @Test
    public void testMultiNegResult() {
        double firstAmt = 3;
        double secondAmt = -4 ;
        Amount firstAmount = new Amount(firstAmt);
        Amount secondAmount = new Amount(secondAmt);
        Amount expResult = new Amount(firstAmt * secondAmt);
        Amount result = firstAmount.multi(secondAmount);
        assertEquals(" wrong multiplation result ",expResult,result);
    }


    @Test
    public void testMultiZeroResult() {
        double firstAmt = 0;
        double secondAmt = 4 ;
        Amount firstAmount = new Amount(firstAmt);
        Amount secondAmount = new Amount(secondAmt);
        Amount expResult = new Amount(firstAmt * secondAmt);
        Amount result = firstAmount.multi(secondAmount);
        assertEquals(" wrong multiplation result ",expResult,result);
    }

    @Test
    public void testPlusPosResult() {
        double firstAmt = 4;
        double secondAmt = 5;
        Amount firstAmount = new Amount(firstAmt);
        Amount secondAmount = new Amount(secondAmt);
        Amount expResult = new Amount(firstAmt+secondAmt);
        Amount result = firstAmount.plus(secondAmount);
        assertEquals("wrong addition result ",expResult,result);
    }

    @Test
    public void testPlusZeroResult() {
        double firstAmt = 4;
        double secondAmt = -4;
        Amount firstAmount = new Amount(firstAmt);
        Amount secondAmount = new Amount(secondAmt);
        Amount expResult = new Amount(firstAmt+secondAmt);
        Amount result = firstAmount.plus(secondAmount);
        assertEquals("wrong addition result ",expResult,result);
    }

    @Test
    public void testPlusNegResult() {
        double firstAmt = -4;
        double secondAmt = -5;
        Amount firstAmount = new Amount(firstAmt);
        Amount secondAmount = new Amount(secondAmt);
        Amount expResult = new Amount(firstAmt+secondAmt);
        Amount result = firstAmount.plus(secondAmount);
        assertEquals("wrong addition result ",expResult,result);
    }

    @Test
    public void testMinus() {
        double firstAmt= 20;
        double secondAmt = 9;
        Amount firstAmount = new Amount(firstAmt);
        Amount secondAmount = new Amount(secondAmt);
        Amount expResult = new Amount(firstAmt-secondAmt);
        Amount result = firstAmount.minus(secondAmount);
        assertEquals("wrong subtraction result",expResult,result);
    }

    @Test
    public void testMinusNegResult() {
        double firstAmt= 9;
        double secondAmt = 20;
        Amount firstAmount = new Amount(firstAmt);
        Amount secondAmount = new Amount(secondAmt);
        Amount expResult = new Amount(firstAmt-secondAmt);
        Amount result = firstAmount.minus(secondAmount);
        assertEquals("wrong subtraction result",expResult,result);
    }

    @Test
    public void testMinusZeroResult() {
        double firstAmt= -9;
        double secondAmt = -9;
        Amount firstAmount = new Amount(firstAmt);
        Amount secondAmount = new Amount(secondAmt);
        Amount expResult = new Amount(firstAmt-secondAmt);
        Amount result = firstAmount.minus(secondAmount);
        assertEquals("wrong subtraction result",expResult,result);
    }

}