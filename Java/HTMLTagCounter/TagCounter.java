import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.io.*;
import java.net.*;

public class TagCounter {

	private boolean inATag;
	private TreeMap HTMLTreeMap;
	private String currentTag;
	
	private int count = 0;	
	
	public boolean store(String url) {
		try {
			URL site = new URL(url);
			BufferedReader input = new BufferedReader(new InputStreamReader(site.openStream()));
			currentTag = "";
			String line;

			while( (line=input.readLine())!=null)
			{
				addHTMLTagsIn(line);
			}
			input.close();
		} catch(MalformedURLException ex) {
			System.out.println(ex.toString());
		} catch(IOException ex) {
			System.out.println(ex.toString());
		}
		return true;
	}
	
	public void setCurrentTag(String tag) {
		this.currentTag = tag;
	}
	
	public String getCurrentTag() {
		return this.currentTag;
	}
	
	public TreeMap getHTMLTreeMap() {
		return this.HTMLTreeMap;
	}
	
	private void addHTMLTagsIn(String line) {
		StringTokenizer st = new StringTokenizer(line);
		while (st.hasMoreElements()) {
			String token = st.nextToken();
			System.out.println("Debug: tag " + token);
			if(token.contains("<") && token.contains(">")) {
				
			}
		}
	}
	
	public int retrieve(String url, String tagName) {
		return 0;
	}

	
}