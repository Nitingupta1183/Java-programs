//Write a Java   program to check whether a year is leap year or not.

import java.util.*;

public class Leap_years {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the any years");
        int year= sc.nextInt();
        if(year %4==0){
        System.out.println("it is a leap year");
        }
         if(year%100==0){
        System.out.println("not a leap year");
        }
          if(year%400==0){
            System.out.println("it is leap year");
          }
        else{
            System.out.println("it is not a leap year");
        }  
        }
    }
    

