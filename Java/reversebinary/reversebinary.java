import java.util.Scanner;
import java.lang.StringBuilder;
public class reversebinary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		StringBuilder N = new StringBuilder(Integer.toBinaryString(in.nextInt())).reverse();
		System.out.println(Integer.parseInt(N.toString(), 2));
	}
}