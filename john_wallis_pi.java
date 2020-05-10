import java.util.Scanner;

public class john_wallis_pi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 1;
		int n = 0;
		int i;

		System.out.print("calculate count: ");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			pi *= Math.pow(2*i, 2)/((2*i-1)*(2*i+1));
		}
		System.out.printf("pi: %f", 2*pi);
	}
}
