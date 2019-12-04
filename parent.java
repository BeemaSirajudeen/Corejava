import java.util.Scanner;
class child {
	public void add(int x,int y)
	{
		int z=x+y+10;
		System.out.print(z);
	}
}
public class parent extends child{
	public void add(int x,int y) {
		int z=x+y;
		System.out.print(z);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First Number");
		int a=sc.nextInt();
		System.out.println("Second Number");
		int b=sc.nextInt();
		child obj=new parent();
		obj.add(a,b);
		
		

	}

}
