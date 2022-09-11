import java.util.*;
class swap
{
public static void main(String args[])
{
int a,b,c;
Scanner s=new Scanner(System.in);
System.out.println("enter the 2 number");
a=s.nextInt();
b=s.nextInt();
c=a;
a=b;
b=c;
System.out.println("After swapping"+a+" "+b);
}
}