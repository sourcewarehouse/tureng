package me.ugurcan.test;

import java.util.ArrayList;

import me.ugurcan.sozlukapi.Result;
import me.ugurcan.sozlukapi.SozlukAPI;
import me.ugurcan.sozlukapi.ZarganAPI;
import me.ugurcan.sozlukapi.TurengAPI;

public class Test {

	public static void main(String[] args) {

		SozlukAPI tureng = new TurengAPI();
		SozlukAPI zargan = new ZarganAPI();
		
		// input can be in Turkish or English
		ArrayList<Result> results = tureng.translate("ÇOLUK ÇOCUĞA KARIŞMAK");
		
		for (Result result : results)
			System.out.println( result );

		System.out.println();

		// input can be in Turkish or English
		results = zargan.translate("ÇOLUK ÇOCUĞA KARIŞMAK");

		for (Result result : results)
			System.out.println( result );

	}

}
