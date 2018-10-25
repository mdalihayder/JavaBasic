package practice;

import java.util.Random;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

public class GetLastFromString {
	
	private static Integer[] strRandomNumber;

	public static void main(String[] args) {
		
		GetStringLastValue("abcdef",6);
		CreateRandomNumber(3);
	}
	
	//Jar: https://commons.apache.org/proper/commons-lang/download_lang.cgi
	public static String GetStringLastValue(String myString, int strDigit) {
		
		System.out.println("Entering into GetStringLastValue()...");
		String strValue=null;
		
		try {
			if (myString != null && !myString.isEmpty()) {
				strValue=StringUtils.right(myString, strDigit);
				System.out.println("String value is : "+strValue);
				// whatever limit you might need
			}
			else {
				System.out.println("String value is null : "+strValue);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed GetStringLastValue()...");
		}
		System.out.println("Exiting from GetStringLastValue()...");
	    return strValue;
	}
	
	//CreateRandomNumber: This function will generate random number based on the given size. To call:	CreateRandomNumber(3);
	 public final static String CreateRandomNumber(long len) {
		 String tVal = null;
			try {
				if (len > 18)
				    throw new IllegalStateException("To many digits");
				long tLen = (long) Math.pow(10, len - 1) * 9;

				long number = (long) (Math.random() * tLen) + (long) Math.pow(10, len - 1) * 1;

				tVal = number + "";
				if (tVal.length() != len) {
				    throw new IllegalStateException("The random number '" + tVal + "' is not '" + len + "' digits");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		    System.out.println("Random number is : "+tVal);
		    return tVal;
		}
	
 
	
	
	
	
}
