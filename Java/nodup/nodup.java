import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class nodup {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] input = in.readLine().split("\\s");
		int inputLength = input.length;
		boolean flag = false;
		for (int i = 0; i < inputLength - 1; i++) {
			for (int j = i + 1; j < inputLength; j++) {
				if (input[i].compareTo(input[j]) == 0) {
					flag = true;
					break;
				}
			}
			if (flag) break;
		}
		System.out.println(flag ? "no" : "yes");
	}
}