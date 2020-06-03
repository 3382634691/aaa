package javaSEjc;

public class trys {
	public static void main(String[] args) { 
	    try { 
	      function(); 
	    } catch (Exception e) { 
	      System.err.println("非数据类型不能转换。"); 
	     
	    } 
	}
	public static void function() throws Exception{ 
	    String s = "abc"; 
	    System.out.println(Double.parseDouble(s)); 
	  } 
	    
	  
}
