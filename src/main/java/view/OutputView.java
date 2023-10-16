package view;

import java.util.List;

import model.Car;
import util.Util;

public class OutputView {
	public static void printRoundResult(List<Car> carList) {
		for(Car car : carList) {
			System.out.printf("%s : %s\n", car.getName(), car.getStatus());
		}
		System.out.println("");
	}
	
	public static void printWinners(List<Car> winners) {
		System.out.printf("최종 우승자 : %s", Util.winnerListToString(winners));
	}
}
