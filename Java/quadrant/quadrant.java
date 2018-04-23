import java.util.Scanner;
public class quadrant {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt(), Y = in.nextInt();
		if (X < 0) {
			if (Y < 0) {
				System.out.println(3);
			}
			else {
				System.out.println(2);
			}
		}
		else {
			if (Y < 0) {
				System.out.println(4);
			}
			else {
				System.out.println(1);
			}
		}
	}
}