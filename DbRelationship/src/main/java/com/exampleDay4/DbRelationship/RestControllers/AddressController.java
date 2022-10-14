package com.exampleDay4.DbRelationship.RestControllers;

import com.exampleDay4.DbRelationship.Repositories.AddressRepository;
import com.exampleDay4.DbRelationship.Repositories.EmployeeRepository;
import com.exampleDay4.DbRelationship.model.Address;
import com.exampleDay4.DbRelationship.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

public class AddressController {

    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/")
    public List<Address> addressList(){
        return addressRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Address> getAddress(@PathVariable("addressId") Long addressId){
        return addressRepository.findAllById(addressId);
    }

    @PostMapping("/")
    public Address saveAddress(@RequestBody Address address){
        return addressRepository.save(address);
    }

    @PutMapping("/")
    public Address updateEmployee(@RequestBody Address address{
        return addressRepository.save(address);
    }

    @DeleteMapping("/")
    public String deleteEmployee(@PathParam(value = "addressId")Long addressId){
        addressRepository.deleteById(addressId);
        return "Delete";
    }
    
}
