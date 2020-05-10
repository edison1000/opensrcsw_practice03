import java.util.Scanner;

public class ramanujan_pi {
	public static int fac(int n) {
		int num = 1;
		for (int i = n; i >= 1; i--) {
			num = num * i;
		}
		return num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 0;
		int n = 0;
		int i;

		System.out.print("calculate count: ");
		n = sc.nextInt();
		int num1;
		int num2;
		for (i = 0; i <= n; i++) {
			num1 = fac(4 * i);
			num2 = fac(i);
			pi += (num1 * (1103 + 26390 * i)) / (Math.pow(num2, 4) * Math.pow(396, 4 * i));
		}
		pi = 1 / ((Math.sqrt(8) / 9801) * pi);
		System.out.printf("pi: %f", pi);
	}
}
