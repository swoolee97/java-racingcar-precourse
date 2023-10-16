package util;

public class Validator {
	public static boolean validateName(String[] names) {
		for(String name : names) {
			if(name.length() > 5) {
				throw new IllegalArgumentException("[ERROR] : 이름은 5자 이하여야 합니다.");
			}
		}
		return true;
	}
}
