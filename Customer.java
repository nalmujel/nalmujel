
package flowerproject;

/**
 *
 * @author NawalAlmuajel
 */
import  java.io.*;
import java.util.Scanner;
public class Customer {
    Scanner in = new Scanner(System.in);
    private long id;
    private String name;
    private int phonenumber;
    private String mail;
    private String Adress;
  

        public Customer(){
            id = 0;
            name = "";
            phonenumber = 0;
            mail="";
        }

    public Customer(long id, String name, int phone ,String mail) {
        this.id = id;
        this.name = name;
        this.phonenumber = phone;
        this.mail=mail;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getphonenumber() {
        return phonenumber;
    }

    public void setPhone(int phone) {
        this.phonenumber = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }


    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", phone=" + phonenumber + ", mail=" + mail + '}';
    }public void PaymentMethod(){
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
                        System.out.println("Enter Your Adress");
                    Adress=in.next();
                    break;
                default:
                    System.out.println("Sorry but The Payment Method That You have choosed Isn't Available At our Shop");
            }
    
    }
    

    
}
