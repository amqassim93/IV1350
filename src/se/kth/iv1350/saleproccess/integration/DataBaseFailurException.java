package se.kth.iv1350.saleproccess.integration;

public class DataBaseFailurException extends Exception {
    public DataBaseFailurException(){
        System.out.println("The database is crushed. ");
    }
}
