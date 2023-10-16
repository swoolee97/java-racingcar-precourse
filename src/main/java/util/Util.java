package util;

import java.util.List;

import model.Car;

public class Util {
	public static String winnerListToString(List<Car> winnerList) {
		StringBuilder sb = new StringBuilder();
		sb.append(winnerList.get(0).getName());
		for(int i=1; i<winnerList.size(); i++) {
			sb.append(", ").append(winnerList.get(i).getName());
		}
		return sb.toString();
	}
}
