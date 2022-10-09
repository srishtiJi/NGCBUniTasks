package com.Day1.day1;

import java.util.Objects;

public class Person {
private Long id;
private String name;
private String code;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return getId().equals(person.getId()) && getName().equals(person.getName()) && getCode().equals(person.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getCode());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
