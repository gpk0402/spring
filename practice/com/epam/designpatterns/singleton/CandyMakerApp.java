package com.epam.designpatterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CandyMakerApp {

	public static void main(String[] args) {
		CandyMaker candyMaker = CandyMaker.getInstance();
		candyMaker.produceCandy();
		System.out.println("Total candies produced: " + candyMaker.getNumberOfCandiesProduced());
		CandyMaker candyMaker1 = CandyMaker.getInstance();
		System.out.println("Total candies produced: " + candyMaker1.getNumberOfCandiesProduced());
		System.out.println(candyMaker);
		System.out.println(candyMaker1);


//		public static void getInstance() {
//			CandyMaker candyMaker = CandyMaker.getGlobalInstance();
//			System.out.println(candyMaker);
//		}


//		ExecutorService service = Executors.newFixedThreadPool(4);
//		service.submit(CandyMakerApp::getInstance);
//		service.submit(CandyMakerApp::getInstance);
//		service.submit(CandyMakerApp::getInstance);
//		service.shutdown();
		
		
		
		
	}

}
