
public class StringLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(capitalize("e"));
	}
/*********************capitalize*******************
 * capitalizes first letter of String passed to method, 
 * lowercases the other lettters
 * */
	public static String capitalize(String word) {
		if(word == null) {
			return "";
		}
		String substrCap = word.substring(0, 1).toUpperCase() ;
		String substrLow = word.substring(1).toLowerCase();
		return substrCap + substrLow; 	
	}
	
	//public static String wheresWaldo (String phrase) {
		
	//}
	
	public static void firstThingsFirst (String a, String b) {
		char firstWordVal = a.charAt(0);
		char secondWordVal = b.charAt(0);
		int compareAB = Character.compare(firstWordVal, secondWordVal);
		
		if (compareAB >= 0) {
			System.out.println(a +" " + b );
		}else if (compareAB <0) {
			System.out.println(b + " " + a);
		}		
	}
	
	public static void reverse (String s) {
		for (int i = s.length()-1 ; i>=0; i--) {
			System.out.println(s.charAt(i));
		}
	}
	
	public static void letterize(String word) {
		for (int i = 0; i<= word.length(); i++) {
			System.out.println(word.charAt(i));
		}
	}
}
