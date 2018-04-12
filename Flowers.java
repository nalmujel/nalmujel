/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowerproject;

public abstract class Flowers extends Departments {
    static int counFlow =0;

    public Flowers() {
        counFlow++;
    }

    public Flowers(String color, int PriceOfPiece , boolean isAvailable, long RequestNumber, Date recDate, Date delDate, Customer info, Departments item) {
        super(color,PriceOfPiece, isAvailable, RequestNumber, recDate, delDate, info, item);
    counFlow ++;
    }

   
    
    
    
   @Override
    public double calculatePayment() {
        int totalPrice =counFlow*getPriceOfPiece();
       if (totalPrice>=500) {
        return ((totalPrice)*0.3) - getPriceOfPiece();
        }
         return totalPrice ;
    }
    
}