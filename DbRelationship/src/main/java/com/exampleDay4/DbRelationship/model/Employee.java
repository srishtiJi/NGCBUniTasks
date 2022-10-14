package com.exampleDay4.DbRelationship.model;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String name;
    private Boolean paid;
    private Integer salary;
    @Enumerated
    private EmployeeType employeeType;
    @OneToOne(cascade=CascadeType.ALL)
    private Address address;

}
