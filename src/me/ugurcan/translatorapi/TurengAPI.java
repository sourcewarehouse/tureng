package me.ugurcan.translatorapi;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class TurengAPI extends TranslatorAPI {

    private static final String apiName = "Tureng";

    public TurengAPI() {

    }

    @Override
    public Results translate(String input) {

        input = Utils.replaceTurkishChars(input);

        //System.out.println(input);

        Results results = new Results(apiName);

        try {

            Document doc = Jsoup.connect("http://tureng.com/search/" + input).get();
            Elements elements = doc.getElementsByClass("searchResultsTable").select("tr");

            for (Element element : elements) {
                if (element.select("td").size() < 2)
                    continue;

                String sourceLang = element.select("td").get(3).attr("lang");
                String source = element.select("td").get(3).select("a").text();

                String translationLang = element.select("td").get(4).attr("lang");
                String translation = element.select("td").get(4).select("a").text();

                String lang2lang = sourceLang + "-" + translationLang;
                String partOfSpeech = element.select("i").text();
                String category = element.select("td").get(1).text();

                results.add(new Result(source, translation, lang2lang, partOfSpeech, category));
            }

        } catch (Exception ex) {
            results.clear();
        }

        return results;

    }

}
