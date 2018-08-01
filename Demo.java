import java.util.*;
class Demo
{
 public static void main(String args[])
{
 Scanner s=new Scanner (System.in);
 String name;
 int rollno;
 float fee;
System.out.println("Enter ur name");
 name=s.next();
System.out.println("Enter ur roll no");
 rollno=s.nextInt();
System.out.println("enter ur fees"); 
 fee=s.nextFloat();
System.out.println(name+"\t"+rollno+"\t"+fee);
}
}