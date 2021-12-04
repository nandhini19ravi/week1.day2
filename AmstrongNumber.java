package week1.day2;

public class AmstrongNumber {

	public static void main(String[] args) {
		int input = 50;
		int Cal = 0, rem;

		while(input>0) {
			rem = input % 10; // 50 % 10 = 0
			Cal = Cal+ (rem*rem*rem);//0+0= 0
			input = input/10; // 50/10 = 5
			if (Cal == input) {
				System.out.println("given is an armstrong number");	
			}
			else
				System.out.println("given is not an armstrong number");
			}

}
}
