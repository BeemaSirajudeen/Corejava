package corejava;

import java.util.Scanner;

public class main {
	public String name,a,cnum,e,ptype,pid;
	public static void main(String[] args) {
		
main d=new main();
		Scanner sc=new Scanner(System.in);
		String name,a,cnum,e,ptype,pid;
		System.out.println("Enter your name");
	     name=sc.nextLine();
	System.out.println("Enter your address");
	d.a=sc.nextLine();
	System.out.println("Enter your contact Number");
	d.cnum=sc.nextLine();
	System.out.println("Email ID");
	d.e=sc.nextLine();
	System.out.println("Proof Type");
	    d.ptype=sc.nextLine();
	System.out.println("Proof ID");
	    d.pid=sc.nextLine();
	    System.out.println("Name: "+d.name);
	     System.out.println("Address: "+d.a);
	     System.out.println("Contact NO: "+d.cnum);
	     System.out.println("Email ID: "+d.e);
	     System.out.println("Proof Type: "+d.ptype);
	     System.out.println("Proof ID: "+d.pid);
	
	
}
}