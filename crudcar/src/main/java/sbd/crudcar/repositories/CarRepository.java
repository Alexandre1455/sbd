package sbd.crudcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sbd.crudcar.entities.Car;

public interface CarRepository extends JpaRepository<Car, Long> {

}
