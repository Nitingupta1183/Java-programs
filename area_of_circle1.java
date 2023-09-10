import java.util.Scanner;
class Test
{
void sum(int a,int b)
{
System.out.println(a+b);
}
static void area_of_circ(double r)
{
System.out.println(3.14*r*r);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
double d=new double();
Test t=new Test();
t.sum(4,5);
area_of_circ(d);
}
}
