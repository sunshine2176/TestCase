package com.david.s;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		testRe("0");
	}
	
	public static void testRe(String str){
		String regex = "^[1-9]*[1-9][0-9]*$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(str);
		System.out.println(m.matches());
	}

}
