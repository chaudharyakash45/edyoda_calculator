
import java.io.*;
import java.util.*;

public class Solution {
    public static boolean isPangram(String s) {
        boolean[] isInside = new boolean[26];
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                isInside[Character.toLowerCase(c)-'a'] = true;
            }
        }
        for (boolean b : isInside) {
            if (!b) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (isPangram(s)) System.out.println("pangram");
        else System.out.println("not pangram");
    }
}