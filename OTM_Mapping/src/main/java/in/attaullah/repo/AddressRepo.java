package in.attaullah.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.attaullah.entities.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
