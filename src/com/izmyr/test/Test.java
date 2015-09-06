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
        Results results = tureng.translate("pay"); // input can be in Turkish or English
        results.print();

    }

}
