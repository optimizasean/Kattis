//////////REWRITE USING HASHMAP!!!!!!!!!!

import java.util.Scanner;
import java.util.HashMap;

public class addingwords {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] nref = new String[2000];
		int[] nval = new int[2000];//replace
		int pos = 0;//replace
		HashMap<String, Integer> vtable = new HashMap<String, Integer>();
		while (in.hasNext()) {
			String cmd = in.nextLine();
			String[] prt = cmd.split(" ", 2);
			String[] proc = cmd.split("\\s");
			//PREPARE FOR REDEFINE ERASES OLD VALUE-----Completed
			if (proc[0].equals("def")) {
				if (vtable.get(proc[1]) != null) {
					vtable.replace(proc[1], Integer.parseInt(proc[2]));
				}
				else {
					vtable.put(proc[1], Integer.parseInt(proc[2]));
				}
			}
			else if (proc[0].equals("calc")) {
				if (vtable.get(proc[1]) != null) {
					int tmp = vtable.get(proc[1]);
					boolean failsafe = false;
					for (int i = 2; i < proc.length; i+=2) {
						if (proc[i].equals("+")) {
							if (vtable.get(proc[i+1]) != null) {
								tmp += vtable.get(proc[i+1]);
							}
							else {
								System.out.println(prt[1] + " unknown");
								break;
							}
						}
						else if (proc[i].equals("-")) {
							if (vtable.get(proc[i+1]) != null) {
								tmp -= vtable.get(proc[i+1]);
							}
							else {
								System.out.println(prt[1] + " unknown");
								break;
							}
						}
						else if (proc[i].equals("=")) {
							//need a different way get uses key, doesnt work backwards...System.out.println(vtable.get(tmp)); or unknown if getorDEFAULTS
							String ans = null;
							boolean exist = false;
							for (String key : vtable.keySet()) {
								if (vtable.get(key) != null) {
									if (vtable.get(key) == tmp) {
										ans = key;
										exist = true;
										break;
									}
								}
							}
							if (exist) {
								System.out.println(prt[1] + " " + ans);
							}
							else {
								System.out.println(prt[1] + " unknown");
								break;
							}
						}
					}
				}
				else {
					System.out.println(prt[1] + " unknown");
				}
			}
			else if (proc[0].equals("clear")) {
					vtable.clear();
			}
			else {
				System.out.println(prt[1] + " unknown");
			}
		}
	}
}