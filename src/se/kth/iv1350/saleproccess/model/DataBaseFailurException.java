package se.kth.iv1350.saleproccess.model;

public class DataBaseFailurException extends Exception{
    public DataBaseFailurException(){
        super("Somthing fel in database. The developers have been informed and will"+
                " arrive as soon as possible. ");
         System.out.println("Something fel in database. The developers have been informed and will arrive "+
                "as soon as possible. ");
    }

}
