package controller;

import java.util.ArrayList;
import java.util.List;

import model.Car;
import model.Referee;
import util.CarComparator;
import util.Validator;
import view.InputView;
import view.OutputView;

public class RacingGame {
	private List<Car> carList;
	private int tryNumber;
	
	public RacingGame() {
		tryNumber = 0;
		carList = new ArrayList<>();
	}

	public void play() {
		initializeCarList();
		initializeTryNumber();
		for(int i=0; i<tryNumber; i++) {
			for(Car car : carList) {
				car.decideMove();
			}
			OutputView.printRoundResult(carList);
		}
		CarComparator.sortBydesc(carList);
		Referee referee = new Referee(carList);
		List<Car> winners = referee.judgeWinners();
		OutputView.printWinners(winners);
	}
	
	private void initializeCarList() {
		while(true) {
			carList = new ArrayList<>();
			String[] carNames = InputView.readCarNames().split(",");
			try {
				Validator.validateName(carNames);
			}catch(IllegalArgumentException e) {
				System.out.println(e.toString());
				continue;
			}
			for(String carName : carNames) {
				carList.add(Car.createCar(carName));
			}
			break;
		}
	}
	
	private void initializeTryNumber() {
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
