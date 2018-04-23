import java.util.Scanner;
public class r2 {
	public static void main(String[] args) {
		double R1 = 0, R2 = 0, S = 0;
		Scanner in = new Scanner(System.in);
		R1 = in.nextDouble();
		S = in.nextDouble();
		R2 = S * 2 - R1;
		System.out.println((int)R2);
	}
}