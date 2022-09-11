import java.util.*;
class swapp
{
public static void main(String args[])
{
int a,b;
Scanner s=new Scanner(System.in);
System.out.println("enter the 2 number");
a=s.nextInt();
b=s.nextInt();
a=a+b;
b=a-b;
a=a-b;
System.out.println("After swapping"+a+" "+b);
}
}