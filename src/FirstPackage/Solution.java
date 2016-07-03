package FirstPackage;
import java.io.*;
import java.util.*;


public class Solution {

    
	public static void main(String[] args) throws  NumberFormatException, IOException {
	       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	        
	        long N = Long.parseLong(in.readLine());
	        int n= (int)N;
	        @SuppressWarnings("unused")
			long [] arr= new long [n];
	        TreeMap <Long, Long> array = new TreeMap<Long, Long>();
	       
	        String line= in.readLine();
	         for (String numStr: line.split("\\s")){
	             long j = Long.parseLong(numStr);
	             if(array.containsKey(j)){
	                 long v = array.get(j);
	                 array.put(j, ++v);
	             }
	             else{
	                 array.put(j, 1L);
	             }
	        }
	        
	        int Q= Integer.parseInt(in.readLine());
	        line = in.readLine();
	        @SuppressWarnings("unused")
			StringBuilder answer = new StringBuilder("");
	        int a = 0;
	        long st = System.currentTimeMillis();

	        for(int i=0; i < 1000000; i++) {
	        	for (String numbStr: line.split("\\s+")){
	                a+= Long.parseLong(numbStr);
		            long sum=0;
		             Long [] keys = array.keySet().toArray(new Long[0]);
		             for (Long k : keys){
		                 long value = array.get(k);
		                 k+=a;
		                 sum+=Math.abs(k) * value;
		             }     
		             System.out.println(sum);
		           // sumUp(arr);
		        }	
	        	}

	        System.out.print("time to execute loop"+
	                             ((st - System.currentTimeMillis()) /1000));
	         
	        //System.out.print(answer);
	    }
}
