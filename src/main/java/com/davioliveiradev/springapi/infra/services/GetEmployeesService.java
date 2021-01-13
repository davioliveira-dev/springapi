package com.davioliveiradev.springapi.infra.services;

import com.davioliveiradev.springapi.domain.Employee;
import com.davioliveiradev.springapi.infra.repositories.EmployeeRepository;

import java.util.List;

public class GetEmployeesService {


    private final EmployeeRepository repository;

    public GetEmployeesService(EmployeeRepository repository) {
        this.repository = repository;
    }

    public List<Employee> run() {
        return repository.findAll();
    }
}
