//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String s;
            s = br.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
   
    String modify(String S)
    {
        String str = "";
        for(int i = 0 ; i < S.length() ; i++){
            if(S.charAt(i) != ' ' || S.charAt(i) != '\n' || S.charAt(i) != '\t'){
                str += S.charAt(i);
            }
        }
        return str;
    }
}