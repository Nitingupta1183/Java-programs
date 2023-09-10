import java.util.*;

  class calcjava{

     public static void main(String args []) {

        Scanner sc =new Scanner(System.in);

        System.out.println("enter a");
        int a = sc.nextLine();
        System.out.println("enter b");
         int b= sc.nextLine();
         System.out.println("enter operator");
          char operator =sc.nextLine().charAt(0);

          switch(operator){

            case '1': System.out.println(a+b);
            break;

            case '2': System.out.println(a-b);
            break;

            case '3' : System.out.println(a*c);
            break;
             
            default: System.out.println()"this is wrong");
          }
         
        
     }

  }
  

  
  
  
  
  