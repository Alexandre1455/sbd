package sbd.crudcar.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sbd.crudcar.dto.CarInsertDTO;
import sbd.crudcar.dto.CarReadDTO;
import sbd.crudcar.entities.Car;
import sbd.crudcar.repositories.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository repository;
	
	@Autowired
	private ModelMapper mapper;
	
	public void insert(CarInsertDTO car) {
		repository.save(new Car(car));
	}
	
	@Transactional(readOnly = true)
	public List<CarReadDTO> findAll() {
		List<Car> list = repository.findAll();
		List<CarReadDTO> listDTO = list.stream().map((car) -> new CarReadDTO(car)).collect(Collectors.toList()); 
		return listDTO;
	}
	
	@Transactional(readOnly = true)
	public CarReadDTO findById(Long id) throws NoSuchElementException { 
		return new CarReadDTO(repository.findById(id).get());
	}
	
	@Transactional(readOnly = true)
	public List<CarReadDTO> findByModel(String model) {
		List<Car> list = repository.findByModel(model);
		List<CarReadDTO> listDTO = list.stream().map((car) -> new CarReadDTO(car)).collect(Collectors.toList()); 
		return listDTO;
	}
	
	public void update(Long id, CarInsertDTO dto) throws NoSuchElementException {
		Car car = repository.findById(id).get();
		mapper.map(dto, car);
		repository.save(car);
	}
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
	
	
}