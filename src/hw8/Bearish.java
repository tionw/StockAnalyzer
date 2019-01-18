package hw8;

import java.util.*;

public class Bearish implements StockAnalyst{
    StockInfo si;
    public Bearish(StockInfo si){
        this.si = si;
    }
    public double getConfidence(){
        return 0.30;
    }
    public String reasons(){
        return "I think the market is going down.";
    }
    public StockInfo getInfo(){
        return si;
    }
}
