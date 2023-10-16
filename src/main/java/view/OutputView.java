package view;

import java.util.List;

import model.Car;

public class OutputView {
	public static void printRoundResult(List<Car> carList) {
		for(Car car : carList) {
			System.out.printf("%s : %s\n", car.getName(), car.getStatus());
		}
		System.out.println("");
	}
}
