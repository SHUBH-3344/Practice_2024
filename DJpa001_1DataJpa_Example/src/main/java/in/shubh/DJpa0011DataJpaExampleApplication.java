package in.shubh;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shubh.entity.Cricketers;
import in.shubh.repo.CricketersRepository;

@SpringBootApplication
public class DJpa0011DataJpaExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DJpa0011DataJpaExampleApplication.class, args);
		//context.getBean(CricketersRepository.class);
		
		CricketersRepository cricketersRepo = context.getBean(CricketersRepository.class);
		
//		Cricketers cr1 = new Cricketers();
//		cr1.setId(06);
//		cr1.setName("Sachin");
//		cr1.setJersyNo(10);
//		cr1.setRole("OpeningBatsman");
//		cr1.setIplTeamMember("MumbaiIndians");
//		
//		Cricketers cr2 = new Cricketers(02, 07, "Batsman", "MSD", "CSK" );
//		Cricketers cr3 = new Cricketers(03, 18, "Batsman", "Virat", "RCB" );
//		Cricketers cr4 = new Cricketers(04, 77, "Batsman", "Shubhaman", "GT" );
//		Cricketers cr5 = new Cricketers(05, 33, "Bowler", "Hardik_Pandya", "GT" );
//		
//		ArrayList<Cricketers>al = new ArrayList<>();
//		al.add(cr1);
//		al.add(cr2);
//		al.add(cr3);
//		al.add(cr4);
//		al.add(cr5);
//		cricketersRepo.save(cr1);
//		
//		boolean status = cricketersRepo.existsById(05);
//		System.out.println(status);
//		
//		
//		//cricketersRepo.deleteById(07);
//		if (cricketersRepo.existsById(06)) {
//			cricketersRepo.deleteById(06);
//			System.out.println("record deleted");
//		}
//		else {
//			System.out.println("No record found");
//		}
//		
		
		
		//cricketersRepo.saveAll(al);
		
		List<Cricketers> cricketers = cricketersRepo.getAllCricketers();
		cricketers.forEach( i -> System.out.println(i));
	}

}

