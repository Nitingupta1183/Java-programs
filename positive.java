// Write a    Java program to check whether a number is negative, positive or zero.

import java.util.Scanner;
public class positive{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int no=sc.nextInt();
    if(no>0)
    {
        System.out.println("positive");

    }
    else if(no<0)
    {
        System.out.println("negative");
    }
    else
    {
        System.out.println("number is zero");
    }
}
}