package com.driver;

public class Main {
  public main(){
  }
  public static void main(String [] args){
    Product p  = new Product();
    p.product(1,2);
    p.product(1,2,3);
    p.product(1.0,2.0);
  }
  public static class Product{
   public int product(int a, int b){
    return a*b; 
   }
    public int product(int a, int b, int c){
    return a*b*c; 
   }
    public double product(double a, double b){
    return a*b; 
   }
  }
  
}
