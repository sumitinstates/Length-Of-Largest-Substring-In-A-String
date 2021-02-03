package com.sumit;

import java.util.HashSet;
import java.util.Set;

public class LargestSubstring {
	
	public static int largestSubString(String s) {
		
		int n = s.length();
		int res = 0;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1; j<=n;j++) {
				if(checkUnique(s,i,j)) {
					res = Math.max(res, j-i);
				}
			}
		}
		return res;
	}

	private static boolean checkUnique(String s, int start, int end) {
		Set<Character> set = new HashSet<>();
		for(int i=start; i<end;i++) 
		{
			if(set.contains(s.charAt(i))) 
			{
				return false;
			}else {
				set.add(s.charAt(i));
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s1 = "abcabcbb";
		
		int largestSubStringLength = LargestSubstring.largestSubString(s1);
		
		System.out.println("Length of largest substring is " + largestSubStringLength);
	}

}
