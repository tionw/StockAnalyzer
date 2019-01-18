package hw8;

import java.util.*;

public class Neutral implements StockAnalyst{
    StockInfo si;
    public Neutral(StockInfo si){
        this.si = si;
    }
    public double getConfidence(){
        return 0.50;
    }
    public String reasons(){
        return "The market's future is unclear.";
    }
    public StockInfo getInfo(){
        return si;
    }
}