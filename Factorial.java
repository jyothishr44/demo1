import java.util.Scanner;
class Factorial
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter a number:");
int num=s.nextInt();
int fact=1;
int i=1;
do
{
fact*=i;
i++;
}
while(i<=num);
System.out.println("factorial of "+num+" is:"+fact);
}
}