package com.example.springboot.uploadcsv.mongodb.repository;

import com.example.springboot.uploadcsv.mongodb.document.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends MongoRepository<Employee, String>{

    List<Employee> findByNameContaining(String name);
}