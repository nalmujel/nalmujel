/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowerproject;


public class Date {

    private int day;
    private int month;
    private int year;

    
    public Date(){

        day =0;

        month = 0;

        year=0;

    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDay(int day)  {
        this.day = day;
    }
    
    
    public void setMonth(int month) {
       
        if(month <1 || month>12)
        throw  new IllegalArgumentException("Invalid month value !");
        
        this.month = month;
    }



    public void setYear(int year) {
        if(year < 2018)
        throw  new IllegalArgumentException("Invalid year value !");
        
        this.year = year;

    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }


    @Override

    public String toString(){

        return  String.format("%02d/%02d/%04d",

                getDay(),getMonth(),getYear());

    }

}
