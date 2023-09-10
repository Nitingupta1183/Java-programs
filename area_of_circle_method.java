import java.util.Scanner;
class Main
{
 static double area_of_circle (double r)
  {
    float pi = 3.14f;
    double area = pi * r * r;
      return area;
  }
 static int area_of_rec (int x, int y)
  {
    System.out.println ("Area of rectangle is : "+x * y);
  int ar= x*y;

  return ar;

 }
  public static void main (String args[])
  {
    Scanner sc = new Scanner (System.in);
    Main f=new Main();
    Main f1=new Main();
    System.out.println("enter the radius");
    double r=sc.nextDouble();
    System.out.println("Area of circle is :"+f.area_of_circle(5.12));
    f. area_of_rec(3,2);
  }
  }
