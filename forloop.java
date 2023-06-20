package day13_01_06_2023;

public class forloop {
	public static void main(String[] args) {
		System.out.println("using for loop : ");
		for (int i = 10; i <= 40; i += 5) {
			System.out.println(i);
		}
		System.out.println("using while loop : ");
		int s = 10;
		while (s <= 40) {
			System.out.println(s);
			s += 5;

		}
		System.out.println("using do while loop : ");
		int p=10;
		do {
			System.out.println(p);
			p+=5;
		} while (p<=40);
	}

}
