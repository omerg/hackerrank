import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Integer T = in.nextInt();
        
        for (int i = 0; i < T; i++) {
            
            Integer N = in.nextInt();
            
            Integer sumEndingAtTop = null;
            Integer sumEndingAtBottom = null;            
            Integer lastInt = null;
            
            for (int j = 0; j < N; j++) {
                Integer t = in.nextInt();
                
                if (sumEndingAtTop == null) {                    
                    sumEndingAtTop = 0;
                    sumEndingAtBottom = 0;
                    lastInt = t;
                    continue;
                }
 
                Integer bottomAfterBottom = sumEndingAtBottom;
                Integer bottomAfterTop = sumEndingAtTop + lastInt - 1;
                Integer maxBottom = Math.max(bottomAfterTop, bottomAfterBottom);
                
                Integer topAfterBottom = sumEndingAtBottom + t - 1;
                Integer topAfterTop = Math.abs(sumEndingAtBottom + t - lastInt);
                Integer maxTop = Math.max(topAfterTop, topAfterBottom);

                sumEndingAtTop = maxTop;
                sumEndingAtBottom = maxBottom;
                
                lastInt = t;
            }
           
            System.out.println(Math.max(sumEndingAtTop, sumEndingAtBottom));
   
        }  
    }
}