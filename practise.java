package com.mycompany.univodacomproject;

import java.util.Scanner;
public class UniVodacomProject{
 public static void main(String args[]){
     Scanner zwiala=new Scanner(System.in);
     
     System.out.println("0"+"unlock your 30!!!");
     System.out.println("1"+"vodapay");
     System.out.println("2"+"balance");
     System.out.println("3"+"buy");

     System.out.print("enter the options:");
     int options=zwiala.nextInt(); /*this one now we are asking the user that we are going to use the  String  as int as is the whole number without
     decimals*/
     if(options==0){
     System.out.println("unlock your 30!");
     
     }else if(options==1){
         System.out.println("vodapay");
     }else if(options==2){
      System.out.println("balance");
     
     }else if(options==3){
         System.out.println("buy");
         
     }else{
     System.out.print("invalid");
     }   
}
}







