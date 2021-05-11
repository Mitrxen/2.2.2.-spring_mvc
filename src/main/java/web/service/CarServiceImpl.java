package web.service;

import java.util.ArrayList;
import java.util.List;

import web.model.Car;

public class CarServiceImpl implements CarService{
	private static List<Car> carList = new ArrayList<>();
	
	public CarServiceImpl() {
		if(carList.size() == 0) {
			for(int i = 0; i < 5; ++i) {
				carList.add(new Car());
			}
		}
	}
	
	@Override
	public List<Car> getCars(String carNumber){
		if(carNumber == null || Integer.parseInt(carNumber) < 0 || Integer.parseInt(carNumber) > carList.size())
			return carList;
		else
			return carList.subList(0, Integer.parseInt(carNumber));
		
	}
	
}
