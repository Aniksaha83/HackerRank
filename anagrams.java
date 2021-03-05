
import java.util.Scanner;



public class anagrams {

    static boolean isAnagram(String a, String b) 
    {
        // Complete the function
        if(a.length() == b.length())
        {
            for (int i = 0; i < a.length(); i++) 
            {
                for(int j=0;j<b.length();j++)
                {
                    if(a.charAt(i) == b.charAt(j))
                    {
                        //b.deletecharAt(j);
                    }
                }
                
                
            }
            
            
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}