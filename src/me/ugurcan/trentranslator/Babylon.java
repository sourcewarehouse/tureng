package me.ugurcan.trentranslator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Babylon extends Dictionary {

    private static final String apiName = "Babylon";

    public Babylon() {

    }

    public Results getDefinitionOf(String input) {

        input = Utils.replaceTurkishChars(input);

        //System.out.println(input);

        Results results = new Results(apiName);

        try {

            Document doc = Jsoup.connect("http://dictionary.babylon.com/" + input).get();
            Elements elements = doc.getElementsByAttributeValue("id", "content").get(0).getElementsByClass("dictionary_box").get(0).getElementsByClass("definition");

            String source = doc.getElementsByClass("def_main_title").get(0).text().substring(14);

            for (Element element : elements) {
                String[] translations = element.text().split("\\;");

                for (String translation : translations)
                    results.add(new Result(source, translation.trim(), "en-en", "", ""));
            }

        } catch (Exception ex) {
            results.clear();
        }

        return results;

    }

}
