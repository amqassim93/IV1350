package se.kth.iv1350.saleproccess.model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import se.kth.iv1350.saleproccess.integration.ItemRegister;

import static org.junit.Assert.*;

public class ItemNotFoundExceptionTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testNotExistItem(){
        ItemRegister itemRegister = new ItemRegister();
        Item notExist = new Item("vattenmelon", 9,new Amount(50),1.20);

        try{
            itemRegister.findItemById(notExist.itemId);
            fail("could enter not existed item.");
        }catch (ItemNotFoundException ex){
            assertTrue("wrong exception messege, does not contain the specified item:"
                    +ex.getMessage(),ex.getMessage().equals(notExist.getItemId()));

        } catch (DataBaseFailurException e) {
            e.printStackTrace();
        }
    }
}