package in.attaullah.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.attaullah.entities.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
