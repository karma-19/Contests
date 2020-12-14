
/*AUTHOR : PRAVEEN VISHWAKARMA*/

import java.util.*;
import java.lang.*;
import java.io.*;
import javafx.util.Pair;



public class B_Balls_of_Steel
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
        test : while(t-->0){
            int n = s.nextInt();
            int k = s.nextInt();
            int[] xs = new int[n];
            int[] ys = new int[n];
            for(int i=0; i<n;i++){
                xs[i] = s.nextInt();
                ys[i] = s.nextInt();

            }

            outer : for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if((Math.abs(xs[i]-xs[j])+Math.abs(ys[i]-ys[j])) > k){
                        continue outer;
                    }
                    
                }
                System.out.println(1);
                    continue test;
                
            }
            System.out.println(-1);
        }
    }
}