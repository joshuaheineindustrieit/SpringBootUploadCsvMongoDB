package com.example.springboot.uploadcsv.mongodb.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import com.example.springboot.uploadcsv.mongodb.document.Employee;
import com.example.springboot.uploadcsv.mongodb.message.Response;
import com.example.springboot.uploadcsv.mongodb.repository.EmployeeRepository;
import com.example.springboot.uploadcsv.mongodb.service.CsvFileServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.data.mongodb.repository.MongoRepository;

@RestController
public class DownloadCsvRestApi {
	
	@Autowired
	CsvFileServices csvFileService;

	@GetMapping("/api/download/csv/")
	public void downloadFile(HttpServletResponse response) throws IOException {
		response.setContentType("text/csv");
		response.setHeader("Content-Disposition", "attachment; filename=employees.csv");
		csvFileService.loadFile(response.getWriter());
	}



}