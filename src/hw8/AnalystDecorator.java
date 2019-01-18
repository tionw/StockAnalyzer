package hw8;

import java.util.*;

public abstract class AnalystDecorator implements StockAnalyst{
    protected StockAnalyst sa;

    public AnalystDecorator(StockAnalyst s){
        this.sa=s;
    }
    
    public double getConfidence(){
        return sa.getConfidence();
    }
    
    public String reasons(){
        return sa.reasons();
    }
    public StockInfo getInfo(){
        return sa.getInfo();
    }
}