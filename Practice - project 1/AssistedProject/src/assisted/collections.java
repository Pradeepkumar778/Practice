package assisted;
import java.util.*;

public class collections {

	public static void main(String[] args) {
		
				//creating arraylist
				System.out.println("ArrayList");
				ArrayList<String> Bikes=new ArrayList<String>();   
			      Bikes.add("Dio");//
			      Bikes.add("Pulsar");  
			      Bikes.add("Ktm");
			      System.out.println(Bikes);  
				
				//creating vector
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> vec = new Vector();
			      vec.addElement(15); 
			      vec.addElement(30); 
			      vec.addElement(45);
			      vec.addElement(60);
			      System.out.println(vec);
				
				//creating linkedlist
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> names=new LinkedList<String>();  
			      names.add("Praveen");  
			      names.add("kiran");  	      
			      Iterator<String> itr=names.iterator();  
			      while(itr.hasNext())   
			       System.out.println(itr.next());  
			       
			       //creating hashset
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(101);  
			       set.add(103);  
			       set.add(102);
			     
			       System.out.println(set);
			       
			       //creating linkedhashset
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
			       set2.add(11);  
			       set2.add(13);  
			       set2.add(12);
			       set2.add(14);	       
			       System.out.println(set2);
			      	
			      }  
			
	}

