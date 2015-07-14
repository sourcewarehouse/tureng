package me.ugurcan.test;

import me.ugurcan.translatorapi.BabylonAPI;
import me.ugurcan.translatorapi.DictionaryAPI;
import me.ugurcan.translatorapi.Results;
import me.ugurcan.translatorapi.SozlukNetAPI;
import me.ugurcan.translatorapi.TranslatorAPI;
import me.ugurcan.translatorapi.TurengAPI;
import me.ugurcan.translatorapi.ZarganAPI;

public class Test {

    public static void main(String[] args) {

        TranslatorAPI tureng = new TurengAPI();
        // input can be in Turkish or English
        Results results = tureng.translate("spit out");
        results.print();

        TranslatorAPI zargan = new ZarganAPI();
        // input can be in Turkish or English
        results = zargan.translate("süpürmek");
        results.print();

        DictionaryAPI sozlukNet = new SozlukNetAPI();
        // input can be in Turkish or English
        results = sozlukNet.getDefinitionOf("pay");
        results.print();

        DictionaryAPI babylon = new BabylonAPI();
        // input can only be in English
        results = babylon.getDefinitionOf("get on");
        results.print();

    }

}
