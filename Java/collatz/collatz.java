import java.util.*;
import java.io.*;
public class collatz {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder out = new StringBuilder();
		while (true) {
			Map<Long, Integer> map = new HashMap<>();
			String[] line = in.readLine().split(" ");
			long a = Long.parseLong(line[0]);
			long b = Long.parseLong(line[1]);
			if (a == 0 && b == 0) break;
			int counta = 0, countb = 0;
			long meet = 0;
			int stepa = -1, stepb = -1;
			long aoriginal = a, boriginal = b;
			while (true) {
				map.put(a, counta);
				if (a == 1) break;
				if (a % 2 == 0) {
					a /= 2;
				}
				else {
					a = a * 3 + 1;
				}
				counta++;
			}
			while (true) {
				if (map.containsKey(b)) {
					stepb = countb;
					stepa = map.get(b);
					meet = b;
					break;
				}
				if (b == 1) break;
				if (b % 2 == 0) {
					b /= 2;
					//blist.add(b);
				}
				else {
					b = b * 3 + 1;
					//blist.add(b);
				}
				countb++;
			}
			out.append(aoriginal + " needs " + stepa + " steps, "
				+ boriginal + " needs " + stepb + " steps, "
				+ " they meet at " + meet + "\n");
		}
		System.out.print(out);
	}
}