import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IpVaildateTest {
	
	 private static IpValidate ipValidator = new IpValidate();
	 
	 public static void main(String[] args){
	    	try{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String input;
				input = br.readLine();
				//System.out.println(input);
				System.out.println(ipValidator.validate(input));
				
			}catch(IOException io){
				io.printStackTrace();
			}
	    }

}
