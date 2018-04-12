
package flowerproject;

/**
 *
 * @author NawalAlmuajel
 */
import java.util.ArrayList;
import java.util.*;

public abstract class Order implements Payable  {
    static Scanner in=new Scanner(System.in);
 private  long RequestNumber;
 private Date RequestDate;
 private int quantity;
 private Date delDate ;

 private Customer info;
private Departments item ;

    public Order(long RequestNumber, Date RequestDate, int quantity, Date delDate, Customer info, Departments item) {
        this.RequestNumber = RequestNumber;
        this.RequestDate = RequestDate;
        this.quantity = quantity;
        this.delDate = delDate;
        this.info = info;
        this.item = item;
    }

    public Order(long RequestNumber, Date RequestDate, Date delDate, Customer info, Departments item) {
        this.RequestNumber = RequestNumber;
        this.RequestDate = RequestDate;
        this.delDate = delDate;
        this.info = info;
        this.item = item;
    }

    public Order() {
    }

    public Customer getInfo() {
        return info;
    }

    public void setInfo(Customer info) {
        this.info = info;
    }

    public Departments getItem() {
        return item;
    }

    public void setItem(Departments item) {
        this.item = item;
    }

    public long getRequestNumber() {
        return RequestNumber;
    }

    public void setRequestNumber(long RequestNumber) {
        this.RequestNumber = RequestNumber;
    }

    public Date getRequestDate() {
        return RequestDate;
    }

    public void setRequestDate(Date RequestDate) {
        this.RequestDate = RequestDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDelDate() {
        return delDate;
    }

    public void setDelDate(Date delDate) {
        this.delDate = delDate;
    }

    public abstract String getServiceType();


    public abstract double calculatePayment();

    public  void  print(){
        System.out.print("*******Order*******\n  " + "Request Number :" + RequestNumber + ", Recuest Date :" + RequestDate + ", Delivery Date :" + delDate + ", Custumer Information :" + info);
    }
    
    public void PaymentMethod(){
           int choice=0;
            int ccv=0;
            int visa=0;
            String NameV="";
            int time=0;
            System.out.println("Please Choose The Payment Method That you'd Like for your Order ");
            System.out.println("1: Visa");
            System.out.println("2:Cash Delievry");
            
            choice=in.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the Visa Number");
                    visa=in.nextInt();
                    System.out.println("Enter CCV Number");
            ccv=in.nextInt();
                    System.out.println("Enter The Name of The Visa");
                    NameV=in.next();
            break;
                case 2: 
                    //هنا اصير اسوي مناداة ل ميثود اسويها تبع الادريس  في هذي الكيس
                    break;
                default:
                    System.out.println("Sorry but The Payment Method That You have choosed Isn't Available in our Shop");
            }
    
    }
    
}