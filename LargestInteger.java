 

import java.util.Scanner;
import java.lang.*;
public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        
        int i;
        int arraySize = integers.length;
        int max = integers[0];
        
        for (i=1; i<integers.length; i++)
        if (integers[i] > max)
            max=integers[i];
  
    
        return max;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int i;
        int arraySize = integers.length;
        int max = integers[0];
        
        for (i=1; i<integers.length; i++)
        max = Math.max(integers[i],max);
        return max;
        
    }
}
