package se.kth.iv1350.saleproccess.integration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import se.kth.iv1350.saleproccess.model.Sale;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


import static org.junit.Assert.*;

public class ExternalAccountingSystemTest {
    private ByteArrayOutputStream outContent;
    private PrintStream originalSysOut;

    @Before
    public void setUp() throws Exception {
        originalSysOut = System.out;
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() throws Exception {
        outContent = null;
        System.setOut(originalSysOut);
    }

    @Test
    public void testSaveSaleInformation() {
        Sale sale = null;
        ExternalAccountingSystem instance = new ExternalAccountingSystem();
        instance.saveSaleInformation(sale);
        String expResult = "the system updated";
        String result = outContent.toString();
        assertTrue(result.contains(expResult));
    }
}