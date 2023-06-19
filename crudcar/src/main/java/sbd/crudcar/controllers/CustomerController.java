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

import sbd.crudcar.dto.CustomerInsertDTO;
import sbd.crudcar.dto.CustomerReadDTO;
import sbd.crudcar.services.CustomerService;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void insert(@RequestBody CustomerInsertDTO dto) {
		service.insert(dto);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<CustomerReadDTO> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public CustomerReadDTO findById(@PathVariable("id") Long id) {
		try { return service.findById(id); }
		catch (NoSuchElementException e) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void update(@PathVariable("id") Long id, @RequestBody CustomerInsertDTO dto) {
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
