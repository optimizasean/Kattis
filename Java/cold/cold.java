import java.util.Scanner;
public class cold {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt(), count = 0;
		for (int i = 0; i < N; i++) {
			int temp = in.nextInt();
			if (temp < 0) count++;
		}
		System.out.println(count);
	}
}