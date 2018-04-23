import java.util.Scanner;
public class stararrangements {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int S = in.nextInt();
		System.out.println(S + ":");
		for (int i = 2; i < S; i++) {
			int Z = S;
			boolean flip = true;
			while (Z > 0) {
				Z -= (flip) ? i : (i-1);
				flip = !flip;
			}
			if (Z == 0) System.out.println(i + "," + (i-1));
			if (S % i == 0) System.out.println(i + "," + i);
		}
	}
}