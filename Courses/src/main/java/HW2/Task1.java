package HW2;

public class Task1 {
	public static void main(String[] args) {
		String x1 = "hello";
			String y1 = "hlleo";
			String z1 = "art";
			if (x1.length() != y1.length()) {
				System.out.println("false");
			 }else if (x1.length() != z1.length()) {
				 System.out.println("true");
					 return;
			 }
		 }
	public boolean permutation(String x1, String y1, String z1) {
		String x11 = new String("hello");
		String y11 = new String("hlleo");
		String z11 = new String("art");
		if (x11.length() !=y11.length()) {
			return false;
		}
		int[] letters = new int[256];
		char[] x11_array = x11.toCharArray();
		for (char c : x11_array) {
			letters[c]++;
		}
		for (int i = 0; i < y11.length(); i++) {
			int c = (int) y11.charAt(i);
			if (--letters[c] < 0) {
				return false;
			}
			for (int i1 = 0; i1 < z11.length(); i1++) {
				int c1 = (int) z11.charAt(i1);
				if (--letters[c1] < 0) {
					return false;
				}
		}
		return true;
		}
		return false;
	}
}