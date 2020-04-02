using System;

public class Program {
    public static void Main() {
        string[] input = Console.ReadLine().Split("-");
        string ans = "";

        foreach (string word in input) {
            ans += word.ToCharArray()[0];
        }

        Console.WriteLine(ans);
    }
}
