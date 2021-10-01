package Training;

public class Invoice {

    String partNo;
    String partDesc;
    int quantity;
    double price_item;



    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public String getPartDesc() {
        return partDesc;
    }

    public void setPartDesc(String partDesc) {
        this.partDesc = partDesc;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {

        if(quantity<0)
            this.quantity=0;
        else
        //this.quantity=quantity;
            this.quantity = quantity;
    }

    public void getPrice_item(double price_item) {
        if (price_item<0)
            this.price_item=0;
        else
            this.price_item=price_item;
    }

    public void setPrice_item(double price_item) {
        this.price_item = price_item;
    }
    public Invoice(String partNo, String partDesc, int quantity, double price_item){
        this.partNo=partNo;
        this.partDesc=partDesc;
        setQuantity(quantity);
        setPrice_item(price_item);



    }

    public double getInvoiceAmount(){


        return quantity*price_item;

    }

}
class TestApp{
    public static void main(String[] args) {


        Invoice invoice = new Invoice("12","Manual",2,9.99);
        System.out.println(invoice.getInvoiceAmount());
        System.out.println(invoice.getQuantity());
    }

}
