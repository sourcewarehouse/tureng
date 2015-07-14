package me.ugurcan.test;

import me.ugurcan.trentranslator.BabylonAPI;
import me.ugurcan.trentranslator.Dictionary;
import me.ugurcan.trentranslator.Results;
import me.ugurcan.trentranslator.SozlukNetAPI;
import me.ugurcan.trentranslator.Translator;
import me.ugurcan.trentranslator.TurengAPI;
import me.ugurcan.trentranslator.ZarganAPI;

public class Test {

    public static void main(String[] args) {

        Translator tureng = new TurengAPI();
        // input can be in Turkish or English
        Results results = tureng.translate("spit out");
        results.print();

        Translator zargan = new ZarganAPI();
        // input can be in Turkish or English
        results = zargan.translate("süpürmek");
        results.print();

        Dictionary sozlukNet = new SozlukNetAPI();
        // input can be in Turkish or English
        results = sozlukNet.getDefinitionOf("pay");
        results.print();

        Dictionary babylon = new BabylonAPI();
        // input can only be in English
        results = babylon.getDefinitionOf("get on");
        results.print();

    }

}
