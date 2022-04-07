
public class StringLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(capitalize("e"));
	}

	public static String capitalize(String word) {
		if(word == null) {
			return "";
		}
		String substrCap = word.substring(0, 1).toUpperCase() ;
		String substrLow = word.substring(1).toLowerCase();
		return substrCap + substrLow; 
		
	}
}
