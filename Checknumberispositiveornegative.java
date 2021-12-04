package week1.day2;

public class Checknumberispositiveornegative {
	public void validate(int n) {
		if (n<0) {
			System.out.println("the number is negative");
		}
		else
			System.out.println("the number is positive");
	}

	public static void main(String[] args) {
		int n = -40;
		Checknumberispositiveornegative find = new Checknumberispositiveornegative(); 
		find.validate(n);
	}

}
