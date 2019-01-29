package com.wipro.JavaCrawler;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Element;


public class JavaCrawler {

	public static void main(String[] args) throws IOException {
		String url = "http://wiprodigital.com";
		Document doc=documentParser(url);
		if(doc!=null) {
			htmlParser(doc);
		}

	}
	public static void htmlParser(Document doc) {
		//Fetching various tags data 
		Elements links = doc.select("a[href]");
		Elements media = doc.select("[src]");
		Elements imports = doc.select("link[href]");

		//printing the fetched data
		print("Images and other static content :","abs:src",media);
		print("Imports : ","abs:href",imports);
		print("Links : ","abs:href",links);
	}

	public static Document documentParser(String url){
		System.out.println("Crawling  through .. "+ url);
		Document doc = null;
		//Fetching html Documment from thee url
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return doc;
	}

	public static void print(String msg,String attrMsg,Elements element) {
		System.out.println("\n"+msg+" : "+ element.size());
		for (Element link : element) {
			System.out.println(link.tagName()+" : "+link.attr(attrMsg));
		}
	}
}
