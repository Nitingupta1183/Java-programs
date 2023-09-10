import java.util.*;

public class rev {
    public static void main(String[] args) {

         int n,r;
         System.out.println("enter the any number");
        Scanner sc= new Scanner(System.in);

        n =sc.nextInt();
        while(n>0){

            r=n%10;
            System.out.print("reverse order"+r);
            n=n/10;
        }
        
    }
    
}
