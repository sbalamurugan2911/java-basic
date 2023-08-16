package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program10 {

	public static void main(String[] args) {
		// sort hashMap by values
HashMap <String,Integer>hm = new HashMap<String,Integer>();
		
		hm.put("red",7);
		hm.put("blue",5);
        hm.put("green",3);
        hm.put("yellow",1);
        hm.put("pink",4);
        hm.put("white",2);
        
        System.out.println("before sort");
        System.out.println(hm);
     
        ArrayList <Map.Entry<String, Integer>>al = new ArrayList<>(hm.entrySet());
        
        Collections.sort(al, new Comparator<Map.Entry<String, Integer>>(){
        	public int compare(Map.Entry<String, Integer>o1,Map.Entry<String, Integer>o2) {
        		
        		return (o1.getValue()).compareTo(o2.getValue());
        	}
        	
        });
        
       
        
        LinkedHashMap<String, Integer> hm1 = new LinkedHashMap<String, Integer>();
    
        
        for(Map.Entry<String, Integer> temp : al) {
        	
        	hm1.put(temp.getKey(),temp.getValue());
        }
        System.out.println("after sort");
        System.out.println(hm1);
        
          
         
           
	}

	}


