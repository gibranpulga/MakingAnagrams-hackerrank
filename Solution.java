import java.io.*;
import java.util.*;

public class Solution {

           	public Integer checkAnagram (String str1, String str2) {
		char[] arrayStr1 = str1. toCharArray();
		char[] arrayStr2 = str2.toCharArray();
		List<Character> listStr1 = new ArrayList<> ();
		List<Character> listStr2 = new ArrayList<> ();
		for (char cStr1: arrayStr1) {
			listStr1.add(new Character(cStr1));
		}
		for (char cStr2: arrayStr2) {
			listStr2.add(new Character(cStr2));
		}
		
		int matchesList1 = 0;
		for (int i=0; i<listStr1.size(); i++) {
			if (listStr2.contains(listStr1.get(i))) {
				listStr2.remove(listStr1.get(i));
				matchesList1++;
			}
		}

        return listStr1.size() - matchesList1 + listStr2.size();
	
    }
    
        public static void main(String[] args) {
        	try{
		BufferedReader br = 
                      new BufferedReader(new InputStreamReader(System.in));
			
        String str1 = br.readLine();
        String str2 = br.readLine();
        Solution s = new Solution();
        System.out.println (s.checkAnagram(str1, str2));
                
	}catch(IOException io){
		io.printStackTrace();
	}	
    }
}
