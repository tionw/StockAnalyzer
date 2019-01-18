package hw8;

import java.util.*;

public class NameAnalyst extends AnalystDecorator{
    public NameAnalyst(StockAnalyst s){
        super(s);
    }
    public double getConfidence(){
        if (sa.getInfo().getName().equals("a")){
            return (sa.getConfidence()+1.0)/2;
        }
        else{
            return sa.getConfidence();
        }
    }
    public String reasons(){
        String s;
        if (sa.getInfo().getName().equals("a")){
            s = "\nI love companies that begin with 'A'.";
        }
        else{
            s = "";
        }
        return sa.reasons()+s;
    }
}