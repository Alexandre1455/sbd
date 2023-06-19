package sbd.crudcar.services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sbd.crudcar.dto.CustomerInsertDTO;
import sbd.crudcar.dto.CustomerReadDTO;
import sbd.crudcar.entities.Customer;
import sbd.crudcar.repositories.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository repository;
	
	@Autowired ModelMapper mapper;
	
	public void insert(CustomerInsertDTO customer) {
		repository.save(new Customer(customer));
	}
	
	@Transactional(readOnly = true)
	public List<CustomerReadDTO> findAll() {
		List<Customer> list = repository.findAll();
		return list.stream().map((customer) -> new CustomerReadDTO(customer)).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public CustomerReadDTO findById(Long id) throws NoSuchElementException {
		return new CustomerReadDTO(repository.findById(id).get());
	}
	
	public void update(Long id, CustomerInsertDTO dto) throws NoSuchElementException {
		Customer customer = repository.findById(id).get();
		mapper.map(dto, customer);
		repository.save(customer);
	}
	
	public void deleteById(Long id) {
		repository.deleteById(id);
	}
}
