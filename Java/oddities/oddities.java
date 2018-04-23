import java.util.Scanner;
public class oddities {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for (int i = 0; i < N; i++) {
			int x = in.nextInt();
			System.out.println(x % 2 == 0 ? x + " is even" : x + " is odd");
		}
	}
}