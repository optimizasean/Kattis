import java.util.Scanner;
public class fizzbuzz {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt(), Y = in.nextInt(), N = in.nextInt();
		for (int i = 1; i <= N; i++) {
			if (i % X == 0) System.out.println(i % Y == 0 ? "FizzBuzz" : "Fizz");
			else if (i % Y == 0) System.out.println("Buzz");
			else System.out.println(i);
		}
	}
}