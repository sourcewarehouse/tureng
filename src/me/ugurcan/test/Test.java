package me.ugurcan.test;

import me.ugurcan.trentranslator.Babylon;
import me.ugurcan.trentranslator.Dictionary;
import me.ugurcan.trentranslator.Results;
import me.ugurcan.trentranslator.SozlukNet;
import me.ugurcan.trentranslator.Translator;
import me.ugurcan.trentranslator.Tureng;
import me.ugurcan.trentranslator.Zargan;

public class Test {

    public static void main(String[] args) {

        Translator tureng = new Tureng();
        Results results = tureng.translate("spit out"); // input can be in Turkish or English
        results.print();

        Translator zargan = new Zargan();
        results = zargan.translate("süpürmek"); // input can be in Turkish or English
        results.print();

        Dictionary sozlukNet = new SozlukNet();
        results = sozlukNet.getDefinitionOf("pay"); // input can be in Turkish or English
        results.print();

        Dictionary babylon = new Babylon();
        results = babylon.getDefinitionOf("get on"); // input can only be in English
        results.print();

    }

}
