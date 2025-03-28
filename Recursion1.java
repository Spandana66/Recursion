package Recursion;

public class Recursion1 
{
public static void main(String[] args)
{
	Recursion1 r=new Recursion1();
	r.name(-1,20);
}
public int name(int m,int n)
{
	if(m>n)
	{
		return 0;
	}
	if(m%2!=0)
	{
		System.out.println(m);
	}
	return name(m+1,n);
}
}
