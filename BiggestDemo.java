import java.util.*;
class BiggestDemo
{
public static void main(String args[])
{
int num1,num2,num3;
Scanner scanner= new Scanner(System.in);
System.out.println("enter the 1st number");
num1 = scanner.nextInt();
System.out.println("enter the 2nd number");
num2 = scanner.nextInt();
System.out.println("enter the 3rd number");
num3 = scanner.nextInt();
if(num1>num2 && num1>num3)
System.out.println("Number 1 is biggest");
else if(num2>num3)
System.out.println("Number 2 is bggest");
else 
System.out.println("Number 3 is biggest");
}
}