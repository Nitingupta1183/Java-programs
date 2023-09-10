//Write a Java program to check whether a character is alphabet or not.

import java.util.*;
public class Cheak_alph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char  alpha =sc.next().charAt(0);
        if(alpha >='A' && alpha <='Z') {
            System.out.println("this is ths correct alphabet");
        }
        else{
        System.out.println("this is not correct alphabet");
        }
    }
    
}
