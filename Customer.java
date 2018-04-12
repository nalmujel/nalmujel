
package flowerproject;

import  java.io.*;

public class Customer {
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
    }
    

    
}
