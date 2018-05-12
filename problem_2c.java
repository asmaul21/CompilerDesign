// Replace two or more characters with another character(s) in a string

public class problem_2c {
	
	public static void main(String[] args){
		
		String Str = new String("BE Honest");
		
		System.out.print("\nBefore Repalcing: " );
	    System.out.println(Str);
	    
	    System.out.print("\nAfter Repalcing: " );
		System.out.println(Str.replaceAll("Honest", "Humble"));
		
		System.out.print("\nAfter Repalcing: " );
		System.out.println(Str.replaceAll("Honest", "Happy"));	    
		
	}

}
