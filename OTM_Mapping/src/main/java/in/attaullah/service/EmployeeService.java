package in.attaullah.service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.attaullah.entities.Address;
import in.attaullah.entities.Employee;
import in.attaullah.repo.AddressRepo;
import in.attaullah.repo.EmpRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmpRepo empRepo;

	@Autowired
	private AddressRepo addrRepo;

	public void deleteEmp() {
		empRepo.deleteById(1);
	}

	public void getAddrData() {
		Optional<Address> findById = addrRepo.findById(1);
	}

	public void getEmpData() {
		Optional<Employee> findById = empRepo.findById(1);
	}

	public void saveEmpData() {

		Employee emp = new Employee();
		emp.setEmpName("John");
		emp.setSalary(20999.00);

		Address a1 = new Address();
		a1.setCity("KUN");
		a1.setState("BR");
		a1.setType("Present");
		a1.setEmp(emp); // setting emp to addr

		Address a2 = new Address();
		a2.setCity("DELHI");
		a2.setState("DELHI");
		a2.setType("Permanent");
		a2.setEmp(emp); // setting emp to addr

		List<Address> addrList = Arrays.asList(a1, a2);
		emp.setAddr(addrList); // setting addr list to emp

		empRepo.save(emp);

	}

}
