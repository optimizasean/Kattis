import java.util.Scanner;
public class server {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int T = in.nextInt();
		int done = 0, time = 0;
		while (done < n && time < T) {
			int task = in.nextInt();
			if (time + task > T) {
				break;
			}
			else {
				time += task;
				done++;
			}
		}
		System.out.println(done);
	}
}