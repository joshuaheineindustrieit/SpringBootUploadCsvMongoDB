package com.example.springboot.uploadcsv.mongodb.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.util.List;

import com.example.springboot.uploadcsv.mongodb.document.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.uploadcsv.mongodb.repository.EmployeeRepository;
import com.example.springboot.uploadcsv.mongodb.util.ApacheCommonsCsvUtil;

@Service
public class CsvFileServices {
	
	@Autowired
	EmployeeRepository employeeRepository;

	// Store Csv File's data to database
	public void store(InputStream file) {
		try {
			// Using ApacheCommons Csv Utils to parse CSV file
			List<Employee> lstEmployees = ApacheCommonsCsvUtil.parseCsvFile(file);

			// Using OpenCSV Utils to parse CSV file
			// List<Employee> lstEmployees = OpenCsvUtil.parseCsvFile(file);
			
			// Save employees to database
			employeeRepository.saveAll(lstEmployees);
		} catch(Exception e) {
			throw new RuntimeException("FAIL! -> message = " + e.getMessage());
		}
	}
	
	// Load Data to CSV File
    public void loadFile(Writer writer) throws IOException {
    	try {
        	List<Employee> employees = (List<Employee>) employeeRepository.findAll();
        	
        	// Using ApacheCommons Csv Utils to write Employee List objects to a Writer
             ApacheCommonsCsvUtil.employeesToCsv(writer, employees);
        	
        	// Using Open CSV Utils to write Employee List objects to a Employee
        	// OpenCsvUtil.employeesToCsv(writer, employees);
    	} catch(Exception e) {
    		throw new RuntimeException("Fail! -> Message = " + e.getMessage());
    	}
    }
}