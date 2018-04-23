import java.util.Scanner;
public class tarifa {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt(), N = in.nextInt(), Mb = X;
		for (int i = 0; i < N; i++) {
			Mb += X - in.nextInt();
		}
		System.out.println(Mb);
	}
}