package thiss;

public class Depart
{
int did,did2;
String dname,dname2;
Depart (int did, int did2, String dname, String dname2 )
{
	this.did=did;
	this.dname=dname;
	this.did2=did2;
	this.dname2=dname2;
}
void disp()
{
System.out.println(did+","+dname);
System.out.println(did2+","+dname2);

}
}