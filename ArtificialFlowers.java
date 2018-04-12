/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowerproject;
public class ArtificialFlowers  extends  Flowers{

    public ArtificialFlowers() {
    }

    public ArtificialFlowers(String color, int priceOfPiece, boolean isAvailable, int recNum, Date recDate, Date delDate, Customer info, Departments item) {
        super(color, priceOfPiece, isAvailable, recNum, recDate, delDate, info, item);
    }

  

  
    @Override
    public String getServiceType() {
        return "Artificial Flowers";
    }}

   
