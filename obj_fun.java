import java.util.*;
public class obj_fun {
String name;
int id;
void get(String n, int i)
{
	name=n;
	id=i;
}
void dis()
{
	System.out.println("Name="+name+"  and Id="+id);
}
public static void main(String ar[])
{
	obj_fun ob=new obj_fun();//object creation
	System.out.println("Enter name and id");
	Scanner sc=new Scanner(System.in);
	String n=sc.next();
	int i=sc.nextInt();
	ob.get(n,i);
	ob.dis();
	}
}

