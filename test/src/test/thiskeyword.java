package test;
class demo
{
	int num1;
	int num2;
	int result;
	public demo(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
}
public class thiskeyword
{
	public static void main(String[]args)
	{
		demo obj=new demo(4,5);
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}
}