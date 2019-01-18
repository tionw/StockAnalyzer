package hw8;

import java.util.*;

public class Bullish implements StockAnalyst{
    StockInfo si;
    public Bullish(StockInfo si){
        this.si=si;
    }
    public double getConfidence(){
        return 0.70;
    }
    public String reasons(){
        return "I think the market is going up.";
    }
    public StockInfo getInfo(){
        return si;
    }
}
