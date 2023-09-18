package in.attaullah.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.attaullah.entities.Man;

public interface PersonRepo extends JpaRepository<Man, Integer>{

}
