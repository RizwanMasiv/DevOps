class NestedIf
{
public static void main(String args[])
{
int year;
year=1900;
if(year%100==0)
{
if(year%400==0)
System.out.println("it is a leap year");
else
System.out.println("it is not leap");
}
else
{
if(year%4==0)
System.out.println("it is a leap");
else
System.out.println("it is not leap");
}
}
}