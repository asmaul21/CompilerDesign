
// Split a string with a specific delimiter

public class problem_2f {
	
	public static void main(String args[]){
		
		// Java program to demonstrate working of split(regex,limit) with small limit.
		
		String str = "geekss@for@geekss";
		
		String [] arrOfStr = str.split("@", 3);
		 
		for (String a : arrOfStr)
		      System.out.println(a);
		
    }
}
