public class pattern {
    public static void main(String[] args) {

        int n =5;
        int nst =n; // no.of star in first row

        int nsp =2; // no. of space in first row
        int row =n;

        for(int i=1; i<=row;i++){

            for(int csp=1; csp<=nsp;csp++){
                System.out.print("  ");

            }

            for (int cst=1; cst<=nst;cst++){
                System.out.print("  * ");
            }
            System.out.println();
            
        }
        
    }
}
