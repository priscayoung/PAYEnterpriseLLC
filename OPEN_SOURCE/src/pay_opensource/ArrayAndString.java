package pay_opensource;

/**
 * This class contains implementation of open source code for
 * methods related to Arrays and Strings. 
 * @author regiepriscayoung
 * */

public class ArrayAndString {
	
	/**
	 * This method determines if a string has all unique characters. 
	 * @param string 
	 * @return boolean
	 * Test cases: ("aab");("abcdefg"); ("abcdefgabc");
	 * */
	public static boolean isUnique(String s) {
		java.util.HashSet<Character> uniqueChar = new java.util.HashSet<Character>();
		for(int k=0; k<s.length(); k++) {
			uniqueChar.add(s.charAt(k));
		}
		StringBuilder sb = new StringBuilder();
		for(Character c:uniqueChar)
			sb.append(c);
		if(sb.toString().equals(s))
			return true;
		else
			return false;
	}
	
	/**
	 * This method sorts a string and returns the same string in ascending order. 
	 * @param string 
	 * @return String
	 * Test cases: ("aab","bba");
	 * */
	public static String sort(String s) {
		char[] c = s.toCharArray();
		java.util.Arrays.sort(c);
		return new String(c);
	}
	
	/**
	 * This method determines if one string is a permutation of the other. 
	 * @param two strings 
	 * @return boolean
	 * Test cases: ("abcdefgabc","acbgfedcab"),("aab","bba");("abcdefgabc", "abcdefgabc");("abcdefg", "abcdefgabc");
	 * */
	public static boolean isPermutation(String s1, String s2) {
		if(s1.length()!=s2.length())
			return false;
	    if(s1.equals(s2))
			return true;
		return sort(s1).equals(sort(s2));
	}

	/**
	 * This method replace all spaces in a string with '%20'. 
	 * @param string
	 * @return string
	 * Test cases: "Hello World"; " Hello World "; "   ";
	 * */
	public static String urlify(String s) {
		StringBuilder sb = new StringBuilder();
	    for(Character c:s.toCharArray())
	    	if(c==' ') sb.append("%20");
	    	else sb.append(c);
		return sb.toString();
	}
	
	/**
	 * This method checks if a word is a palindrome. 
	 * @param string
	 * @return boolean
	 * Test cases: "Helleh"; "factcaf";
	 * */
	public static boolean palindrome(String s) {
		int middleIndex;
		boolean result = true;
		String lowerCaseString = s.toLowerCase();
		if (lowerCaseString.length()%2 ==0) {
			middleIndex= lowerCaseString.length()/2;
			for(int k=0; k<s.length()/2; k++) {
				if(lowerCaseString.charAt(middleIndex+k)!=lowerCaseString.charAt(middleIndex-k-1)) {
					result= false;
					break;
				}
			}
		}else {
			middleIndex= s.length()/2;
			for(int k=1; k<s.length()/2; k++) {
				if(lowerCaseString.charAt(middleIndex+k)!=lowerCaseString.charAt(middleIndex-k)) {
					result= false;
					break;
				}
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(ArrayAndString.palindrome("FACTCAF"));
		

	}

}
