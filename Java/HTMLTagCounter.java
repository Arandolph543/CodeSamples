import java.util.TreeMap;
import java.util.Iterator;
import java.util.Set;
import java.net.URL;
import java.util.StringTokenizer;


/**
 * A class to count the number of occurences of HTML tags in an html file.<br>
 * This class illustrates the use of a TreeMap.
 */

public class HTMLTagCounter {

    // The map to store the list of tags and their number of occurences
    // A tree map allows the ordering of the entry. We provide our own ordering
    // since we want first the begin tags (such as <b>) in alphabetical order
    // and then the end tags (such as </b>) also in alphabetical order.
    private TreeMap HTMLTagMap;

    // is an HTML tag currently read?
    private boolean inATag;

    // the HTML tag currently extracted
    private String currentTag;

    /**
     * Construct the list of HTML tags and their number of occurences
     * in an html file. The file is specified by its url. Examples of url's are
     * http://www.seattlecentral.org
     * file:///C:/temp/myFile.html (on a windows machine)
     * @param url the location of the html file
     */
    public HTMLTagCounter(String URLName)
    {
        // Read the list of tags from the html file
        InputURL input = new InputURL(URLName);
        HTMLTagMap = new TreeMap(new HTMLTagComparator());

        // No tag initially
        currentTag = "";

        // Read the html file line by line
        String line;
        while( (line=input.readLine())!=null)
        {
            // add the tags in the current line to the map
            addHTMLTagsIn(line);
        }
    }

    /**
     * Add (in alphabetical order) all of the HTML tags in this line to the map
     */
    private void addHTMLTagsIn(String line)
    {
        // Look for < if the start of a tag has not been found yet
        // (return if there is no < in the line)
        if (!inATag)
        {
        }

        // At this point, a tag has been found
        // The tag is the first word up to the first > (unless we already have
        // a tag and are just looking for >).
        // There is no tag if currentTag is "" or "/"
        // Use a StringTokenizer to extract the first word



        // Look for the end of the tag (>)

        // Look for tags in what is left in line
    }

    /**
     * add a tag to the list of tags and update the number of occurences
     * of that tag
     * @param tag the HTML tag (given as a String)
     */
    private void addHTMLTag(String tag)
    {
        // Make the tag all upper case

        // Is it already in the map?

        // If not, create a new entry
    }

    /**
     * Return in a String the list of all of the tags and their occurences
     */
    public String toString()
    {
        // Write the tags with their number of occurences
        return null; //CHANGE THIS
    }

    /**
     * Return as a String an entry of the map.
     * @param tag the key of the entry in the map
     */
    private String entryAsAString(String tag)
    {
        return null; //CHANGE THIS
    }
    /**
     * Return the number of occurences of a tag
     * @param tag the HTML tag whose number of occurences is returned
     */
    public int numberOfOccurences(String tag)
    {
        // Format the tag according to what is in the map

        // Add the delimeters < and > if not present

        // Find it in the map

        return 0; //CHANGE THIS

    }

    /**
     * To test the class
     */
    public static void main(String[] args)
    {
        uwcse.io.Input input = new uwcse.io.Input();

        // Get the url
        String urlName = input.readString("URL (e.g. http://www.washington.edu): ");

        // Count the tags in this file
        HTMLTagCounter c = new HTMLTagCounter(urlName);
        System.out.println(c.toString());

        // Count tag by tag
        String tag;
        do
        {
            tag=input.readString("Tag to count (0 to stop): ");
            if (!tag.equals("0"))
               System.out.println(tag+": "+c.numberOfOccurences(tag));
        }while(!tag.equals("0"));
    }
}









