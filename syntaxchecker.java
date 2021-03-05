
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class syntaxchecker 
{

    public static void main(String[] args) 
    {

        Scanner i = new Scanner(System.in);
        i.close();
        Scanner j = new Scanner(System.in);
        j.close();
        int s = i.nextInt();
        String [] myArray = new String[s];
        for (int k =0 ; k<s ; k++)
        {
            //
            //
            //{
                myArray[k] = j.nextLine();
            
            //}    
        }
        //while(j.hasNextLine())
        //
                for (int k=0 ; k<s; k++)
                {            
                                try
                                {
                                    
                                    Pattern.compile(myArray[k]);
                                    System.out.println("Syntax is okay");
                                    
                                }
                                catch(PatternSyntaxException e )
                                {
                                    
                                    System.out.println("Syntax is not okay");
                                    
                                }
                                
                }
        //}
        
    }
    
}
