import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class list 
{
    public static void main(String args[])
    {
        List<Integer> line = new ArrayList<Integer>();
        List<String> line1 = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for(int i=0;i<N;i++)
        {
            line.add(in.nextInt());
            
        }
        //System.out.println(line);
        int Q = in.nextInt();
        for(int i =0;i<Q;i++)
        {
            line1.add(in.next());
            if(line1.get(i).equals("Insert"))
            {
                int x = in.nextInt();
                int y = in.nextInt();
                line.add(x,y);
                //System.out.println(line);
            }
            else
            {   
                int x = in.nextInt();
                line.remove(x);
                //System.out.println(line);
            }
            //System.out.print(line);
        }
        for(int i=0;i<line.size();i++)
        {
            System.out.print(line.get(i).toString() + " ");
        }

        
    }
}
