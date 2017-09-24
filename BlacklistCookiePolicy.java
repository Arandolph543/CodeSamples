import java.net.*;

public class BlacklistCookiePolicy implements CookiePolicy {
    String[] blacklist;

    public BlacklistCookiePolicy(String[] list) {
        blacklist = list;
    }

    public boolean shouldAccept(URI uri, HttpCookie cookie)  {
        String host;
        try {
            host =  InetAddress.getByName(uri.getHost()).getCanonicalHostName();
        } catch (UnknownHostException e) {
            host = uri.getHost();
        }

        for (int i = 0; i<blacklist.length; i++) {
			if (HttpCookie.domainMatches(blacklist[i], host)) {
				return false;
			}
		}
		
		return CookiePolicy.ACCEPT_ORIGINAL_SERVER.shouldAccept(uri, cookie);
    }
	
	public static void main(String[] args) {
		HttpCookie httpCookie = new HttpCookie("search", "description");
		URI uri = new URI("www.google.com");
		
		String[] cookies = {"google", "twitter", "myspace", "picaso", "stumble"};
		
		BlacklistCookiePolicy badCookie = new BlacklistCookiePolicy(cookies);
		System.out.println("There was a cookie that was blacklisted on the list was: " + badCookie.shouldAccept(uri, httpCookie));
		
	}
	
}
