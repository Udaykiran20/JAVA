package The_logics_;
import java.util.*;
public class number_into_roman {
	
	 static public int returning() {
		 Scanner sc=new Scanner(System.in);
	       System.out.println("enter the roman value : ");
	       String s1 = sc.next();
	       String s=s1.toUpperCase();
		Map<Character,Integer> m = new HashMap<Character,Integer>();
	       m.put('I', 1);
	       m.put('V', 5);
	       m.put('X', 10);
	       m.put('L', 50);
	       m.put('C', 100);
	       m.put('D', 500);
	       m.put('M', 1000);
	       
		int result=m.get(s.charAt(s.length()-1));

	      for(int i=s.length()-2;i>=0;i--) 
	       {
	    	   
	    	   if(m.get(s.charAt(i))<m.get(s.charAt(i+1))) 
	    	   {
	    		   result-=m.get(s.charAt(i));  
	    		
	    	   }
	    	   else if(m.get(s.charAt(i))>m.get(s.charAt(i+1)))
	    	   {
	    	 	   result+=m.get(s.charAt(i)); 
	    		   
	    	   }
		
	       }
		return result;
	}
		 static  public void main(String[] args) {
			
			 
	     //System.out.println("The value is = "+returning());
	       int a=10,b=20;
	       System.out.println(-a+++a);
	       System.out.println(a+b);
 

			 
	}
	        
}
	


