import java.util.Scanner;

public class euler_pi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 0;
		int n = 0;
		int i;

		System.out.print("calculate count: ");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			pi += 1/(Math.pow(i, 2));
		}
		System.out.printf("pi: %f", Math.sqrt(6*pi));
	}
}
