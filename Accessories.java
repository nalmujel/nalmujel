/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowerproject;
public class Accessories extends Departments {

    private char size;
    private String type;
    private String material;
    static int counAcc = 0;

    public Accessories() {
        this.size = '-';
        this.type = "";
        this.material = "";
    }

    public Accessories(char size, String type, String material, String color, int priceOfPiece, boolean isAvailable, int RequestNumber, Date RequestDate, Date delDate, Customer info, Departments item) {
        super(color, priceOfPiece, isAvailable, RequestNumber,RequestDate, delDate, info, item);
        this.size = size;
        this.type = type;
        this.material = material;
    }

    

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String getServiceType() {
        return "accessories";
    }

    @Override
    public double calculatePayment() {
        if (counAcc >= 5) {
            return ((counAcc * getPriceOfPiece()) * 0.2) - getPriceOfPiece();
        }
        return counAcc * getPriceOfPiece();
    }

}