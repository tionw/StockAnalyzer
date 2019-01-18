package hw8;

import java.util.*;
import java.io.*;

public class StockInfo{
    List<String> imp = new ArrayList<String>();
    public StockInfo(String files){
        try{
            File file = new File(files);
            FileInputStream fstream = new FileInputStream(file);
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null)   {
                String [] nstr = strLine.split(" ",2);
                imp.add(nstr[1]);
            }
            in.close();
        }
        catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    public String getName(){
        return Character.toString(imp.get(0).charAt(0));
    }
    
    public Double peRatio(){
        return Double.parseDouble(imp.get(4))/Double.parseDouble(imp.get(2));
    }
    
    public String getSegment(){
        return imp.get(3);
    }
}