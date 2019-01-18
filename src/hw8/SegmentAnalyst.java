package hw8;

import java.util.*;

public class SegmentAnalyst extends AnalystDecorator{
    public SegmentAnalyst(StockAnalyst s){
        super(s);
    }
    public double getConfidence(){
        if (sa.getInfo().getSegment().equals("technology")){
            return (sa.getConfidence()+0.8)/2;
        }
        if (sa.getInfo().getSegment().equals("auto")){
            return (sa.getConfidence()+0.2)/2;
        }
        else{
            return sa.getConfidence();
        }
    }
    
    public String reasons(){
        String s="";
        if (sa.getInfo().getSegment().equals("technology")){
            s = "\nTech stocks are a good risk.";
        }
        else{
            if (sa.getInfo().getSegment().equals("auto")){
            s = "\nAuto stocks are a bad risk";
            }
            else{
                s="";
            }
        }
        return sa.reasons()+s;
    }
}