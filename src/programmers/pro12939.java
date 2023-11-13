package programmers;

public class pro12939 {
	class Solution {
	    public String solution(String s) {
	        	   String[] k =  s.split(" ");
		   Integer[] a = new Integer[k.length];
		   int max = Integer.MIN_VALUE;
		   int min = Integer.MAX_VALUE;
		   for(int i = 0 ; i <k.length  ; i++) {
			   a[i] = Integer.valueOf(k[i]);
			   max = Math.max(a[i], max);
			   min = Math.min(a[i], min);
		   }
		  String answer = "";
		  answer = Integer.toString(min) + " " + Integer.toString(max);
			return answer;
		
	    }
	}
}
