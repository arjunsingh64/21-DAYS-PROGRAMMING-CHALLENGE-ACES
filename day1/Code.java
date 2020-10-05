
// Java implementation of the approach 
public class Code { 
  
    public static final int NUM = 31; 
  
    // Function to calculate the position 
    // of characters 
    static void positions(String str, int n) 
    { 
        for (int i = 0; i < n; i++) { 
  
            // Performing AND operation 
            // with number 31 
            System.out.print((str.charAt(i) & NUM) + ""); 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "Code_7It"; 
        int n = str.length(); 
        positions(str, n); 
    } 
} 

