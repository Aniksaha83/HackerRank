import java.util.Scanner;

public class subarray 
{
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        int len = a.nextInt();
        int sum = 0;
        int count = 0;
        int [] arr = new int[len];
        //a.close();
        
        for (int i =0;i<len;i++)
        {
            arr[i] = b.nextInt();
        }
        for (int i=0;i<len;i++)
        {
            for(int j=i+1 ;j<len;j++)
            {
                sum = arr[i] + arr[j];
                if (sum<0)
                {
                    count = count +1;
                }
            }
        }
        System.out.println(count);
        
    }

}
