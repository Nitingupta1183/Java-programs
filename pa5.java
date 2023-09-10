public class pa5 {
    

    public static void main(String[] args) {

        int n =5;
        int nst =n; // no.of star in first row

        int nsp =0; // no. of space in first row
        int row =2*n-1;

        for(int i=1; i<=row;i++){
            //space k liye 
            for(int csp=1; csp<=nsp;csp++){
                System.out.print(" ");

            }

            for (int cst=1; cst<=nst;cst++){
                System.out.print("*");
            }
            System.out.println();
            //prepration for the next row //
          if (i<=n/2){
            nst--;
            nsp+=2;

          }else{
            nst++;
            nsp_=2;
          }
         
    }
}

            
        }
        
