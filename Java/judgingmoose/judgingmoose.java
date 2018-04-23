import java.util.Scanner;
public class judgingmoose {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt(), r = in.nextInt();
		if (l +r == 0) System.out.println("Not a moose");
		else System.out.println(l == r ? "Even " + (r + l) : "Odd " + (2 * Math.max(r, l)));
	}
}