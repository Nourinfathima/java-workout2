import java.util.*;
class ascii
{
public static void main(String args[])
{
char a;
Scanner s=new Scanner(System.in);
System.out.println("enter the character");
a=s.next().charAt(0);
int b=a;
System.out.println("Ascii value"+a+" is "+b);
}
}