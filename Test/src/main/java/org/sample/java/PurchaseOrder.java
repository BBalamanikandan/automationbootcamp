package org.sample.java;

import java.time.LocalDate;

public class PurchaseOrder{
    int poNum=12345687;
    short poQty=123;
    LocalDate podd= LocalDate.now();
    String status="Not Mapped";

    PurchaseOrder(){

        System.out.println("PO Number :"+poNum+"\t PO Qty:"+poQty+"\t PODD :"+podd+"\t PO Mapping Status :"+status);
    }


    public static void main(String[] args) {
        new PurchaseOrder();
    }
}
