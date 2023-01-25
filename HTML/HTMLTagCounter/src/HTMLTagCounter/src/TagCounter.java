//package HTMLTagCounter.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.TreeMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

public class TagCounter {

	enum HTMLTags { a, abbr, acronym, address, applet, area, article, aside, audio, b, base, basefont, bdi, bdo,
		big, blockquote, body, br, button, canvas, caption, center, cite, code, col, colgroup, datalist, dd, del, details, dfn, dialog, 
		dir, div, dl, dt, em, embed, fieldset, figcaption, figure, font, footer, form, frame, frameset, h1, h2, h3, h4, h5, h6, head, header, hr, 
		html, i, iframe, img, input, ins, kbd, label, legend, li, link, main, map, mark, menu, menuitem, meta, meter, nav, noframes, noscript, 
		object, ol, optgroup, option, output, p, param, picture, pre, progress, q, rp, rt, ruby, s, samp, script, section, select, small, source, 
		span, strike, strong, style, sub, summary, sup, table, tbody, td, textarea, tfoot, th, thead, time, title, tr, track, tt, u, ul, var, video, wbr}
	
	
	private TreeMap<String,Integer> HTMLTreeMap;	
	public boolean store(String url) {
		try {
			URL site = new URL(url);
			BufferedReader input = new BufferedReader(new InputStreamReader(site.openStream()));
			HTMLTreeMap = new TreeMap<>();
			HTMLTreeMap.put("!", retrieve(url,"!"));
			HTMLTreeMap.put("!DOCTYPE", retrieve(url, "!DOCTYPE"));
			for (HTMLTags n : HTMLTags.values()) {
				HTMLTreeMap.put(n.name(),retrieve(url, n.name()));
			}
			input.close();
		} catch(MalformedURLException ex) {
			System.out.println(ex.toString());
		} catch(IOException ex) {
			System.out.println(ex.toString());
		}
		return true;
	}
	
	public TreeMap<String,Integer> getHTMLTreeMap() {
		return this.HTMLTreeMap;
	}
	
	public int retrieve(String url, String tagName) {
		int count = 0;
		int tempCount = 0;
		Elements tag = null;
		try {
			Document doc = Jsoup.connect(url).get();
			if(tagName.equals("!") || tagName.equals("!DOCTYPE")) {
				List<Node> nodes = doc.childNodes();
				 for (Node node: nodes) {
					  if(node instanceof DocumentType) {
						  tempCount++;
					  } else if(node instanceof Comment) {
						  tempCount++;
					  }
		        }
			} else {
				tag = doc.select(tagName.toString());
				count = tag.size();
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		if(tempCount > 0) 
			count = tempCount;
		return count;
	}

	
}