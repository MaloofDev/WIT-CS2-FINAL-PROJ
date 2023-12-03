import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestGrab
{
	
	
	public static void main(String[] args) throws IOException {
	/*final String url = "https://www.espn.com/nba/stats/team";
	final Document doc = Jsoup.connect(url).get();
	String html = doc.html();
	html = html.substring(html.indexOf("teamStats"), html.indexOf("dictionary"));
	System.out.println(html);
	for(int i=0;i<30;i++) {
		html=html.substring(html.indexOf("displayName\":"));
		System.out.println(html.substring(html.indexOf("\"")+3,html.indexOf("\",")));
		html=html.substring(html.indexOf("short"));
	}*/
	//System.out.println(doc.select("img.Image.Logo.Logo__sm"));
		
	}
	public String[] TeamGrab(String url, int teamSize) throws IOException {
		final Document doc = Jsoup.connect(url).get();
		String html = doc.html();
		String[] names = new String[teamSize]; 
		//System.out.println(html);
		html = html.substring(html.indexOf("teamStats"), html.indexOf("dictionary"));
		for(int i=0;i<teamSize;i++) {
			html=html.substring(html.indexOf("displayName\":"));
			names[i] = html.substring(html.indexOf("\"")+3,html.indexOf("\","));
			html=html.substring(html.indexOf("short"));
		}
		return names;
	}

}
