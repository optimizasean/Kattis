import java.util.Scanner;
public class Threedprinter {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int x = 1, d = 1;
		for (; x < N; x *= 2, d++);
		System.out.println(d);
	}
}