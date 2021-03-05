import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class bigintegar {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        String k = scanner.nextLine();
        scanner.close();
        BigInteger a = new BigInteger(n); 
        BigInteger b = new BigInteger(k);
                 
        BigInteger sum = a.add(b);
        BigInteger multiply = a.multiply(b);
        System.out.println(sum);
        System.out.println(multiply);
    }
}
