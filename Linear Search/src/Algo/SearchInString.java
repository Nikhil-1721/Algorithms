package Algo;

public class SearchInString {
	
	static boolean stringSearch(String str, char key) {
		if (str.length()== 0) {
			return false;
		}
		
		// Converting the String into an Array in order to search
		//char[] arr = str.toCharArray();		
		
		for (int i = 0; i < str.length(); i++) {
			if (key == str.charAt(i)) {
				return true;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		String name = "Nikhil";
		char key = 'u';
		
		boolean result = stringSearch(name, key);
		
		System.out.println(result);
	}

}
