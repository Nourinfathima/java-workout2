import java.util.*;
class largest
{
public static void main(String args[])
{
System.out.println("enter 3 numbers");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
System.out.println("largest number is");
System.out.println(c>(a>b?a:b)?c:((a>b)?a:b));
}}