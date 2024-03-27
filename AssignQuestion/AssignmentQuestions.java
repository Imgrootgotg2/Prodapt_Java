package AssignQuestion;

public class AssignmentQuestions {
	public static void main(String args[]) {
		//Question 1
		StringBuffer sb = new StringBuffer("Able was I ere I saw Elba.");
		System.out.println(sb.capacity());
		
		//Question 2
		String hannah = "Did Hannah see bees? Hannah did.";
		//a
		System.out.println(hannah.length());
		//b
		System.out.println(hannah.charAt(12));
		//c
		System.out.println(hannah.charAt(15));
		
		//Question 3
		System.out.println("Was it a car or a cat I saw?".substring(9, 12).length());
		System.out.println("Was it a car or a cat I saw?".substring(9, 12));
		
		//Question 4
	    String original = "software";
	    StringBuffer result = new StringBuffer("hi");
	    int index = original.indexOf('a');

	   result.setCharAt(0, original.charAt(0));
		System.out.println(result);

		result.setCharAt(1, original.charAt(original.length()-1));
		System.out.println(result);

		result.insert(1, original.charAt(4));
		System.out.println(result);
		
		result.append(original.substring(1,4));
		System.out.println(result);
			
		result.insert(3, (original.substring(index, index+2) + " "));
	    System.out.println(result);
	}
}
