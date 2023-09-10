//Write a    Java program to check whether a number is negative, positive or zero.

import java.util.*;
public class Neg_pos_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if(a>0){
            System.out.println("this is the positive number");
        }
        else if(a<0){
            System.out.println(" this is the  negative number");

        }
        else{
            System.out.println("this number is zero");
        }
    }
    
}
