package model;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private final String name;
    private int position = 0;
    private StringBuilder status;
    
    public Car(String name) {
        this.name = name;
        status = new StringBuilder();
    }

    public static Car createCar(String name) {
    	return new Car(name);
    }
    
    public void decideMove() {
    	if(Randoms.pickNumberInRange(1, 9) >= 4) {
    		position++;
    		status.append("-");
    	}
    }
    
    public int getPosition() {
    	return position;
    }
    
    public String getStatus() {
    	return status.toString();
    }
    
}
