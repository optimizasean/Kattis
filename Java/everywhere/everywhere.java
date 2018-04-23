import java.util.Hashtable;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class everywhere {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		for (int i = 0; i < T; i++) {
			int C = Integer.parseInt(in.readLine()), count = 0;
			Hashtable<String, Integer> cities = new Hashtable<String, Integer>();
			for (int j = 0; j < C; j++) {
				String city = in.readLine();
				if (!cities.containsKey(city)) {
					count++;
					cities.put(city, 0);
				}
			}
			System.out.println(count);
		}
	}
}