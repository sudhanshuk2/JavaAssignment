import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPValidation {

	private Pattern pattern;
    private Matcher matcher;
    
    private static final String IPADDRESS_PATTERN = 
    		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
    		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
    
    public IPValidation(){
  	  pattern = Pattern.compile(IPADDRESS_PATTERN);
    }
    
    public boolean validate(final String ip){		  
  	  matcher = pattern.matcher(ip);
  	  return matcher.matches();	    	    
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IPValidation ipv = new IPValidation();
		System.out.println(ipv.validate("000.255.123.20"));
	}

}
