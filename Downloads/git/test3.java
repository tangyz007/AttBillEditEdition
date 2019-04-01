package test;

public class test3 {

//	Given a string, find the length of the longest substring without repeating characters.
//
//	Example 1:
//
//	Input: "abcabcbb"
//	Output: 3 
//	Explanation: The answer is "abc", with the length of 3. 
//	Example 2:
//
//	Input: "bbbbb"
//	Output: 1
//	Explanation: The answer is "b", with the length of 1.
//	Example 3:
//
//	Input: "pwwkew"
//	Output: 3
//	Explanation: The answer is "wke", with the length of 3. 
//	             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
	public static int lengthOfLongestSubstring(String s) {
		String temp =s;
		int maxNum=0;
		int tempNum=0;
		int i;
		for(i=0;i<s.length();i++) {
			
		for(int reversei=s.length();reversei>i;reversei--) {
			if(isUniqueString(temp.substring(i, reversei))) {
				System.out.println("the string examined is "+temp.substring(i, reversei));
				tempNum=temp.substring(i, reversei).length();
				if(maxNum<tempNum) {
					maxNum=tempNum;
				}
			}else {
				
			}
			
			
		}
		
		}
		return maxNum;
		
		//System.out.println(a[i]);
    } 
	
//	public static void lengthOfLongestSubstring(String s) {
//		
//		int head;
//		int temp;
//		int i;
//		s.
//			i=s.indexOf(a[head], head+1)-1;
//			while(i>head) {
//				
//				i--;
//				}
//			
//		
//		System.out.println(a[i]);
//    }
	public static boolean isUniqueString(String input) {
		
		char []list=new char[input.length()];
		list=input.toCharArray();
		for(int i=0;i<input.length();i++) {
			for(int k=i+1;k<input.length();k++) {
				if(list[i]==list[k]) {
					return false;
					
				}
			}
			
		}
		return true;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String t1="abcabcbb";
String t2 ="abc";
//System.out.println(t1.indexOf('d', 2));
System.out.println(lengthOfLongestSubstring(t1));
//System.out.println("SubString is "+t1.substring(0, 8));
//lengthOfLongestSubstring(t1);
	}

}
