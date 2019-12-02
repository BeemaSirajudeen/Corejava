package corejava;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		String name,a,cnum,e,ptype,pid;
		System.out.println("Enter your name");
	     name=sc.nextLine();
	System.out.println("Enter your address");
	a=sc.nextLine();
	System.out.println("Enter your contact Number");
	cnum=sc.nextLine();
	System.out.println("Email ID");
	e=sc.nextLine();
	System.out.println("Proof Type");
	    ptype=sc.nextLine();
	System.out.println("Proof ID");
	    pid=sc.nextLine();
	    System.out.println("Name: "+name);
	     System.out.println("Address: "+a);
	     System.out.println("Contact NO: "+cnum);
	     System.out.println("Email ID: "+e);
	     System.out.println("Proof Type: "+ptype);
	     System.out.println("Proof ID: "+pid);
	
	
}
}