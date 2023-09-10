//Write a Java program to input any alphabet and check whether it is vowel or consonant.
import java.util.*;
public class Vowel_con {
 public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    char vowel = sc.next().charAt(0);
    if(vowel=='A'|| vowel=='E' || vowel=='I' || vowel=='O' || vowel=='U' || vowel=='a'|| vowel=='e' || vowel=='i' || vowel=='o' || vowel=='u' ){
        System.out.println("this is a vowel"); 
    }
    else{
        System.out.println("this is a consonant");
    }
 }    
}
