package com.exampleDay4.DbRelationship.Repositories;

import com.exampleDay4.DbRelationship.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
