package in.attaullah;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.attaullah.service.EmployeeService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeService service = context.getBean(EmployeeService.class);

		service.saveEmpData();

		// service.getEmpData();

		// service.getAddrData();

		// service.deleteEmp();
	}
}
