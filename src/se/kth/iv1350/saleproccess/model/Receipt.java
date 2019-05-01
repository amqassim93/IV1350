package se.kth.iv1350.saleproccess.model;

import java.time.LocalDateTime;
import java.util.List;

public class Receipt {
    private Sale sale;

    Receipt(Sale sale){
        this.sale = sale;
    }

    public String extractlist(){
        List<SalesItems> list = sale.getSaleitems();
        StringBuilder builder = new StringBuilder();
        for(SalesItems line : list ){

            appendLine(builder,line.getItem().toString());


           /* appendLine(builder,"price" + line.getItem().getPrice());


            appendLine(builder,"cost: " + line.getCost());
            endSection(builder);*/
        }
        return builder.toString();
    }

    public String createReceiptString(){
        StringBuilder builder = new StringBuilder();
        appendLine(builder,"Sale ");
        endSection(builder);

        LocalDateTime saleTime = LocalDateTime.now();
        builder.append("sale Time: ");
        appendLine(builder, saleTime.toString());
        endSection(builder);

        appendLine(builder, extractlist());
        endSection(builder);

        return builder.toString();
    }

    private void appendLine(StringBuilder builder, String line){
        builder.append(line);
        builder.append("\n");
    }

    private void endSection(StringBuilder builder){
    builder.append("\n");
    }
}
