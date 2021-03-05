import java.util.Scanner;

public class palindrome {
    
    public static void main(String[] args) 
    {
        String origin, reverse = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Hi Please enter the string to get the result:");
        origin = s.nextLine();

        for (int i = origin.length()-1 ; i>=0 ; i --)
        {
            reverse = reverse + origin.charAt(i);
            
        }

        System.out.println(reverse);
        if(reverse.equals(origin))
        {
            System.out.println("Yes it is a palindrome");
        }
        else
        {
            System.out.println("Not is a palindrome");
        }
        s.close();

    }
}
