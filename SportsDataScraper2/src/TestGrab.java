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
	final String url = "https://www.espn.com/nba/stats/team";
	final Document doc = Jsoup.connect(url).get();
	String html = doc.html();
	html = html.substring(html.indexOf("teamStats"), html.indexOf("dictionary"));
	System.out.println(html);
	
	//System.out.println(doc.select("img.Image.Logo.Logo__sm"));
	}

}
