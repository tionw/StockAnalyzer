package hw8;

import java.util.*;

public class PEratioAnalyst extends AnalystDecorator{
    Double per;
    Double con;
    public PEratioAnalyst(StockAnalyst s){
        super(s);
    }
    public double getConfidence(){
        con = sa.getInfo().peRatio();
        per = 1-(sa.getInfo().peRatio()/24);
        return (sa.getConfidence()+per)/2;
    }
    public String reasons(){
        String s="";
        if (con>12.0){
            s="\nThe PE ratio is "+Double.toString(con)+", which is bad.";
        }
        if (con<12.0){
            s="\nThe PE ratio is "+Double.toString(con)+", which is good.";
        }
        if (con==12.0){
            s="\nThe PE ratio is "+Double.toString(con)+", which is average.";
        }
        return sa.reasons()+s;
    }
}