package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Car;
import model.Referee;
import util.CarComparator;
import view.InputView;
import view.OutputView;

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
}
