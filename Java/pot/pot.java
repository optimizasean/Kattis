import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class pot {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		long ans = 0;
		for (int i = 0; i < N; i++) {
			String proc = in.readLine();
			int x = Integer.parseInt(proc) / 10;
			int y = Integer.parseInt("" + proc.charAt(proc.length() - 1));
			ans += Math.pow(x, y);
		}
		System.out.println(ans);
	}
}