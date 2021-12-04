package week1.day3;

public class Palindrome {
	public void palin (String str) {
		String rev = "";
		for (int i = str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev)) {
			System.out.println("The given text " + str+" is a palindrome");
		}
		else
			System.out.println("The given text "+str+" is not a palindrome");
		
	}

	public static void main(String[] args) {
		String str = "malayalam";
		Palindrome result = new Palindrome();
		result.palin(str);
	}

}
