import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class abc {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int x = in.nextInt(), y = in.nextInt(), z = in.nextInt(), A, B, C;
		char[] abc = new char[3];
		in.nextLine();
		String tmp = in.nextLine();
		abc[0] = tmp.charAt(0);
		abc[1] = tmp.charAt(1);
		abc[2] = tmp.charAt(2);
		
		A = Math.min(x, Math.min(y, z));
		C = Math.max(x, Math.max(y, z));
		if (A == x) {
			if (C == y) B = z;
			else B = y;
		}
		else if (A == y) {
			if (C == x) B = z;
			else B = x;
		}
		else if (A == z) {
			if (C == x) B = y;
			else B = x;
		}
		else B = -1;
		
		String print = "";
		for (int i = 0; i < 3; i++) {
			if (abc[i] == 'A') print += A;
			else if (abc[i] == 'B') print += B;
			else if (abc[i] == 'C') print += C;
			else break;
			print += " ";
		}
		System.out.println(print);
	}
}