import java.util.Scanner;
public class sibice {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(), W = in.nextInt(), H = in.nextInt();
		double C = Math.sqrt((double)Math.pow(W, 2) + (double)Math.pow(H, 2));
		for (int i = 0; i < N; i++) {
			int match = in.nextInt();
			System.out.println(match <= C ? "Da" : "Ne");
		}
	}
}