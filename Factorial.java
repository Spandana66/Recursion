package Recursion;

import java.util.*;
public class Factorial 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	int fact=fact(1,num,1);
	System.out.println("The factorial of"+num+"is"+fact);
	
}
public static int fact(int fact,int num,int start)
{
	if(start>num)
	{
		return fact;
	}
	fact=fact*start;
	return fact(fact,num,start+1);
}
}
