package week1.day2;

public class ConvertNumber {
	public int convert(int num) {
		if (num<0) {
			return num * -1;
		}
		else
			return num;
	}

	public static void main(String[] args) {
		int num = -28;
		ConvertNumber tran = new ConvertNumber();
		int res = tran.convert(num);
		System.out.println("The number "+ num+" is converted to "+res);

	}

}
