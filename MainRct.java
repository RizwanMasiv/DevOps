class Rect_With_Parameters
{
 float length, breadth;
float area;
Rect_With_Parameters(float len,float brd)
{
 length=len;
 breadth=brd;
}
float areaOfRect()
{
 area=length*breadth;
return area;
}
void disp()
{
 System.out.println("Area of rectangle="+areaOfRect());
}
}
class MainRct
{
 public static void main(String args[])
{
 Rect_With_Parameters robj=new Rect_With_Parameters(25.03f,26.23f);
 robj.disp();
}
}