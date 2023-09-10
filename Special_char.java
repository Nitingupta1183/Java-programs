//Write a Java program to input any character and check whether it is alphabet, digit or special character.
import java.util.*;
public class Special_char {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char alpha =sc.next().charAt(0);
        if( alpha>='A'&& alpha<='Z' || alpha>='a'&& alpha<='z'){
            System.out.println("this is a aplhabet");
        }
        else if (alpha>='0' && alpha<='9'){
            System.out.println("this is a digit number");
        }
        else{
            System.out.println("this is a special case");
        }
            
    }
    
}
