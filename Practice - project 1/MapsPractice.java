package assisted;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapsPractice {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"praveen");    
	      hm.put(2,"pradeep");    
	      hm.put(3,"kiran");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }     
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"sadiq");    
	      map.put(9,"jaideep");    
	      map.put(10,"lokesh");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    


	}

}
