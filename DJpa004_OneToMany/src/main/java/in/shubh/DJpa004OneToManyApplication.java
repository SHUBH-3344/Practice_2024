package in.shubh;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import in.shubh.entity.Address;
import in.shubh.entity.Employee;
import in.shubh.repository.EmpRepository;

@SpringBootApplication
public class DJpa004OneToManyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DJpa004OneToManyApplication.class, args);
		Employee e = new Employee();
		e.setEmpId(101);
		e.setEmpName("Ram");
		e.setEmpSalary(2181000.00);

		Address a1 = new Address();
		a1.setCity("Kop");
		a1.setState("MH");
		a1.setCountry("India");
		a1.setEmp(e);

		Address a2 = new Address();
		a2.setCity("Pune");
		a2.setState("MH");
		a2.setCountry("India");
		a2.setEmp(e);
		
		// setting addresses to emp
		List<Address> addrlist = Arrays.asList(a1, a2);
		e.setAddr(addrlist);
		
		EmpRepository empRepository = context.getBean(EmpRepository.class);
		empRepository.save(e);
		
		
	}

}
