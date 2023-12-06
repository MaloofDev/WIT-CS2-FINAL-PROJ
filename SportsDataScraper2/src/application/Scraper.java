package application;
import org.jsoup.nodes.Element;

public abstract class Scraper 
{

	
	abstract TeamStats[] scrape();
	
	abstract String extractTeamName(Element Row);
	
	abstract float[] extractStats(Element row);
	
}
