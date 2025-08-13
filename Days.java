package arrays;

public class Days {
	public static void main(String[] args) {
		String[] Days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
		String longestString = "";
		for (String day : Days) {
			if (longestString.length() < day.length()) {
				longestString = day;
			}
		}
		System.out.println(longestString);
		for (int i = Days.length - 1; i >= 0; i--) {
			System.out.println(Days[i]);
		}
	}
}
