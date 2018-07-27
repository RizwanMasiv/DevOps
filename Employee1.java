import java.util.Scanner;
class Depart
{
int did;
String dname;
}
class Employee1 extends Depart
{
int eid;
String ename;
float sal;
Scanner s=new Scanner(System.in);
void disp()
{
System.out.println("enter ur depart id,name");
dname=s.next();
did=s.nextInt();
System.out.println("enter employee name,id,sal");
ename=s.next();
eid=s.nextInt();
sal=s.nextFloat();
}
void disp1()
{
System.out.println("Depart id="+did+"\tDepart name="+dname);
System.out.println("Employee id="+eid+"\tEmployee name="+ename+"\tEmployee sal="+sal);
}
public static void main(String args[])
{
Employee1 obj=new Employee1();
obj.disp();
obj.disp1();
}
}