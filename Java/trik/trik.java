import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class trik {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String swaps = in.readLine();
		int pos = 1;
		char let;
		for (int i = 0; i < swaps.length(); i++) {
			let = swaps.charAt(i);
			if (pos == 1) {
				if (let == 'A') pos = 2;
				else if (let == 'B');
				else pos = 3;
			} else if (pos == 2) {
				if (let == 'A') pos = 1;
				else if (let == 'B') pos = 3;
				else;
			} else {
				if (let == 'A');
				else if (let == 'B') pos = 2;
				else pos = 1;
			}
		}
		System.out.println(pos);
	}
}