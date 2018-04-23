import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.lang.StringBuilder; //Possibly in either java.io.* or java.util.*
public class backspace {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String raw = in.readLine();
		Deque<Character> proc = new LinkedList<>();
		for (int i = 0; i < raw.length(); i++) {
			char x = raw.charAt(i);
			if (x == '<') {
				proc.removeLast();
			}
			else {
				proc.addLast(x);
			}
		}
		
		StringBuilder out = new StringBuilder();
		while (!proc.isEmpty()) {
			out.append(proc.removeFirst());
		}
		System.out.println(out);
	}
}