//Write a  Java program to check whether a number is divisible by 5 and 11 or not.
import java.util.*;

public class Div_no {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       System.out.println("enter the any number");
       int a = sc.nextInt();
       if (a%55==0 && a%11==0){
        System .out .println(" this number is divisible by 5 and 11");
       }
       else{
        System.out.println(" this number not divisible by 5 and 11");
       }
        }
    
}
