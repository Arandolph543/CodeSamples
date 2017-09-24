import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherEnd {
    
  public static void main(String args[]) {
    String str = "My name is Bond. James Bond.";
    Pattern pattern = Pattern.compile("Bond");
    Matcher m = pattern.matcher(str);

	while(m.find()) {
		int end = m.end();
		System.out.println(str);
		System.out.println(end);
	}
  
  }
}
