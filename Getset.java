package corejava;

import java.util.Scanner;

public class Getset {
	
	String name,a,cnum,e,ptype,pid;
	public void setname(String name,String a,String cnum,String e,String ptype,String pid)
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
		//Getset b=new Getset();
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
	    Getset d=new Getset();
	    d.setname( name,a,cnum,e,ptype,pid);
	    System.out.println("Name: "+d.getname());
	     System.out.println("Address: "+d.geta());
	     System.out.println("Contact NO: "+d.getcnum());
	     System.out.println("Email ID: "+d.gete());
	     System.out.println("Proof Type: "+d.getptype());
	     System.out.println("Proof ID: "+d.getpid());
	     
	    
	
	
	}
	public String getname()
	{
		return name;
	}
	public String geta()
	{
		return a;
	}
	public String getcnum()
	{
		return cnum;
	}
	public String gete()
	{
		return e;
	}
	public String getptype()
	{
		return ptype;
	}
	public String getpid()
	{
		return pid;
	}
	
	
}

