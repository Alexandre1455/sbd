package sbd.crudcar.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import sbd.crudcar.dto.CarInsertDTO;
import sbd.crudcar.dto.CarReadDTO;
import sbd.crudcar.services.CarService;

@RestController
@RequestMapping(value = "/cars")
public class CarController {
	
	@Autowired
	private CarService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void insert(@RequestBody CarInsertDTO car) {
		service.insert(car);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<CarReadDTO> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public CarReadDTO findById(@PathVariable("id") Long id) {
		try { return service.findById(id); }
		catch (NoSuchElementException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/model/{model}")
	@ResponseStatus(HttpStatus.OK)
	public List<CarReadDTO> findByModel(@PathVariable String model) {
		return service.findByModel(model);
	}
	
	@GetMapping("/year/{year}")
	@ResponseStatus(HttpStatus.OK)
	public List<CarReadDTO> findByYear(@PathVariable Integer year) {
		return service.findByYear(year);
	}
	
	@GetMapping("/daily-rate/{min}/{max}")
	@ResponseStatus(HttpStatus.OK)
	public List<CarReadDTO> findByDailyRate(@PathVariable Double min, @PathVariable Double max) {
		return service.findByDailyRate(min, max);
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@PathVariable("id") Long id, @RequestBody CarInsertDTO dto) {
		try { service.update(id, dto); }
		catch (NoSuchElementException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteById(@PathVariable("id") Long id) {
		service.deleteById(findById(id).getId());
	}
}