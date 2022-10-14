package org.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Employe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String name;
    private String phone;
    private Integer eid;

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", eid=" + eid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employe employe)) return false;
        return Objects.equals(getName(), employe.getName()) && Objects.equals(getPhone(), employe.getPhone()) && Objects.equals(getEid(), employe.getEid());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPhone(), getEid());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }
}
