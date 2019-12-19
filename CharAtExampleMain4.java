
public class CharAtExampleMain4
{

	public static void main(String[] args)
	{
		String str="Welcome to FACE portal";
		int count=0;
		for(int i=0;i<str.length()-1;i++) // start from 0 index to  string length-1
		{
			if(str.charAt(i)=='t')       // if character at each index match 't'.
			{
				count++;
			}
		}
		System.out.println("Frequency of t is:"+count);

	}

}
