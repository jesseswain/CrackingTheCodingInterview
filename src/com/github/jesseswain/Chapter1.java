package com.github.jesseswain;

import java.util.HashSet;
import java.util.Set;

public class Chapter1 {
	public boolean isUnique(String str) {
		if (str == null) {
			return true;
		}
		Set<Character> chars = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (chars.contains(str.charAt(i))) {
				return false;
			} else {
				chars.add(str.charAt(i));
			}
		}
		return true;
	}

	public String reverse(String str) {
		if (str == null) {
			return null;
		}
		StringBuffer tempstr = new StringBuffer(str.length());
		for(int i = str.length()-1; i >= 0 ; i--){
			tempstr.append(str.charAt(i));
		}
		System.out.println(tempstr);
		return tempstr.toString();
	}
}
