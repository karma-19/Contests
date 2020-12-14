
/*AUTHOR : PRAVEEN VISHWAKARMA*/

import java.util.*;
import java.lang.*;
import java.io.*;

public class A_Avoid_Trygub
{
    static class FastReader 
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new InputStreamReader(System.in)); 
        }
        String next()
        {
            while (st == null || !st.hasMoreElements())
            { 
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken(); 
        }
        int nextInt()
        {
            return Integer.parseInt(next());
        }
        long nextLong()
        {
            return Long.parseLong(next());
        }
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
        String nextLine()
        {
            String str = ""; 
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args)
    {
        FastReader s=new FastReader();
        int t = s.nextInt();
        while(t-->0){
            int n = s.nextInt();
            String str = s.nextLine();
            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+"");
            }
            System.out.println();
            

        }
    }
}