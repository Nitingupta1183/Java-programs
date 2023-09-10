//Write a  Java program to input week number and print week day.
import java.util.*;
public class week_days {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n =sc.nextInt();
        if(n>=1 && n<=1008)

        {
            System.out.println( );
        
            switch (n) {
               
                 case 1:
                 System.out.println("monday");
                    
                    break;
                 case 2:
                 System.out.println("tuesday");
                    
                    break;
                    
                 case 3:
                 System.out.println("wednesday");
                    
                    break;    
                 case 4:
                 System.out.println("thrusday");
                    
                    break;
                 case 5:
                 System.out.println("friday");
                    
                    break;
                  case 6:
                 System.out.println("saturday");
                    
                    break;   
                 case 7:
                 System.out.println("sunday");
                    
                    break;    
                default:
                System.out.println("this is wrong");
                    
            }
        }
    }
    
}
