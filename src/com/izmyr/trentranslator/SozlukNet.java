package com.izmyr.trentranslator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class SozlukNet extends Dictionary {

    private static final String apiName = "SozlukNet";

    public SozlukNet() {

    }

    public Results getDefinitionOf(String input) {

        input = Utils.replaceTurkishChars(input);

        //System.out.println(input);

        Results results = new Results(apiName);
        results.addAll(getDefinitionOfHelper(input, "en"));
        results.addAll(getDefinitionOfHelper(input, "tr"));

        return results;

    }

    private Results getDefinitionOfHelper(String input, String lang) {

        Results results = new Results(apiName);

        try {

            Document doc = Jsoup.connect("http://www.sozluk.net/index.php?word=" + input + "&from=" + lang + "&to=" + lang).get();
            Elements elements = doc.select("table").get(0).getElementsByAttributeValue("align", "left");

            String lang2lang = lang + "-" + lang;

            for (int i = 0; i < elements.size(); i += 3) {
                String source = elements.get(i).text();
                String[] translations = elements.get(i + 1).text().split("\\*");
                String partOfSpeech = elements.get(i + 2).text();

                if (partOfSpeech.equals("\u00a0")) // &nbsp; => empty
                    partOfSpeech = "";

                for (String translation : translations)
                    results.add(new Result(source, translation.trim(), lang2lang, partOfSpeech, ""));
            }

        } catch (Exception ex) {
            results.clear();
        }

        return results;

    }

}
