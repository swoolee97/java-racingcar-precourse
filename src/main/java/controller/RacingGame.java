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
		while(true) {
			try {
				tryNumber = InputView.readTryNumber();
				break;
			}catch(IllegalArgumentException e) {
				System.out.println("[ERROR]: 시도 횟수는 숫자여야 한다.");
				continue;
			}
		}
	}
}
