package com.exampleDay4.DbRelationship.model;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Objects;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
private Long addressId;
    private Integer houseNo;
    private String locality;
    private String city, state, country;

    private Boolean isPermanent;

    @OneToOne
    private Employee employee;

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", houseNo=" + houseNo +
                ", locality='" + locality + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", isPermanent=" + isPermanent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;
        return Objects.equals(getAddressId(), address.getAddressId()) && Objects.equals(getHouseNo(), address.getHouseNo()) && Objects.equals(getLocality(), address.getLocality()) && Objects.equals(getCity(), address.getCity()) && Objects.equals(getState(), address.getState()) && Objects.equals(getCountry(), address.getCountry()) && Objects.equals(isPermanent, address.isPermanent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAddressId(), getHouseNo(), getLocality(), getCity(), getState(), getCountry(), isPermanent);
    }

    public Boolean getPermanent() {
        return isPermanent;
    }

    public void setPermanent(Boolean permanent) {
        isPermanent = permanent;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Integer getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(Integer houseNo) {
        this.houseNo = houseNo;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
