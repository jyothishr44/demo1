import java.util.Scanner;
class NaturalSum
{  
public static void main(String[] args)   
{  
Scanner sc=new Scanner(System.in);
System.out.println("enter n value:");
int num=sc.nextInt();
int i,sum = 0;  
for(i = 1;i <= num;i++)  
{  
sum = sum + i;  
}    
System.out.println("Sum of First "+num+" Natural Numbers is = " + sum);  
}  
}  