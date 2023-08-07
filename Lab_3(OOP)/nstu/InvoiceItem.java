package com.nstu;

public class InvoiceItem {

    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    InvoiceItem(String ID,String Desc,int Qty,double unitprice){
        id=ID;
        desc=Desc;
        qty=Qty;
        unitPrice=unitprice;
    }

    InvoiceItem(){

    }
    public String getid(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getdesc(){
        return desc;
    }
    public void setDesc(String desc){
        this.desc=desc;
    }
    public int getqty(){
        return qty;
    }
    public void setQty(int qty){
        this.qty=qty;
    }
    public double getunitPrice(){
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice){
        this.unitPrice=unitPrice;
    }


    double getTotal(){
        return qty*unitPrice;
    }


    void showInvoice(){
        System.out.println("\nID : "+id+"\nDESC : "+desc+"\nQTY : "+qty+"\nUnit Price : "+unitPrice+"\nTotal : "+getTotal());
    }
}
