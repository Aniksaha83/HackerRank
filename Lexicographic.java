public class Lexicographic {



    // Java program to find lexicographically largest and smallest 
// substrings of size k. 



	public static void getSmallestAndLargest(String s, int k) 
	{ 
		// Initialize min and max as first substring of size k 
        String currStr = s.substring(0, k); 
        System.out.println(s.substring(0, k));
		String lexMin = currStr; 
		String lexMax = currStr; 

		// Consider all remaining substrings. We consider 
		// every substring ending with index i. 
        for (int i = k; i < s.length(); i++) 
        { 
            //System.out.println(currStr.substring(1, k));
            //System.out.println(s.charAt(i));
            
            
            currStr = currStr.substring(1, k) + s.charAt(i); 
            //System.out.println(currStr);
            

			if (lexMax.compareTo(currStr) < 0)	 
                lexMax = currStr; 
                //System.out.println((lexMax.compareTo(currStr)));
			if (lexMin.compareTo(currStr) > 0) 
                lexMin = currStr;	
                //System.out.println((lexMin.compareTo(currStr)));		 
		} 
        
		System.out.println(lexMin); 
		System.out.println(lexMax); 
	} 

	// Driver Code 
	public static void main(String[] args) 
	{ 
		String str = "GeeksForGeeks"; 
		int k = 3; 
		getSmallestAndLargest(str, k); 
	} 
} 

    

