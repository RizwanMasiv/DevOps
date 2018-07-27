class Parent
{
 void fun()
 {
 System.out.println("i am parent");
}
}
class Child2 extends Parent
{
void disp()
{
System.out.println("i am child");
}
}
class MainInheritance
{
 public static void main(String args[])
{
 Child2 c2obj=new Child2();
 c2obj.fun();
 c2obj.disp();
}
}