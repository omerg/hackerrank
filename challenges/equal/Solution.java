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
            Integer nrOfCoworkers = in.nextInt();
            List<Integer> coWorkersCookieNr = new ArrayList<Integer>();
            for (int j = 0; j < nrOfCoworkers; j++) {
                coWorkersCookieNr.add(in.nextInt());
            }
            
            //sort list
            Collections.sort(coWorkersCookieNr);
                                   
            Integer requiredNrOfOperations = 0;
            Integer requiredNrOfOperations1 = 0;
            Integer requiredNrOfOperations2 = 0;
            Integer requiredNrOfOperations3 = 0;
            Integer firstCookieCount = coWorkersCookieNr.get(0);
            
            for (Integer lastCookieCount : coWorkersCookieNr) {
                
                Integer diffToLastNrOfCookies1 = lastCookieCount - firstCookieCount;
                Integer diffToLastNrOfCookies2 = diffToLastNrOfCookies1 + 1;
                Integer diffToLastNrOfCookies3 = diffToLastNrOfCookies1 + 2;
                    
                requiredNrOfOperations1 += diffToLastNrOfCookies1 / 5;
                diffToLastNrOfCookies1 = diffToLastNrOfCookies1 % 5;
                requiredNrOfOperations1 += diffToLastNrOfCookies1 / 2;
                diffToLastNrOfCookies1 = diffToLastNrOfCookies1 % 2;
                requiredNrOfOperations1 += diffToLastNrOfCookies1;
                
                requiredNrOfOperations2 += diffToLastNrOfCookies2 / 5;
                diffToLastNrOfCookies2 = diffToLastNrOfCookies2 % 5;
                requiredNrOfOperations2 += diffToLastNrOfCookies2 / 2;
                diffToLastNrOfCookies2 = diffToLastNrOfCookies2 % 2;
                requiredNrOfOperations2 += diffToLastNrOfCookies2;
                
                requiredNrOfOperations3 += diffToLastNrOfCookies3 / 5;
                diffToLastNrOfCookies3 = diffToLastNrOfCookies3 % 5;
                requiredNrOfOperations3 += diffToLastNrOfCookies3 / 2;
                diffToLastNrOfCookies3 = diffToLastNrOfCookies3 % 2;
                requiredNrOfOperations3 += diffToLastNrOfCookies3;

            } 
            
            requiredNrOfOperations = Math.min(Math.min(requiredNrOfOperations1, requiredNrOfOperations2), requiredNrOfOperations3);
            
            System.out.println(requiredNrOfOperations);
        }  
    }
}