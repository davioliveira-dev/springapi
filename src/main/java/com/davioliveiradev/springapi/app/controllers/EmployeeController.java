package com.davioliveiradev.springapi.app.controllers;

import com.davioliveiradev.springapi.domain.Employee;
import com.davioliveiradev.springapi.infra.repositories.EmployeeRepository;
import com.davioliveiradev.springapi.infra.services.GetEmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        GetEmployeesService getEmployeesService = new GetEmployeesService(employeeRepository);

        return getEmployeesService.run();
    }
}
