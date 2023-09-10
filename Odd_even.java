//Write a   Java   program to check whether a number is even or odd.
import java.util.*;
 public class Odd_even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the any number");
        int a= sc.nextInt();

        if(a%2==0){
            System.out.println(" this number is even");

        }
        else{
            System.out.println(" this number is odd");
        }
    }

    
}
