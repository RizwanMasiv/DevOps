package Interface;

public class Mainn implements Interface1,Interface2,Interface3 
{

	
		public void CallBack()
	     {
		 System.out.println("i am interface1");
	      }
	public void disp()
	{
		 System.out.println("i am interface2");	 
	}
	
public void mul(int a,int b)
{
	System.out.println("i am interface3");
	System.out.println("A value:"+a+",B value:"+b);
	
}
public static void main(String[] args) 
{
Mainn obj=new Mainn();
obj.CallBack();
obj.disp();
obj.mul(10,20);
}

}
