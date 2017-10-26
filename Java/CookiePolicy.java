import java.net.*;

public interface CookiePolicy {
	public final String ACCEPT_ORIGINAL_SERVER = "ACCEPT_ORIGINAL_SERVER"; 
	
	public boolean shouldAccept(URI uri, HttpCookie httpCookie);
	
	
	
}
