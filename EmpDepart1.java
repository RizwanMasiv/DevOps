class Depart
{
int did;
String dname;
Depart(int did,String dname)
{
this.did=did;
this.dname=dname;
}
void disp()
{
System.out.println("depid="+did);
System.out.println("depname="+dname);
}
}
class EmpDepart1
{
public static void main(String args[])
{
Depart s=new Depart(100,"Managing");
s.disp();
}
}
