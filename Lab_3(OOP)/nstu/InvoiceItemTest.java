package com.nstu;

public class InvoiceItemTest {
    public static void main(String[] args) {

        InvoiceItem i1=new InvoiceItem("A123","Table",6,1000);
        i1.showInvoice();

        InvoiceItem i2=new InvoiceItem();
        i2.setId("B456");
        i2.setDesc("Chair");
        i2.setQty(6);
        i2.setUnitPrice(700);
        i2.showInvoice();



    }
}
