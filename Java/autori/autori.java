import java.util.Scanner;
public class autori {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine(), ans = "" + name.charAt(0);
		char x = ' ';
		for (int i = 1; i < name.length(); i++) {
			x = name.charAt(i - 1);
			if (x == '-') {
				ans += name.charAt(i);
			}
		}
		System.out.println(ans);
	}
}