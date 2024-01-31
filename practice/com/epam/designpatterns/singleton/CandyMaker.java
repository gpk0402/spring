package com.epam.designpatterns.singleton;

public class CandyMaker {
	
	public static CandyMaker CANDYMAKER;
	private boolean empty;
    private boolean boiled;
    private int numberOfCandiesProduced;
    private CandyMaker() {
        this.empty = true;
        this.boiled = false;
        this.numberOfCandiesProduced = 1;
    }

    public static CandyMaker getInstance() {
        if (CANDYMAKER==null) {
            synchronized (CandyMaker.class) {
                if (CANDYMAKER==null) {
                    CANDYMAKER = new CandyMaker();
                }
            }
        }
        return CANDYMAKER;
    }

    public void produceCandy() {
        // Production logic...
        numberOfCandiesProduced++;
        System.out.println("Producing candy... ");
    }

    public int getNumberOfCandiesProduced() {
        return numberOfCandiesProduced;
    }

    public static class Holder{
    	static final CandyMaker CANDYMAKER = new CandyMaker();
    }
    

    public static CandyMaker getGlobalInstance() {
    	return Holder.CANDYMAKER;
    }

}
