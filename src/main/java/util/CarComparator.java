package util;

import java.util.Collections;
import java.util.List;

import model.Car;

public class CarComparator {
	public static List<Car> sortBydesc(List<Car> carList){
		Collections.sort(carList,(c1,c2)->c2.getPosition()-c1.getPosition());
		return carList;
	}
}
