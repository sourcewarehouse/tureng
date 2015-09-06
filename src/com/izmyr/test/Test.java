package com.izmyr.test;

import com.izmyr.tureng.Babylon;
import com.izmyr.tureng.Dictionary;
import com.izmyr.tureng.Results;
import com.izmyr.tureng.SozlukNet;
import com.izmyr.tureng.Translator;
import com.izmyr.tureng.Tureng;
import com.izmyr.tureng.Zargan;

public class Test {

    public static void main(String[] args) {

        Translator tureng = new Tureng();
        Results results = tureng.translate("spit out"); // input can be in Turkish or English
        results.print();

        /*Translator zargan = new Zargan();
        results = zargan.translate("süpürmek"); // input can be in Turkish or English
        results.print();

        Dictionary sozlukNet = new SozlukNet();
        results = sozlukNet.getDefinitionOf("pay"); // input can be in Turkish or English
        results.print();

        Dictionary babylon = new Babylon();
        results = babylon.getDefinitionOf("get on"); // input can only be in English
        results.print();*/

    }

}
