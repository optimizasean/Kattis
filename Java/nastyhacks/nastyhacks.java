import java.util.Scanner;
public class nastyhacks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), r, e, c;
		while (n-- > 0) {
			r = in.nextInt();
			e = in.nextInt();
			c = in.nextInt();
			int x = e - c;
			if (x == r) {
				System.out.println("does not matter");
			}
			else if (x > r) {
				System.out.println("advertise");
			}
			else if (x < r) {
				System.out.println("do not advertise");
			}
		}
	}
}