package sbd.crudcar.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sbd.crudcar.entities.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

	//LOWER(CONCAT('^',:model,' %'))
	@Query("SELECT LOWER(car.modelo) FROM Car car WHERE id = 1")
	List<Car> findByModel(String model);

}
