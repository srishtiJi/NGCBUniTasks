package com.exampleDay4.DbRelationship.RestControllers;

import com.exampleDay4.DbRelationship.Repositories.AddressRepository;
import com.exampleDay4.DbRelationship.Repositories.EmployeeRepository;
import com.exampleDay4.DbRelationship.model.Address;
import com.exampleDay4.DbRelationship.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private EmployeeRepository employeeRepository;
    @GetMapping("/")
    public List<Employee> employeeList(){
        return employeeRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Employee> getEmployee(@PathVariable("id") Long empId){
        return employeeRepository.findAllById(empId);
    }

    @PostMapping("/")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @PutMapping("/")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeRepository.save(employee);
    }

    @DeleteMapping("/")
    public String deleteEmployee(@PathParam(value = "id")Long id){
        employeeRepository.deleteById(id);
        return "Delete";
    }
}
