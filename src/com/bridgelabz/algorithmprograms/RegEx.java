package com.bridgelabz.algorithmprograms;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.bridgelabz.utilitypackage.Utility;

/**
 * @author Mayuresh Sunil Sonar
 * Purpose: Write a program to use RegEx
 */

public class RegEx {

	public static void main(String[] args) throws IOException {
		
		Utility utility = new Utility();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = scanner.next();

		String result="";
		String str = "Hello <<name>>, We have your full name as <<full name>> in our system. your contact "+
		                  "number is 91-xxxxxxxxxx. Please,let us know in case of any clarification "+
				                              "Thank you BridgeLabz XX/XX/XXXX.";
		
		ArrayList<String> arraylist = new ArrayList<String>();
		
		String s1 = utility.regEx(str,name);
		System.out.println(s1);
		
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/YYYY");
		Date date = new Date();
		
		Pattern p = Pattern.compile("<<name>>");
		Matcher match = p.matcher(str);
		
		while (match.find()) {
			result = str.replace(p.pattern(), name);
		}
		
	}

}
