package net.finisgod.customerdemo.repository;

import net.finisgod.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
