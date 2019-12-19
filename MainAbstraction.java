import java.util.Scanner;

public class MainAbstraction {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		InheritedClass i=new InheritedClass();
		i.add(a,b);
		i.subtract(a,b);
		
}
}