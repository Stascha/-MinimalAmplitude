import java.util.*;

public class Main 
{	
    public static int  minimal_amplitude(int[] a, int K)
    {
        int[] array_without_K_consecutive_el = new int[a.length - K];
        int min_amp = 2147483647;
       
      
        
        for(int i = 0; i <= (a.length - K); i++)
        {
            int temp_min_amp;
            int min = 2147483647;
            int max = 0;
            
            int[] array1 = Arrays.copyOfRange(a, 0, i);
            int[] array2 = Arrays.copyOfRange(a, i + K, a.length);
            
            int aLen = array1.length;
            int bLen = array2.length;
           
            System.arraycopy(array1, 0, array_without_K_consecutive_el, 0, aLen);
            System.arraycopy(array2, 0, array_without_K_consecutive_el, aLen, bLen);
            
            
            for(int n : array_without_K_consecutive_el)
            {
                if(min > n)
                    min = n;
                    
                if(max < n)
                    max = n;
            }
           
            temp_min_amp = max - min;
           
            min_amp = temp_min_amp < min_amp ? temp_min_amp : min_amp;
            
            for(int n : array_without_K_consecutive_el)
                System.out.print(n + " ");
                
            System.out.println();
            System.out.print(temp_min_amp + " ");
            System.out.println();
            System.out.println();
          
        }
        
        return min_amp;
        				
   }

   public static void main(String args[])
   {
       int min;
       int[] a = {3, 1, 3, 9, 8, 3};
       int K = 4;
	
       min = minimal_amplitude(a, K);

       System.out.print( " Minimal amplitude that can be obtained after the removal of " + K + " consecutive elements from A = " + min);
		
       System.out.println();
       System.out.println();
       
       
       int[] b = {3, 5, 1, 3, 9, 8};
       K = 4;
	
       min = minimal_amplitude(b, K);

       System.out.print( " Minimal amplitude that can be obtained after the removal of " + K + " consecutive elements from A = " + min);
		
       System.out.println();
       System.out.println();
       
       
       int[] c = {5, 3, 6, 1, 3};
       K = 2;
	
       min = minimal_amplitude(c, K);

       System.out.print( " Minimal amplitude that can be obtained after the removal of " + K + " consecutive elements from A = " + min);
		
       System.out.println();

   }

}
