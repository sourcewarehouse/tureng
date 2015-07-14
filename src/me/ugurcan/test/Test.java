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
        Results results = tureng.translate("spit out"); // input can be in Turkish or English
        results.print();

        Translator zargan = new ZarganAPI();
        results = zargan.translate("süpürmek"); // input can be in Turkish or English
        results.print();

        Dictionary sozlukNet = new SozlukNetAPI();
        results = sozlukNet.getDefinitionOf("pay"); // input can be in Turkish or English
        results.print();

        Dictionary babylon = new BabylonAPI();
        results = babylon.getDefinitionOf("get on"); // input can only be in English
        results.print();

    }

}
