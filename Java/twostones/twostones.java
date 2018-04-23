import java.util.Scanner;
public class twostones {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(N % 2 == 0 ? "Bob" : "Alice");
	}
}