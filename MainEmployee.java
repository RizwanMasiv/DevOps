class Employee
{
int eid;
String ename;
double sal;
void acceptEmp(int eno,String empname,double salary)
{
eid=eno;
ename=empname;
sal=salary;
}
void dispEmp()
{
System.out.println("Empid=\t"+eid+"\tEmpname=\t"+ename+"\tEmpsal=\t"+sal);
}
}
class MainEmployee
{
public static void main(String args[])
{
Employee s=new Employee();
s.acceptEmp();
s.dispEmp();
}
}