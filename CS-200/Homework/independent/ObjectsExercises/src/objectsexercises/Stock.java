/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectsexercises;

/**
 *
 * @author NANAO
 */
public class Stock {
  private String symbol;
  private String name;
  private double previousClosingPrice;
  private double currentPrice;
  
  public Stock(String symbol, String name){
    this.name = name;
    this.symbol = symbol;
  }
  
  public double getChangePercent(){
   return  ((this.previousClosingPrice - this.currentPrice)/this.previousClosingPrice)*100;
     
  }
  
  public static void main(String [] args){
    Stock myStock = new Stock("ORCL", "Oracle Corporation");
    
    myStock.currentPrice = 34.35;
    myStock.previousClosingPrice = 34.5;
    System.out.print("the price-change percentage is: " + myStock.getChangePercent());
  }
  
}
