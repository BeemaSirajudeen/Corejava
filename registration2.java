package corejava;

import java.util.Scanner;

public class registration2 {

	
	
	String name,a,cnum,e,ptype,pid;
 public void registration2(String cnum,String name,String address,String e,String ptype,String pid)
	{
		this.name=name;
		this.a=a;
		this.cnum=cnum;
		this.e=e;
		this.ptype=ptype;
	    this.pid=pid;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
	registration2 b=new registration2();
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
	    b.register(name,a,cnum,e,ptype,pid);
	}
	void register(String name,String a,String cnum,String e,String ptype,String pid)
	{
		
	    System.out.println("Name: "+name);
	     System.out.println("Address: "+a);
	     System.out.println("Contact NO: "+cnum);
	     System.out.println("Email ID: "+e);
	     System.out.println("Proof Type: "+ptype);
	     System.out.println("Proof ID: "+pid);
	     
	}

}
