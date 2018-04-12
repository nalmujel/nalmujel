/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowerproject;

public abstract class Departments extends Order {

    private String color;
    private int priceOfPiece;
    private boolean isAvailable;

    public Departments() {
        color = "";
        priceOfPiece = 0;
        isAvailable = false;

    }

    public Departments(String color, int priceOfPiece, boolean isAvailable) {
        this.color = color;
        this.priceOfPiece = priceOfPiece;
        this.isAvailable = isAvailable;
    }

    
    public Departments(String color, int priceOfPiece, boolean isAvailable, long RequestNumber, Date RequestDate, Date delDate, Customer info, Departments item) {
        super(RequestNumber, RequestDate, delDate, info, item);
        this.color = color;
        this.priceOfPiece = priceOfPiece;
        this.isAvailable = isAvailable;
    }

   

    public void setPriceOfPiece(int price) {

        if (price < 0) {
            throw new IllegalArgumentException("Invalid Price !");
        }

        this.priceOfPiece = price;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getColor() {
        return color;
    }

    public int getPriceOfPiece() {

        return priceOfPiece;

    }

    public boolean isAvailable() {

        return isAvailable;

    }

    @Override
    public String toString() {
        return "Departments{" + "color=" + color + ", price=" + priceOfPiece + '}';
    }

}