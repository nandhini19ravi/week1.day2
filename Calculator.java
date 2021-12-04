package week1.day2;

public class Calculator {
	public int add(int a1, int a2) {
		return a1+a2;
	}
	public int sub(int s1, int s2) {
		return s1-s2;
	}
	public int multiple (int m1, int m2) {
		return m1*m2;
	}
	public int divide (int d1, int d2) {
		return d1/d2;
	}
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(50,10));
		System.out.println(calc.sub(40,20));
		System.out.println(calc.multiple(10, 2));
		System.out.println(calc.divide(30,3));

	}

}
