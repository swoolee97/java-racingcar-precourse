package controller;

import java.util.ArrayList;
import java.util.List;

import model.Car;
import view.InputView;

public class RacingGame {
	private static List<Car> carList;
	
	public RacingGame() {
		carList = new ArrayList<>();
	}
	
	public static void play() {
		String[] carNames = InputView.readCarNames().split(",");
		for(String carName : carNames) {
			carList.add(Car.createCar(carName));
		}
		
	}
}
