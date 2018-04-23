import java.util.Scanner;
public class bijele {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int king = in.nextInt(), queen = in.nextInt(), rook = in.nextInt(), bishop = in.nextInt(), knight = in.nextInt(), pawn = in.nextInt();
		king = -(king - 1);
		queen = -(queen - 1);
		rook = -(rook - 2);
		bishop = -(bishop - 2);
		knight = -(knight - 2);
		pawn = -(pawn - 8);
		System.out.println(king + " " + queen + " " + rook + " " + bishop + " " + knight + " " + pawn);
	}
}