package com.izmyr.test;

import com.izmyr.trentranslator.Babylon;
import com.izmyr.trentranslator.Dictionary;
import com.izmyr.trentranslator.Results;
import com.izmyr.trentranslator.SozlukNet;
import com.izmyr.trentranslator.Translator;
import com.izmyr.trentranslator.Tureng;
import com.izmyr.trentranslator.Zargan;

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
