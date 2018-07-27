class Rect
{
 int length,breadth;
float area;
Rect()
{
 length=20;
 breadth=40;
}
float areaOfRect()
{
 area =length*breadth;
 return area;
}
void disp()
{
 System.out.println("Area of rect="+areaOfRect());
}
}
class MainRect
{
public static void main(String args[])
{
 Rect robj=new Rect();
 robj.disp();
}
}
 
