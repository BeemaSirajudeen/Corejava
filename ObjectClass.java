
public class ObjectClass {
static int last_roll=100;
int roll_no;
//constructor
ObjectClass()
{
	roll_no=last_roll;
	last_roll++;
	
}
//overloading hashCode()
@Override
public int hashCode()
{
	return roll_no;
	
}
//Driver code
public static void main(String args[])
{
	ObjectClass s=new ObjectClass();
	// Below two statements are equivalent
	System.out.println(s);
		System.out.println(s.toString());
		Object obj=new String("Face");
		Class c=obj.getClass();
		System.out.println("Class of Object obj is : "+c.getName());
		s=null;
		System.gc(); //garbage collection
}
@Override
protected void finalize() // it runs after garbage collector clears the memory.
{
	System.out.println("finalize method called");

		
}

}
