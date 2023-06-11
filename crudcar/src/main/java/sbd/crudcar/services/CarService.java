package sbd.crudcar.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbd.crudcar.entities.Car;
import sbd.crudcar.repositories.CarRepository;

@Service
public class CarService {
	@Autowired
	private CarRepository carRepository;
	
	public Car create(Car car) {
		return carRepository.save(car);
	}
	
	public List<Car> readAll() {
		return carRepository.findAll();
	}
	
	public Optional<Car> readById(Long id) {
		return carRepository.findById(id);
	}
	
	public void deleteById(Long id) {
		carRepository.deleteById(id);
	}
}