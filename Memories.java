package Memories;

public class Sample
{
static int a=20;
String name="Magician";
public static void main(String[] args)
{
	System.out.println(a);
	display();
	play();
	Sample s=new Sample();
	s.end();
}
public static void display()
{
	int b=30;
	System.out.println("Display method");
}
public static void play()
{
	System.out.println("play method");
}
public void end()
{
	System.out.println("end method");
}
}
