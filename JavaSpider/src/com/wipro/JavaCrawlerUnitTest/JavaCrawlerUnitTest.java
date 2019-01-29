package com.wipro.JavaCrawlerUnitTest;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.jsoup.nodes.Document;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.wipro.JavaCrawler.JavaCrawler;

class JavaCrawlerUnitTest {
	
	
	
	@Test
	public void javaCrawlerDocParser() {
	JavaCrawler jCrawler=new JavaCrawler();	
	Document doc = JavaCrawler.documentParser("http://wiprodigital.com"); 
	assertTrue(" DocumentParser failed to retrieve html Document fromm the url ", doc != null );
	}
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/*@Test
	void test() {
		fail("Not yet implemented");
	}*/

}
