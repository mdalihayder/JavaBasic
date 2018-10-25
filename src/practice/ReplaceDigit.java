package practice;

public class ReplaceDigit {

		  public static void main(String[] argv) throws Exception {
			  String Test = "10,000.00";
			  String val1 = "$12,2223.00";
			  String val2=val1.replaceAll("\\$", "");
			  
				System.out.println(" Value is :" +Test);
			    System.out.println(" Value is :" +val2);
			  
			  String number1 = Test;
				Integer result1 = Integer.valueOf(number1);		
				System.out.println(result1);
				
				  String number2 = val2;
					Integer result2 = Integer.valueOf(number2);		
					System.out.println(result2);
			  
			System.out.println(" Value is :" +Test);
		    System.out.println(" Value is :" +val2);
		    
		 /*   if (Test<val2) {
		    	System.out.println("Passed");
				
			} else {

			}
			System.out.println("Failed");

		  }*/
		}
}


