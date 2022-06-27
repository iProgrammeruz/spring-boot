package com.clean.code.springboot.service;

import com.clean.code.springboot.domain.Employee;
import com.clean.code.springboot.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Employee finfById(Long id){
        return employeeRepository.findById(id).get();
    }

    public List<Employee> findByName(String name){
        return employeeRepository.findByNameQueryNative(name);
    }

//    public List<Employee> findByNameAndlastName(String name, String lastname){
//        return employeeRepository.findByName(name);
//    }

    public List<Employee> findAllByParam(String name){
        return employeeRepository.findAllByLike(name);
    }

    public void delete(Long id){
        employeeRepository.deleteById(id);
    }
}
