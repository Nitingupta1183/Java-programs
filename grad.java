import java.util.*;
public class grad {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
      int a=153;
      int sum=0;
      int b =a;
      int nod =0;
     

      while (b>0){
        int dig =b%10;
        sum =sum+dig*dig*dig;
        b/=10;
      }
      System.out.println(sum);
      if(sum==a){
        System.out.println("armstrong number");

      }else{
        System.out.println("not a armstrong number");
      }

    }
    
}
