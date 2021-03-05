import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hashset {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        // System.out.println(pair_left);
        String[] pair_right = new String[t];
        // System.out.println(pair_right);

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        /*String x;
        //System.out.println(Arrays.toString(pair_left) + Arrays.toString(pair_right));
        //System.out.println(pair_left.length);
        for (int i = 0; i < pair_left.length; i++) {
            x = pair_left[i];
            System.out.println(x);
            System.out.println(Arrays.toString(pair_left));
        }*/
        s.close();

        HashSet<String> set = new HashSet(t);
        for (int i = 0; i < t; i++) {
            set.add(pair_left[i] + " " + pair_right[i]);
            System.out.println(set.size());
        // Write your code here
        //*/
    }
}
}