package sbd.crudcar.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import sbd.crudcar.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
