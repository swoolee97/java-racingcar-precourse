package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import util.CarComparator;

public class Referee {
	public int max;
	public List<Car> carList;
	public List<Car> winnerList;
	
	public Referee(List<Car> carList) {
		this.max = carList.get(0).getPosition();
		this.carList = carList;
		winnerList = new ArrayList<>();
	}
	
	
	public List<Car> judgeWinners() {
		for(Car car : carList) {
			if(max == car.getPosition()) {
				winnerList.add(car);
				continue;
			}
			return winnerList;
		}
		return winnerList;
	}
	
	
}
