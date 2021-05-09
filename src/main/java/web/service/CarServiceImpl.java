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
	public List<Car> getCars(int carNumber){
		if(carNumber < carList.size() && carNumber >= 0)
			return carList.subList(0, carNumber);
		return getAllCars();
	}

	@Override
	public List<Car> getAllCars() {
		return carList;
	}
	
	
}
