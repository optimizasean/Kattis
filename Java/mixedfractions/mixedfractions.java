import java.util.Scanner;
public class mixedfractions {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt(), den = in.nextInt(), mixwhole, mixnum, mixden;
		do {
			mixnum = num % den;
			mixwhole = (int)(num / den);
			mixden = den;
			System.out.println(mixwhole + " " + mixnum + " / " + mixden);
			num = in.nextInt();
			den = in.nextInt();
		} while (num != 0 && den != 0);
	}
}