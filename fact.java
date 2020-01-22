import java.util.*;
public class fact {
	int f=1;
	void factorial(int n)
	{
		for (int i=1;i<=n;i++)
		f=f*i;
		System.out.println("Factorial of the no. is="+f);
	}
public static void main(String ar[])
{
	fact f=new fact();
System.out.println("Enter no.");
Scanner sc=new Scanner(System.in);
int no=sc.nextInt();
f.factorial(no);
}
}
