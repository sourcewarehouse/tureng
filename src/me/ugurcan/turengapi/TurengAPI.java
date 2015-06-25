package me.ugurcan.turengapi;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TurengAPI {
	
	public TurengAPI(){
		
		
	}

	public ArrayList<Result> translate(String input){
		
		ArrayList<Result> results = new ArrayList<Result>();
			
		try{
			
			Document doc = Jsoup.connect("http://tureng.com/search/" + input).get();
			Elements elements = doc.select("table").first().select("tr");
			
			for(Element element : elements){
				if(element.select("td").size() < 2)
					continue;
				
				String word = element.select("td").get(3).select("a").text();
				
				if(!word.equalsIgnoreCase(input))
					continue;
				
				String translation = element.select("td").get(4).select("a").text();
				String type = element.select("i").text();
				String category = element.select("td").get(1).text();
				
				results.add(new Result(translation, type, category));
			}
			
		}catch(Exception ex){
			results.clear();
		}
		
		if(results.isEmpty())
			System.out.println("No result found!");
		
		return results;
		
	}
	

}
