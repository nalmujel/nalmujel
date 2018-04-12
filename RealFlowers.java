/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowerproject;
public class RealFlowers extends  Flowers {

    public RealFlowers() {
    }

    public RealFlowers(String color, int PriceOfPiece, boolean isAvailable, int recNum, Date recDate, Date delDate, Customer info, Departments item) {
        super(color, PriceOfPiece, isAvailable, recNum, recDate, delDate, info, item);
    }

    
    @Override
    public String getServiceType() {
        return "Real Flowers";
    }

}