package in.shubh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.shubh.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
