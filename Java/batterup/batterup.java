import java.util.Scanner;
public class batterup {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 0, den = 0, rem = 0, count = in.nextInt();
		while (count > den) {
			int x = in.nextInt();
			if (x >= 0) {
				num += x;
			}
			else {
				rem++;
			}
			den++;
		}
		double avg = (double)num / (double)(den - rem);
		System.out.println(avg);
	}
}