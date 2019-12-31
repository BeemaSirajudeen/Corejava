import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BufferedReaderExample_1
{
	public static void main(String []args){
	
	  try
	   {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); // object creating for buffer
		float a=Float.parseFloat(br.readLine()); //reading float value
		double b=Double.parseDouble(br.readLine()); //reading double value
		System.out.println(a+"\n"+b);
	  }
	  catch(Exception e)
      {
			
	  }
	}
}