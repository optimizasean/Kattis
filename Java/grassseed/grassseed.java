import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class grassseed {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		double C = in.nextDouble(), price = 0;
		int L = in.nextInt();
		for (int i = 0; i < L; i++) {
			price += in.nextDouble() * in.nextDouble() * C; 
		}
		System.out.printf("%.7f", price);
	}
}