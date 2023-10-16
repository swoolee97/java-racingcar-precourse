package controller;

import java.util.ArrayList;
import java.util.List;

import model.Car;
import view.InputView;

public class RacingGame {
	private List<Car> carList;
	private int tryNumber;
	public RacingGame() {
		carList = new ArrayList<>();
		tryNumber = 0;
	}
	
	public void play() {
		String[] carNames = InputView.readCarNames().split(",");
		for(String carName : carNames) {
			carList.add(Car.createCar(carName));
		}
		tryNumber = InputView.readTryNumber();
	}
}
