using System;
using System.Collections;

public class Program {
    public static void Main() {
        string[] input = Console.ReadLine().Split(" ");
        int N = Convert.ToInt32(input[0]) * 4;
        char B = input[1][0];
        int sum = 0;

        Hashtable D = new Hashtable() {
            {'A', 11},
            {'K', 4},
            {'Q', 3},
            {'J', 20},
            {'T', 10},
            {'9', 14},
            {'8', 0},
            {'7', 0}
        };

        Hashtable d = new Hashtable() {
            {'A', 11},
            {'K', 4},
            {'Q', 3},
            {'J', 2},
            {'T', 10},
            {'9', 0},
            {'8', 0},
            {'7', 0}
        };

        for (int i = 0; i < N; i++) {
            string str = Console.ReadLine();
            if (str[1] == B) {
                sum += (int)D[str[0]];
            } else {
                sum += (int)d[str[0]];
            }
        }

        Console.WriteLine(sum);
    }
}
