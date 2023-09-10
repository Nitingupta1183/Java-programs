//Write a   Java   program to find maximum between three numbers.

import java.util.*;
public class Max_three_no {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System .in);
         System.out.println("enter the A number");
        int a= sc.nextInt();
         System.out.println("enter the B number");
        int b=sc.nextInt();
         System.out.println("enter the C number");
        int c=sc.nextInt();
        if(a>b && a>c){
        System.out.println("A is t6he greater number");
            

        }

        else if(b>a && b>c){
         System.out.println("  B is the greater number");

        }
        else{
            System.out.println("C is the greater number");
        }
    }
    
}
