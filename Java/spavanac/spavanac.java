import java.util.Scanner;
public class spavanac {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt(), M = in.nextInt();
		if (M < 45) {
			M += 15;
			if (--H < 0) H += 24;
		} else M -= 45;
		System.out.println(H + " " + M);
	}
}