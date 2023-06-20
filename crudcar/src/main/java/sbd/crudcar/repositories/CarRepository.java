package sbd.crudcar.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import sbd.crudcar.entities.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
	
	List<Car> findByModelContaining(String model);
	
	List<Car> findByYear(Integer year);
	
	List<Car> findByDailyRateBetween(Double min, Double max);
}
