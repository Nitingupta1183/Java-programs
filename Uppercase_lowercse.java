//Write a Java program to check whether a character is uppercase or lowercase alphabet.
import java.util.*;

public class Uppercase_lowercse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch =sc.next().charAt(0);
        if(ch>='A'&&ch<='Z'){
            System.out.println("this alphabet is uppercase");
        }
        else{
            System.out.println("this alphabet is lowercase");
        }
    }
    
}
