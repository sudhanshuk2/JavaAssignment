import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IpValidate {
	private static Pattern pattern;
    private static Matcher matcher;
 
    private static final String IPADDRESS_PATTERN = 
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	  
    public IpValidate(){
	  pattern = Pattern.compile(IPADDRESS_PATTERN);
    }
    
    public boolean validate(final String ip){		  
	  matcher = pattern.matcher(ip);
	  return matcher.matches();	    	    
    }

}
